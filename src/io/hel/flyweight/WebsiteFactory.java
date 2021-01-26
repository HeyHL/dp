package io.hel.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * author: hel
 * date: 2021/1/2 22:31
 * description:
 */
public class WebsiteFactory {
    private Map<String, ConcreteWebsite> websiteCategories = new HashMap<>();

    public Website getWebsiteByType(String type) {
        if (! websiteCategories.containsKey(type)) {
            websiteCategories.put(type, new ConcreteWebsite(type));
        }
        return websiteCategories.get(type);
    }
}
