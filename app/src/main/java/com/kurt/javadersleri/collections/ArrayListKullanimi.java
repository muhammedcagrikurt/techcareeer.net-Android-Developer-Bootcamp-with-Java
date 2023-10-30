package com.kurt.javadersleri.collections;

import java.util.ArrayList;

public class ArrayListKullanimi {
    public static void main(String[] args) {
        ArrayList<String> meyveler = new ArrayList<>(); //<> içine çalışak istediğimiz türü
        // yazıyoruz

        //Veri ekleme
        meyveler.add("Muz"); // 0. index
        meyveler.add("Elma"); // 1. index
        meyveler.add("Kiraz"); // 2. index
        System.out.println(meyveler);

        //Güncelleme
        meyveler.set(1,"Yeni Elma");
        System.out.println(meyveler);

        //Insert
        meyveler.add(1,"Portakal"); // istediğimz indexse ekleme yaptırdık diğerleri
        //sağa kaydı
        System.out.println(meyveler);

        //Okuma
        String meyve = meyveler.get(3); // girdiğimiz indexteki değeri verdi
        System.out.println("Sonuç : "+meyve);

        ///Boyut
        System.out.println("Boyut : "+meyveler.size());

        //For each
        for(String m:meyveler){ // meyvelerin her bir elemanını sırala m ye atıyor her yeni
            // döngüde sıradaki elemnı atıyor
            System.out.println("Sonuc : "+m);
        }

        //0,1,2,3
        for(int i=0;i< meyveler.size();i++){
            System.out.println(i+". -> "+meyveler.get(i));
        }

        meyveler.remove(2); // index tabanlı silmek , en doğru yöntem?
        System.out.println(meyveler);

        meyveler.clear();
        System.out.println(meyveler);

    }
}
