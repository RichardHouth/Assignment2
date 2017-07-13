//Richard Houth
//CS 356
package Assignment2.model;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;
import Assignment2.data.Observer;
import Assignment2.data.Subject;
import Assignment2.data.Visitable;
import Assignment2.data.Visitor;

/**
 *
 * @author richardhouth
 */
public abstract class Component implements MutableTreeNode, Subject, Visitable {

    protected String name;
    protected GroupComponent parentComponent = null;
    protected List<Component> children = null;
    protected ArrayList<Observer> observers;

    public Component() {
        observers = new ArrayList<Observer>();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public abstract void displayInfo();

    public void insert(MutableTreeNode child) {
        if (this.getAllowsChildren()) {
            this.children.add((Component) child);
        }
    }

    public GroupComponent getRoot() {
        GroupComponent parent = (GroupComponent) this.getParent();
        if (parent == null) {
            return (GroupComponent) this;
        }
        return parent.getRoot();
    }

    // method to traverse tree and count total number of components
    public static void traverseTree(Component component, Visitor v) {
        component.accept(v);
        if (!component.isLeaf()) {
            for (Component c : component.children) {
                traverseTree(c, v);
            }
        }
    }

    //Observer pattern
    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
        System.out.println("New observer added to component " + this.name);
    }

    @Override
    public void unregister(Observer existingObserver) {
        observers.remove(existingObserver);
        System.out.println("Observer removed from component " + this.name);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(this);
        }
        System.out.println("Observers from component " + this.name + " have been notified");
    }

    //Component implements MutableTreeNode so it can be used and displayed in the Tree view     
    @Override
    public void insert(MutableTreeNode child, int i) {
        if (this.getAllowsChildren()) {
            this.children.add(i, (Component) child);
        }
    }

    @Override
    public void remove(int index) {
        if (!this.isLeaf()) {
            this.children.remove(index);
        }
    }

    @Override
    public void remove(MutableTreeNode node) {
        if (!this.isLeaf()) {
            this.children.remove((Component) node);
        }
    }

    @Override
    public void setUserObject(Object object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeFromParent() {
        this.parentComponent.children.remove(this);
    }

    @Override
    public void setParent(MutableTreeNode newParent) {
        this.parentComponent = (GroupComponent) newParent;
    }

    @Override
    public TreeNode getChildAt(int childIndex) {
        return this.isLeaf() ? null : this.children.get(childIndex);
    }

    @Override
    public int getChildCount() {
        return this.isLeaf() ? 0 : this.children.size();
    }

    @Override
    public TreeNode getParent() {
        return this.parentComponent;
    }

    @Override
    public int getIndex(TreeNode node) {
        return -1;
    }

    @Override
    public boolean getAllowsChildren() {
        return (!(this instanceof User));
    }

    @Override
    public boolean isLeaf() {
        return this.children == null;
    }

    @Override
    public Enumeration children() {
        return this.isLeaf() ? null : (Enumeration) this.children;
    }
}
