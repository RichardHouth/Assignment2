//Richard Houth
//CS 356
package Assignment2.model;

import javax.swing.JTree;
import javax.swing.tree.TreeNode;

/**
 *
 * @author richardhouth
 */
public class RootTree {

    private JTree tree;
    private TreeNode root;

    public RootTree() {
        // Create the root node
        Component root = new GroupComponent("Root", null);
        this.root = root;

        // Create the child nodes
        Component user1Node = new User("Rick", (GroupComponent) root);
        Component user2Node = new User("Carl", (GroupComponent) root);

        // Add the child nodes to the root node
        root.insert(user1Node);
        root.insert(user2Node);

        GroupComponent cpp = new GroupComponent("CPP", (GroupComponent) root);
        root.insert(cpp);

        cpp.insert(new User("Sabrina", (GroupComponent) cpp));
        cpp.insert(new User("Christa", (GroupComponent) cpp));

        // Create the tree by passing in the root node
        tree = new JTree(root);
    }

    public JTree getTree() {
        return tree;
    }

    public TreeNode getRoot() {
        return root;
    }

}
