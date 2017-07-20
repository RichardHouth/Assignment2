//Richard Houth
//cs 356
package Assignment2.data;

import Assignment2.model.GroupComponent;
import Assignment2.model.User;

/**
 *
 * @author richardhouth
 */
public class ComponentVisitor implements Visitor {

    private int totalUsers = 0;
    private int totalGroups = 0;

    public int getTotalUsers() {
        return totalUsers;
    }

    public int getTotalGroups() {
        return totalGroups;
    }

    @Override
    public void visit(User user) {
        totalUsers += 1;
    }

    @Override
    public void visit(GroupComponent group) {
        totalGroups += 1;
    }
}
