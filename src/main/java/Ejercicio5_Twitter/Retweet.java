package Ejercicio5_Twitter;

import java.time.LocalDate;

public class Retweet extends Tweet {
    private Tweet retweetedTweet;

    public Retweet(LocalDate time, String message, UserAccount sender, Tweet retweetedTweet) {
        super(time, message, sender);
        this.retweetedTweet = retweetedTweet;
    }

    @Override
    public String toString() {
        return "Retweet{" +
                "retweetedTweet=" + retweetedTweet +
                "} " + super.toString();
    }
}