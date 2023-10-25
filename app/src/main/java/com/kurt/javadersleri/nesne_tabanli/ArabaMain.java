package com.kurt.javadersleri.nesne_tabanli;

public class ArabaMain {
    public static void main(String[] args) {
        //Nesne oluşturma
        //Araba bmw = new Araba() // new yeni nesne oluştuyoruz mantığında
        Araba bmw = new Araba("Mavi",100,true); //Constructor ile nesne
        // oluşturduğumuzda değerde atadık

        // Değer atama
        //bmw.renk="Mavi";
        //bmw.hiz=100;
        //bmw.calisiyorMu=true; // her araba nesnesinin değeri farklı



        //Değer okuma
        System.out.println("----------------------------");
        System.out.println("Renk         : "+bmw.renk);
        System.out.println("Hız          : "+bmw.hiz);
        System.out.println("Çalışıyor Mu : "+bmw.calisiyorMu);

        // Yazdığımız Fonksiyon İle Değer Okuma
        bmw.bilgiAl();

        // Yazdığımız Fonksiyon İle Değer Değiştirmek
        bmw.durdur();
        bmw.bilgiAl();
        bmw.calistir();
        bmw.bilgiAl();

        // Yazdığımız Fonksiyon İle Dışardan Girilen Değer ile Değer Değiştirmek
        bmw.hizlan(40); // Her nesnenin değiştirilen değeri diğer nesnenin değerini etkilemiyor
        bmw.bilgiAl();
        bmw.yavasla(10);
        bmw.bilgiAl();

        //Araba sahin = new Araba()
        Araba sahin = new Araba("Beyaz",0,false);
        //sahin.renk="Beyaz";
        //sahin.hiz=0;
        //sahin.calisiyorMu=false;

        System.out.println("----------------------------");
        System.out.println("Renk         : "+sahin.renk);
        System.out.println("Hız          : "+sahin.hiz);
        System.out.println("Çalışıyor Mu : "+sahin.calisiyorMu);

        sahin.bilgiAl();
        sahin.calistir();
        sahin.bilgiAl();
        sahin.hizlan(60);
        sahin.bilgiAl();



    }
}
