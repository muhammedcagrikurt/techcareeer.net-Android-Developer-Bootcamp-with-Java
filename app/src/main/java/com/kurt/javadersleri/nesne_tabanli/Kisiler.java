package com.kurt.javadersleri.nesne_tabanli;

// Encapsulation
public class Kisiler {
    private String ad;

    public String getAd() { //Erişim
        return ad;
    }

    public void setAd(String ad) { //Atama
        this.ad = ad; //Shadowing
    }
}
