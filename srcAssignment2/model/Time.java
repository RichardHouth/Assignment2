/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2.model;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Assignment2.model.User;
import Assignment2.data.Visitor;

/**
 *
 * @author richardhouth
 */
public class Time extends JPanel implements Observer {
    
    private JLabel lastUpdate;
    private JLabel creation;
    
    public Time(User user) {
        
        super(new GridLayout(2, 1));
        creation = new JLabel("Time created: " + new java.util.Date(user.getCreationTime()));
        lastUpdate = new JLabel("Last time updated: " + new java.util.Date(user.getLastUpdateTime()));
        add(creation);
        add(lastUpdate);
        user.addObserver(this);
         
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof User) {
            long tmp = ((User) arg).getLastUpdateTime();
            lastUpdate.setText("Last time updated: " + new java.util.Date(tmp)); 
        }
    }

    
}
