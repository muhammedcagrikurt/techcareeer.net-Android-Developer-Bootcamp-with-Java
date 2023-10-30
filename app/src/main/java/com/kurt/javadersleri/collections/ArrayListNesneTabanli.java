package com.kurt.javadersleri.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListNesneTabanli {
    public static void main(String[] args) {
        Urunler u1 = new Urunler(1,"Telefon",23000);
        Urunler u2 = new Urunler(2,"Süpürge",10000);
        Urunler u3 = new Urunler(3,"Bilgisayar",34000);

        ArrayList<Urunler> urunlerListesi = new ArrayList<>();
        urunlerListesi.add(u1);
        urunlerListesi.add(u2);
        urunlerListesi.add(u3);

        for (Urunler u:urunlerListesi) {
            System.out.println("Id : "+u.getId()+" - Ad : "+u.getAd()+" - Fiyat : "+u.getFiyat()+" Tl");

        }

        System.out.println("------------Ad Artan--------------");
        Collections.sort(urunlerListesi,new Siralama1());

        for (Urunler u:urunlerListesi) {
            System.out.println("Id : "+u.getId()+" - Ad : "+u.getAd()+" - Fiyat : "+u.getFiyat()+" Tl");

        }

        System.out.println("------------Ad Azalan--------------");
        Collections.sort(urunlerListesi,new Siralama2());

        for (Urunler u:urunlerListesi) {
            System.out.println("Id : "+u.getId()+" - Ad : "+u.getAd()+" - Fiyat : "+u.getFiyat()+" Tl");

        }

        System.out.println("------------Fiyat Artan--------------");
        Collections.sort(urunlerListesi,new Siralama3());

        for (Urunler u:urunlerListesi) {
            System.out.println("Id : "+u.getId()+" - Ad : "+u.getAd()+" - Fiyat : "+u.getFiyat()+" Tl");

        }

        System.out.println("------------Fiyat Azalan--------------");
        Collections.sort(urunlerListesi,new Siralama4());

        for (Urunler u:urunlerListesi) {
            System.out.println("Id : "+u.getId()+" - Ad : "+u.getAd()+" - Fiyat : "+u.getFiyat()+" Tl");

        }

    }

    public static class Siralama1 implements Comparator<Urunler> { //inner class iç class

        @Override
        public int compare(Urunler urunler, Urunler t1) {
            return urunler.getAd().compareTo(t1.getAd());
        }
    }

    public static class Siralama2 implements Comparator<Urunler> { //inner class iç class

        @Override
        public int compare(Urunler urunler, Urunler t1) {
            return t1.getAd().compareTo(urunler.getAd());
        }
    }

    public static class Siralama3 implements Comparator<Urunler> { //inner class iç class

        @Override
        public int compare(Urunler urunler, Urunler t1) {
            // dönüşüm int den referans tipi olan Integer yaptık
            return new Integer(urunler.getFiyat()).compareTo(t1.getFiyat());
        }
    }

    public static class Siralama4 implements Comparator<Urunler> { //inner class iç class

        @Override
        public int compare(Urunler urunler, Urunler t1) {

            return new Integer(t1.getFiyat()).compareTo(urunler.getFiyat());
        }
    }


}
