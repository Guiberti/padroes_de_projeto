package adapter;


import model.TikTokAPI;

public class TikTokAdapter implements SocialMediaAdapter {
    private TikTokAPI tikTok;

    public TikTokAdapter(TikTokAPI tikTok) {
        this.tikTok = tikTok;
    }

    @Override
    public void publish(String message) {
        tikTok.uploadVideo(message);
    }
}