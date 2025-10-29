import adapter.InstagramAdapter;
import adapter.LinkedInAdapter;
import adapter.TikTokAdapter;
import adapter.TwitterAdapter;
import model.InstagramAPI;
import model.LinkedInAPI;
import model.TikTokAPI;
import model.TwitterAPI;
import service.SocialMediaManager;

public class Main {
    public static void main(String[] args) {

        SocialMediaManager twitter = new SocialMediaManager(new TwitterAdapter(new TwitterAPI()));
        twitter.share("Lançando nosso novo produto!");

        SocialMediaManager instagram = new SocialMediaManager(new InstagramAdapter(new InstagramAPI()));
        instagram.share("Confira nosso novo post com dicas de produtividade!");

        SocialMediaManager linkedin = new SocialMediaManager(new LinkedInAdapter(new LinkedInAPI()));
        linkedin.share("Conectando profissionais e ideias!");

        SocialMediaManager tiktok = new SocialMediaManager(new TikTokAdapter(new TikTokAPI()));
        tiktok.share("Novo vídeo no ar!");
    }
}
