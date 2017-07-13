//Richard Houth
//CS 356
package Assignment2.data;

import Assignment2.model.GroupComponent;
import Assignment2.model.User;

/**
 *
 * @author richardhouth
 */
public interface Visitor {

    public void visit(User user);

    public void visit(GroupComponent group);

}
