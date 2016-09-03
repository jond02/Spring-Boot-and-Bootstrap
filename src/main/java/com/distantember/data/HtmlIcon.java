package com.distantember.data;

/**
 * Created by jondann on 9/2/16.
 */
public class HtmlIcon {

    private String link;
    private String image;
    private String title;
    private String alt;

    public HtmlIcon(String link, String image, String title) {
        //alt isn't specified, use title as alt text
        this(link, image, title, title);
    }

    public HtmlIcon(String link, String image, String title, String alt) {
        this.link = link;
        this.image = image;
        this.title = title;
        this.alt = alt;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
