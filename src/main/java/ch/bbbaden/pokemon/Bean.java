/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.bbbaden.pokemon;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Yannick
 */
@SessionScoped
@Named(value = "Bean")
public class Bean implements Serializable {

    private String image = "";
    private String url = "";
    private String augenfarbe = "";
    private String haarfarbe = "";
    private String text = "Deine Auswahl: ";

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getURL() {
        url = "resources/PBilder/" + haarfarbe + augenfarbe + image + ".png";
        return url;
    }

    public void setURL(String url) {
        this.url = url;
    }

    public String getAugFarbe() {
        return augenfarbe;
    }

    public void setAugFarbe(String augenfarbe) {
        this.augenfarbe = augenfarbe;
    }

    public String getHaarFarbe() {
        return haarfarbe;
    }

    public void setHaarFarbe(String haarfarbe) {
        this.haarfarbe = haarfarbe;
    }

    public String getText() {
        if ("h".equals(image)) {
            text += "helle Haut, ";
        } else if ("d".equals(image)){
            text += "dunkle Haut, ";
        }

        if ("g".equals(augenfarbe)) {
            text += "grüne Augen, ";
        } else if ("b".equals(augenfarbe)) {
            text += "blaue Augen, ";
        }

        if ("s".equals(haarfarbe)) {
            text += "schwarze Haare";
        } else if ("b".equals(haarfarbe)) {
            text += "blonde Haare";
        }
        
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
