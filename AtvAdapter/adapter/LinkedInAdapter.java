package adapter;

import model.LinkedInAPI;

public class LinkedInAdapter implements SocialMediaAdapter {
    private LinkedInAPI linkedIn;

    public LinkedInAdapter(LinkedInAPI linkedIn) {
        this.linkedIn = linkedIn;
    }

    @Override
    public void publish(String message) {
        linkedIn.share(message);
    }
}
