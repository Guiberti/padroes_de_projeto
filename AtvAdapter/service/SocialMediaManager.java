package service;

import adapter.SocialMediaAdapter;

public class SocialMediaManager {
    private final SocialMediaAdapter adapter;

    public SocialMediaManager(SocialMediaAdapter adapter) {
        this.adapter = adapter;
    }

    public void share(String message) {
        adapter.publish(message);
    }
}
