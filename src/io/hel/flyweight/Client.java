package io.hel.flyweight;

/**
 * author: hel
 * date: 2021/1/2 22:34
 * description:
 */
public class Client {
    public static void main(String[] args) {
        WebsiteFactory factory = new WebsiteFactory();
        Website blogWebsite = factory.getWebsiteByType("blog");
        blogWebsite.use(new Manager("tom"));
        Website vlogWebsite = factory.getWebsiteByType("vlog");
        vlogWebsite.use(new Manager("jack"));
        vlogWebsite.use(new Manager("ben"));
    }
}
