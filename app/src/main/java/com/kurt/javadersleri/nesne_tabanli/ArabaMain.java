package com.kurt.javadersleri.nesne_tabanli;

public class ArabaMain {
    public static void main(String[] args) {
        //Nesne oluşturma
        Araba bmw = new Araba(); // new yeni nesne oluştuyoruz mantığında

        // Değer atama
        bmw.renk="Mavi";
        bmw.hiz=100;
        bmw.calisiyorMu=true; // her araba nesnesinin değeri farklı

        //Değer okuma
        System.out.println("----------------------------");
        System.out.println("Renk         : "+bmw.renk);
        System.out.println("Hız          : "+bmw.hiz);
        System.out.println("Çalışıyor Mu : "+bmw.calisiyorMu);

        //Yazdığmız Fonksiyon İle Değer Okuma
        bmw.bilgiAl();

        Araba sahin = new Araba();
        sahin.renk="Beyaz";
        sahin.hiz=0;
        sahin.calisiyorMu=false;

        System.out.println("----------------------------");
        System.out.println("Renk         : "+sahin.renk);
        System.out.println("Hız          : "+sahin.hiz);
        System.out.println("Çalışıyor Mu : "+sahin.calisiyorMu);

        sahin.bilgiAl();



    }
}
