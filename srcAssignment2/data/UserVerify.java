package Assignment2.data;
import java.util.ArrayList;
import java.util.List;
import Assignment2.model.User;
import Assignment2.model.Component;
import Assignment2.data.UserObject;
import Assignment2.model.GroupComponent;

/**
 *
 * @author richardhouth
 */
public class UserVerify implements Visitor {
    
    private List<UserObject> objects;
    
    public UserVerify() {
        objects = new ArrayList<>();
    }
    
    @Override
    public void visit(User user) {
        checkID(user);
    }

    @Override
    public void visit(GroupComponent group) {
        for (UserObject o : group.getChildren()) {
            if (o instanceof GroupComponent) {
                visit((GroupComponent) o);
            }
            checkID(o);
        }
    }

    private void checkID(UserObject o) {
        if (!o.isValid()) {
            objects.add(o);
        }
    }
    
    public List<UserObject> getInvalidObject() {
        return objects;
    }
    
    public String InvalidObjectAsString() {
        String s = (objects.isEmpty()) ? "All IDs are valid!" : "Invalid IDs:\n";
        for (UserObject o : objects) {
            s += o + "\n";
        }
        return s;
    }
    
    @Override
    public String toString() {
        return this.InvalidObjectAsString();
    }

    public void reset() {
        objects.clear();
    }
    
}
