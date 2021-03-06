//Richard Houth
//CS 356
package Assignment2.ui;

import java.awt.Frame;
import javax.swing.tree.DefaultTreeModel;
import Assignment2.model.Component;
import Assignment2.data.ComponentVisitor;
import Assignment2.data.TweetVisitor;
import Assignment2.model.GroupComponent;
import Assignment2.model.User;
import Assignment2.data.Visitor;

/**
 *
 * @author richardhouth
 */
public class Admin extends javax.swing.JFrame {

    public static Admin instance;

    private Admin() {
        initComponents();
    }

    //singleton
    public static Admin getInstance() {
        if (instance == null) {
            synchronized (Admin.class) {
                if (instance == null) {
                    instance = new Admin();
                }
            }
        }
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        createUserButton = new javax.swing.JButton();
        createGroupButton = new javax.swing.JButton();
        adminLabel = new javax.swing.JLabel();
        lMessage = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        groupLabel = new javax.swing.JLabel();
        userTextField = new javax.swing.JTextField();
        groupTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        seeder = new Assignment2.model.RootTree();
        componentTree = new javax.swing.JTree();
        doubleClickLabel = new javax.swing.JLabel();
        totalUsersButton = new javax.swing.JButton();
        totalTweetsButton = new javax.swing.JButton();
        positiveTweetsButton = new javax.swing.JButton();
        totalUsersField = new javax.swing.JTextField();
        totalGroupsField = new javax.swing.JTextField();
        totalGroupsButton = new javax.swing.JButton();
        totalTweetsField = new javax.swing.JTextField();
        positiveTweetsField = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createUserButton.setText(">>");
        createUserButton.setToolTipText("");
        createUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserButtonActionPerformed(evt);
            }
        });

        createGroupButton.setText(">>");
        createGroupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createGroupButtonActionPerformed(evt);
            }
        });

        adminLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adminLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminLabel.setText("Admin Control Panel");

        lMessage.setForeground(new java.awt.Color(255, 0, 0));
        lMessage.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        userLabel.setText("Enter user name:");

        groupLabel.setText("Enter group name:");

        // Call RootTreeSeeder to seed initial data to app
        javax.swing.tree.TreeNode rootNode = seeder.getRoot();
        componentTree.setModel(new javax.swing.tree.DefaultTreeModel(rootNode));
        jScrollPane1.setViewportView(componentTree);

        componentTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseClickedActionPerformed(evt);
            }
        });

        /*
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        componentTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(componentTree);
         */
        doubleClickLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        doubleClickLabel.setText(" Click on user for info");

        totalUsersButton.setText("Total users");
        totalUsersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalUsersButtonActionPerformed(evt);
            }
        });

        totalTweetsButton.setText("Total tweets");
        totalTweetsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTweetsButtonActionPerformed(evt);
            }
        });

        positiveTweetsButton.setText("Percent of positive tweets");
        positiveTweetsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positiveTweetsButtonActionPerformed(evt);
            }
        });

        totalGroupsButton.setText("Total groups");
        totalGroupsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalGroupsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(adminLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                                                                .addGap(71, 71, 71))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(userLabel)
                                                                        .addComponent(groupLabel))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(userTextField)
                                                                        .addComponent(groupTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(createUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(createGroupButton)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(totalGroupsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                                                        .addComponent(totalUsersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(totalGroupsField)
                                                                        .addComponent(totalUsersField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(41, 41, 41)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(positiveTweetsButton)
                                                                        .addComponent(totalTweetsButton))))
                                                .addGap(11, 11, 11)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(totalTweetsField)
                                                        .addComponent(positiveTweetsField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(doubleClickLabel)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 4, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(doubleClickLabel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(adminLabel)
                                                .addGap(26, 26, 26)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(createUserButton)
                                                        .addComponent(userLabel)
                                                        .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(createGroupButton)
                                                        .addComponent(groupLabel)
                                                        .addComponent(groupTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(27, 27, 27)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(totalUsersButton)
                                                        .addComponent(totalUsersField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(totalTweetsButton)
                                                        .addComponent(totalTweetsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(totalGroupsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(totalGroupsButton)
                                                        .addComponent(positiveTweetsButton)
                                                        .addComponent(positiveTweetsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //opens the user frame on mouse click
    private void mouseClickedActionPerformed(java.awt.event.MouseEvent evt) {
        if (evt.getClickCount() == 2) {
            Component node = (Component) componentTree.getLastSelectedPathComponent();
            if (node != null && node instanceof User) {
                // Open user frame
                Frame userFrame = new UserFrame((User) node);
            }
        }
    }

    //Creates a new user and adds them to the root tree
    private void createUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserButtonActionPerformed
        lMessage.setText("");
        DefaultTreeModel model = (DefaultTreeModel) componentTree.getModel();
        Component root = (GroupComponent) model.getRoot();
        Component selectedNode = (Component) componentTree.getLastSelectedPathComponent();
        String username = userTextField.getText().trim();

        if (username.equals("")) {
            lMessage.setText("You must enter an user name");
        } else {
            if (selectedNode != null) {
                if (selectedNode instanceof GroupComponent) {
                    Component newUser = new User(username, (GroupComponent) selectedNode);
                    System.out.println("New user created: " + username);

                    lMessage.setText("");
                    model.insertNodeInto(newUser, selectedNode, selectedNode.getChildCount());
                    model.reload(newUser);
                } else {
                    lMessage.setText("Add user to group");
                }
            } else {
                Component newUser = new User(username, (GroupComponent) root);
                System.out.println("New user created: " + username);
                root.insert(newUser);
                model.reload();
            }
        }
    }//GEN-LAST:event_createUserButtonActionPerformed

    //Create a new group and add it to the root tree
    private void createGroupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createGroupButtonActionPerformed
        lMessage.setText("");
        DefaultTreeModel model = (DefaultTreeModel) componentTree.getModel();
        Component root = (GroupComponent) model.getRoot();
        Component selectedNode = (Component) componentTree.getLastSelectedPathComponent();
        String groupName = groupTextField.getText();

        if (groupName.trim().equals("")) {
            lMessage.setText("You gotta enter a group name");
        } else {
            if (selectedNode != null) {
                if (selectedNode instanceof GroupComponent) {
                    Component newGroup = new GroupComponent(groupName, (GroupComponent) selectedNode);
                    System.out.println("New group created: " + groupName);

                    lMessage.setText("");
                    model.insertNodeInto(newGroup, selectedNode, selectedNode.getChildCount());
                    model.reload(newGroup);
                } else {
                    lMessage.setText("Groups can only be added inside a group");
                }
            } else {
                Component newGroup = new GroupComponent(groupName, (GroupComponent) root);
                System.out.println("New group created: " + groupName);
                root.insert(newGroup);
                model.reload();
            }
        }
    }//GEN-LAST:event_createGroupButtonActionPerformed

    //Get total number of positive tweets 
    private void positiveTweetsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positiveTweetsButtonActionPerformed
        try {
            lMessage.setText("");
            TweetVisitor tweetVisitor = (TweetVisitor) letVisitorTraverseTree(new TweetVisitor());
            positiveTweetsField.setText(String.valueOf(tweetVisitor.getPercentageOfPositiveTweets()));
        } catch (Exception e) {
            lMessage.setText(e.getMessage());
        }
    }//GEN-LAST:event_positiveTweetsButtonActionPerformed

    //Get total number of users 
    private void totalUsersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalUsersButtonActionPerformed
        ComponentVisitor componentVisitor = (ComponentVisitor) letVisitorTraverseTree(new ComponentVisitor());
        totalUsersField.setText(String.valueOf(componentVisitor.getTotalUsers()));
    }//GEN-LAST:event_totalUsersButtonActionPerformed

    // Get total number of groups
    private void totalGroupsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalGroupsButtonActionPerformed
        ComponentVisitor componentVisitor = (ComponentVisitor) letVisitorTraverseTree(new ComponentVisitor());
        totalGroupsField.setText(String.valueOf(componentVisitor.getTotalGroups()));
    }//GEN-LAST:event_totalGroupsButtonActionPerformed

    //Get total number of tweets 
    private void totalTweetsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTweetsButtonActionPerformed
        TweetVisitor tweetVisitor = (TweetVisitor) letVisitorTraverseTree(new TweetVisitor());
        totalTweetsField.setText(String.valueOf(tweetVisitor.getTotalTweets()));
    }//GEN-LAST:event_totalTweetsButtonActionPerformed

    private Visitor letVisitorTraverseTree(Visitor visitor) {
        DefaultTreeModel model = (DefaultTreeModel) componentTree.getModel();
        Component root = (GroupComponent) model.getRoot();
        Component.traverseTree(root, visitor);
        return visitor;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminLabel;
    private javax.swing.JTree componentTree;
    private Assignment2.model.RootTree seeder;
    private javax.swing.JButton createGroupButton;
    private javax.swing.JButton createUserButton;
    private javax.swing.JLabel doubleClickLabel;
    private javax.swing.JLabel groupLabel;
    private javax.swing.JTextField groupTextField;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lMessage;
    private javax.swing.JButton positiveTweetsButton;
    private javax.swing.JTextField positiveTweetsField;
    private javax.swing.JButton totalGroupsButton;
    private javax.swing.JTextField totalGroupsField;
    private javax.swing.JButton totalTweetsButton;
    private javax.swing.JTextField totalTweetsField;
    private javax.swing.JButton totalUsersButton;
    private javax.swing.JTextField totalUsersField;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables
}
