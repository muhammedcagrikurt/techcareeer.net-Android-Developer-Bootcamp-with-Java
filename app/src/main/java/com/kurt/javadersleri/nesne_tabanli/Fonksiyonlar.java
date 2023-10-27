package com.kurt.javadersleri.nesne_tabanli;

public class Fonksiyonlar {
    // void : geri dönüş değeri olmayan
    // return : geri dönüş değeri olan
    // parametre

    //Void
    //çalıştırıldığı yere veri dönüşü yapmaz
    public void selamla1(){
        String sonuc = "Merhaba Ahmet";
        System.out.println(sonuc);
    }

    //Return
    //çalıştırıldığı yere veri dönüşü yapar
    public String selamla2(){
        String sonuc="Merhaba Ahmet";
        return sonuc;
    }

    //Parametre
    public void selamla3(String isim){
        String sonuc = "Merhaba "+isim;
        System.out.println(sonuc);
    }

    //overloading
    // aynı class içinde aynı fonksiyonu farklı şekilde kullanmak için
    public void carp(int sayi1,int sayi2){
        System.out.println("Çarpma : "+(sayi1*sayi2));
    }

    public void carp(double sayi1,double sayi2){
        System.out.println("Çarpma : "+(sayi1*sayi2));
    }

    public void carp(int sayi1,int sayi2,String isim){
        System.out.println("Çarpma : "+(sayi1*sayi2)+" İşem Yapan : "+isim);
    }



}
