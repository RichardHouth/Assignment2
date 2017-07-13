//Richard Houth
//CS 356
package Assignment2.data;

import Assignment2.model.GroupComponent;
import Assignment2.model.Tweet;
import Assignment2.model.User;
import java.util.ArrayList;

/**
 *
 * @author richardhouth
 */
public class TweetVisitor implements Visitor {

    private int tweets = 0;
    private int positiveTweets = 0;

    public int getTotalTweets() {
        return tweets;
    }

    //if no tweets are found, print out 0
    public int getPercentageOfPositiveTweets() throws IllegalArgumentException {
        if (tweets == 0) {
            throw new IllegalArgumentException("No tweets brah. ");
        }
        return (int) Math.ceil(((double) positiveTweets / tweets) * 100);
    }

    @Override
    public void visit(User user) {
        ArrayList<Tweet> userTweets = user.getTweets();
        tweets += userTweets.size();

        for (Tweet t : userTweets) {
            if (t.isPositive()) {
                this.positiveTweets += 1;
            }
        }
    }

    @Override
    public void visit(GroupComponent group) {
    }
}
