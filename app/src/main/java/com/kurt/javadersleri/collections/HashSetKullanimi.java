package com.kurt.javadersleri.collections;

import java.util.HashSet;

public class HashSetKullanimi {
    public static void main(String[] args) {
        HashSet<String> meyveler = new HashSet<>(); //Hashsetin bir üst classı set
        // arraylist ise list

        //Veri ekleme
        meyveler.add("Elma");
        meyveler.add("Muz");
        meyveler.add("Kiraz");
        System.out.println(meyveler);

        meyveler.add("Amasya Elması"); //Elma dediğimizde ekli olduğu için eklemedi
        // ama Amasya Elması diyince ekledi
        System.out.println(meyveler);

        System.out.println(meyveler.size());
        System.out.println("İçeriyor mu : "+meyveler.contains("Kiraz"));
        //contains arraylisttede var

        for (String m:meyveler) {
            System.out.println("Sonuc : "+m);
        }

        meyveler.remove("Muz");
        System.out.println(meyveler);

        meyveler.clear();
        System.out.println(meyveler);
    }
}
