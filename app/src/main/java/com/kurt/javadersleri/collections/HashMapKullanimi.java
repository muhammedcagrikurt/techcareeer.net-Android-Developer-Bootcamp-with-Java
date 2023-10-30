package com.kurt.javadersleri.collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapKullanimi {
    public static void main(String[] args) {
        // Hashmap : Swift (Dictionary)
        // Json veri modelini temsil eder , alt yapısı Hashmap
        // Object en üst sınıftır , Kotlin & Swift (Any)
        HashMap<Integer,String> iller = new HashMap<>(); // <key,value>

        //Veri ekleme
        iller.put(16,"BURSA");
        iller.put(34,"İSTANBUL");
        System.out.println(iller);

        //Güncelleme
        iller.put(16,"YENİ BURSA"); // BURSA yı YENİ BURSA yaptı
        System.out.println(iller);


        //Veri Okuma
        String il = iller.get(34);
        System.out.println("Sonuc : "+il);

        //Boyut
        System.out.println(iller.size());

        Set <Integer> anahtarlar = iller.keySet(); //keyset Set <Integer> türünde veri döndürdügü için
        //Set <Integer> türünde veriye atadık

        for (Integer a:anahtarlar) {
            System.out.println(a+" -> "+iller.get(a));
        }

        iller.remove(16);
        System.out.println(iller);

        iller.clear();
        System.out.println(iller);
    }
}
