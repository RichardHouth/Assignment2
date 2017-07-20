package Assignment2.data;

import Assignment2.model.User;
import Assignment2.model.Tweet;
import java.util.Set;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author richardhouth
 */
public interface UserObject {
    
    public static final long First_Creation = System.currentTimeMillis();
    public static List<String> usedIDs = new ArrayList<>(Arrays.asList("Root"));
    public String getID();
    public List<Tweet> getMessages();
    public String getMessagesAsString();
    public List<UserObject> getChildren();
    public boolean addNodeObject(UserObject o);
    public void addMessage(Tweet message);
    public void addFollower(User follower);
    public void addFollowingUser(User followingUser);
    public Set<User> getFollowers();
    public Set<User> getFollowingUsers();
    public String getFollowingUsersAsString();
    public List<User> getAllUsers();
    public DefaultMutableTreeNode getNode();
    public UserObject getRoot();
    public boolean isValid();
    public long getCreationTime();
    public long getUpdateTime();
    public void accept(Visitor vis);
    public String toString();
    
}
