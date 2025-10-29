package adapter;

import model.InstagramAPI;

public class InstagramAdapter implements SocialMediaAdapter {
    private InstagramAPI instagram;

    public InstagramAdapter(InstagramAPI instagram) {
        this.instagram = instagram;
    }

    @Override
    public void publish(String message) {
        instagram.post(message);
    }
}
