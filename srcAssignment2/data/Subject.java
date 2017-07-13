//Richard Houth
//CS 356
package Assignment2.data;

/**
 *
 * @author richardhouth
 */
public interface Subject {

    public void register(Observer newObserver);

    public void unregister(Observer existingObserver);

    public void notifyObserver();
}
