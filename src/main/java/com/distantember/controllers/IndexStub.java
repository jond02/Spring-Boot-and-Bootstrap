package com.distantember.controllers;

import com.distantember.model.HtmlArticle;
import com.distantember.model.HtmlIcon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jondann on 9/9/16.
 */
public class IndexStub {

    private static final List<HtmlArticle> ACTIVITIES = new ArrayList<HtmlArticle>() {{
        add(new HtmlArticle("Orienteering", "map.png",
                "Use the wind, sun, and moss on the trees to orient yourself. It's a great skill to have!"));
        add(new HtmlArticle("Rock Climbing", "pic.png",
                "Climbing is an exhilarating way to experience the outdoors."));
        add(new HtmlArticle("Backpacking", "backpack.png",
                "Grab your pack and hit the trail. You'll be happy that you did!"));
    }};

    private static final List<HtmlIcon> RANGES = new ArrayList<HtmlIcon>() {{
        add(new HtmlIcon("wasatch-range.html","range-1.png","Wasatch Range"));
        add(new HtmlIcon("mummy-range.html","range-2.png","Mummy Range"));
        add(new HtmlIcon("front-range.html","range-3.png","Front Range"));
        add(new HtmlIcon("cool-range.html","range-4.png","Cool Range"));
        add(new HtmlIcon("sweet-range.html","range-5.png","Sweet Range"));
    }};


    private static final List<HtmlArticle> ARTICLES= new ArrayList<HtmlArticle>() {{
        add(new HtmlArticle("Why I Went Into The Lake", "lake.jpg",
                "At the lake we like to hike for a long time. It is refreshing and offers a great place to swim after the long hike. Sometimes we go kayaking."));
        add(new HtmlArticle("A Huge Elk", "elk.jpg",
                "I like seeing Elk. They are one of the better ungulates. It would be nice to seea moose sometime, but they are hard to find with their heads under water!"));
        add(new HtmlArticle("So many penguins around this place!", "snowboarder.jpg",
                "When I go snowboarding I expect to see penguins. They are an invasive species, but they are so cute. You're not suppose to feed them, but I do all the time."));
    }};

    private static final List<HtmlIcon> ICONS = new ArrayList<HtmlIcon>() {{
        add(new HtmlIcon("downhill.html", "icon-downhill.png", "Downhill"));
        add(new HtmlIcon("snowboarding.html", "icon-snowboard.png", "Snowboarding"));
        add(new HtmlIcon("bobsled.html", "icon-bobsled.png", "Bobsled"));
        add(new HtmlIcon("cross-country.html", "icon-cross-country.png", "Cross Country"));
        add(new HtmlIcon("biathlon.html", "icon-biathlon.png", "Biathlon"));
    }};

    public static List<HtmlArticle> getACTIVITIES() {
        return ACTIVITIES;
    }

    public static List<HtmlIcon> getRANGES() {
        return RANGES;
    }

    public static List<HtmlArticle> getARTICLES() {
        return ARTICLES;
    }

    public static List<HtmlIcon> getICONS() {
        return ICONS;
    }
}
