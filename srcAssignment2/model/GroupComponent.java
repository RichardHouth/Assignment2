//Richard Houth
//CS 356
package Assignment2.model;

import java.util.ArrayList;
import Assignment2.data.Visitor;

/**
 *
 * @author richardhouth
 */
public class GroupComponent extends Component {

    public GroupComponent(String name, GroupComponent parent) {
        this.name = name;
        this.parentComponent = parent;
        this.children = new ArrayList<Component>();
    }

    @Override
    public void displayInfo() {
        System.out.println("GroupComponent: " + this.name);
        if (!this.isLeaf()) {
            for (Component c : this.children) {
                c.displayInfo();
            }
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
