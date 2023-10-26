package com.kurt.javadersleri.odevler;

public class Odev2Main {
    public static void main(String[] args) {
        Odev2 o2 = new Odev2();
        double x = o2.soru1(10);
        System.out.println("Mil : "+x);
        System.out.println("-----------------");

        o2.soru2(17,13);
        System.out.println("---------------------");

        int faktoriyel = o2.soru3(5);
        System.out.println("Faktoriyel : "+faktoriyel);
        System.out.println("-----------------");

        o2.soru4();
        System.out.println("-----------------");

        double icaci= o2.soru5(10);
        System.out.println("İç Açı Toplamı : "+icaci);
        System.out.println("-----------------");

        int maas = o2.soru6(30);
        System.out.println("Maaş : "+maas);
        System.out.println("-----------------");

        int ucret = o2.soru7(5);
        System.out.println("Otopark Ücreti : "+ucret);
        System.out.println("-----------------");






    }
}
