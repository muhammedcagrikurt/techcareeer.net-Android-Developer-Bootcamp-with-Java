package com.kurt.javadersleri.nesne_tabanli;

public class KisilerMain {
    public static void main(String[] args) {
        Kisiler kisi = new Kisiler();
        // Atama
        //kisi.ad = "Ahmet";
        kisi.setAd("Ahmet");

        //Erişim
        //System.out.println(kisi.ad);
        System.out.println(kisi.getAd());



    }
}
