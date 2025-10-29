package adapter;

import model.TwitterAPI;

public class TwitterAdapter implements SocialMediaAdapter {
    private TwitterAPI twitter;

    public TwitterAdapter(TwitterAPI twitter) {
        this.twitter = twitter;
    }

    @Override
    public void publish(String message) {
        twitter.tweet(message);
    }
}
