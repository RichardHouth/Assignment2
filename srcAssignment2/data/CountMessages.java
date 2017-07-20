/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2.data;
import Assignment2.model.User;
import Assignment2.data.UserObject;
import Assignment2.model.GroupComponent;
import Assignment2.model.Tweet;
/**
 *
 * @author richardhouth
 */
public class CountMessages implements Visitor {
    
     private int count;

    @Override
    public void visit(User user) {
        count += user.getMessage().size();
    }

    @Override
    public void visit(GroupComponent group) {
        for (UserObject o : group.getChildren()) {
            if (o instanceof User) {
                visit((User) o);
            }
            else if (o instanceof GroupComponent) {
                visit((GroupComponent) o);
            }
        }
    }
    
    public int getCount() {
        return count;
    }
    
    @Override
    public String toString() {
        return "Count: " + this.getCount();
    }

    public void reset() {
        count = 0;
    }
    
}