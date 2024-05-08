package Ejercicio5_Twitter;

import java.util.ArrayList;
import java.util.List;

public class UserAccount {
    private String alias;
    private Email email;
    private List<Tweet> tweets;
    private List<UserAccount> followers;
    private List<UserAccount> following;
    private List<Tweet> timeline;
    private List<String> activityLog;

    public UserAccount(String alias, Email email) {
        this.alias = alias;
        this.email = email;
        this.tweets = new ArrayList<>();
        this.followers = new ArrayList<>();
        this.following = new ArrayList<>();
        this.timeline = new ArrayList<>();
        this.activityLog = new ArrayList<>();
    }

    public void follow(UserAccount user) {
        if (following.contains(user)) {
            throw new IllegalArgumentException("Ya estás siguiendo a " + user.alias);
        }
        following.add(user);
        user.addFollower(this);
    }

    private void addFollower(UserAccount user) {
        if (!followers.contains(user)) {
            followers.add(user);
        }
    }

    public List<UserAccount> getFollowers() {
        return followers;
    }

    public void tweet(Tweet tweet) {
        tweet.setSender(this);
        tweets.add(tweet);
        for (UserAccount follower : followers) {
            follower.timeline.add(tweet);
        }
    }

    public void sendDirectMessage(DirectMessage dm) {
        dm.setSender(this);
        tweets.add(dm);
        dm.getReceiver().getTimeline().add(dm);
    }

    public List<Tweet> getTimeline() {
        return timeline;
    }


    public List<String> getActivityLog() {
        return activityLog;
    }

    public String getAlias() {
        return alias;
    }

    // Getters and setters omitted for brevity
}