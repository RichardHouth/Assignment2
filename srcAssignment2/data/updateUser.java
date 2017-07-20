/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2.data;
import Assignment2.model.GroupComponent;
import Assignment2.model.User;
/**
 *
 * @author richardhouth
 */
public class updateUser implements Visitor {
    
    private User lastUser;
    
    public void visitUser(User user) {
        if (lastUser == null) {
            lastUser = user;
        }
        else {
            if (user.getLastUpdateTime() > lastUser.getLastUpdateTime()) {
                lastUser = user;
            }
        }
    }

    public void visit(GroupComponent group) {
        for (UserObject o : group.getChildren()) {
            if (o instanceof User) {
                visitUser((User) o);
            }
            else {
                visit((GroupComponent) o);
            }
        }
    }
    
    public User getLastUpdatedUser() {
        return lastUser;
    }
    
    @Override
    public String toString() {
        return this.lastUser + ", last updated at: " 
                + new java.util.Date(lastUser.getLastUpdateTime());
    }

    public void reset() {
        lastUser = null;
    }
    
}
