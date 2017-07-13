//Richard Houth
//CS 356
package Assignment2.model;

/**
 *
 * @author richardhouth
 */
public class Tweet {

    private String message;
    private boolean isPositive = false;

    public Tweet(String message) {
        this.message = message;
        checkIfPositive();
    }

    public String getMessage() {
        return this.message;
    }

    public boolean isPositive() {
        return isPositive;
    }

    //If a tweeted word is positive, mark as positive tweet.
    private void checkIfPositive() {
        String[] positiveWords = {"good", "great", "excellent", "yes", "bro", "delightful", "awesome", "cool", "affirmative"};
        for (String word : positiveWords) {
            if (message.toLowerCase().contains(word)) {
                this.isPositive = true;
                return;
            }
        }
    }
}
