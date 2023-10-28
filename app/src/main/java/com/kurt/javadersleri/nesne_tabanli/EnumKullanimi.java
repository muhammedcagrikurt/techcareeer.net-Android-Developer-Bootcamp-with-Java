package com.kurt.javadersleri.nesne_tabanli;

public class EnumKullanimi {
    public static void main(String[] args) {
        // static fonksiyon içinde kullanacağımız başka fonksiyonda static olmalı
        ucretHesapla(KonserveBoyut.BUYUK,150);
    }

    public  static void ucretHesapla(KonserveBoyut boyut,int adet){
        switch (boyut){
            case KUCUK:
                System.out.println("Ücret : "+(adet*24+" ₺"));
                break;
            case ORTA:
                System.out.println("Ücret : "+(adet*37+" ₺"));
                break;
            case BUYUK:
                System.out.println("Ücret : "+(adet*76+" ₺"));
                break;
        }
    }
}
