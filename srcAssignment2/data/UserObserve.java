//Richard Houth
//CS 356
package Assignment2.data;

import Assignment2.model.Component;

/**
 *
 * @author richardhouth
 */
public class UserObserve implements Observer {

    private Subject user;

    public UserObserve(Subject subjectUser) {
        this.user = subjectUser;
        subjectUser.register(this);
    }

    @Override
    public void update(Component component) {
        this.user = component;
    }
}
