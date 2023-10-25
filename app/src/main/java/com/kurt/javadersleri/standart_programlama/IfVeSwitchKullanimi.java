package com.kurt.javadersleri.standart_programlama;

public class IfVeSwitchKullanimi {
    public static void main(String[] args) {
        int yas = 17;
        String isim = "Mehmet";

        if(yas >= 18){ // yas >= 18 true ise if bloğu içine girer
            System.out.println("Reşitsiniz");
        }
        else { // if bloğu şartı sağlanmazsa else bloğu içine girer
            System.out.println("Reşit değilsiniz");
        }

        if(isim == "Ahmet"){ // == : isim.equals("Ahmet") javanın eskiden kulladığmız yapısı
            System.out.println("Merhaba Ahmet");
        }
        else if (isim == "Mehmet"){ // if bloğu şartı sağlanmazsa buradaki şart sağlanıyormu diye
            // kontrol eder sağlanıyorsa bloğa girer
            System.out.println("Merhaba Mehmet");
        }
        else {
            System.out.println("Tanınmayan Kişi");
        }

        String ka = "admin";
        int s = 123456;

        if ( ka == "admin" && s==123456){
            System.out.println("Hoşgeldiniz");
        }
        else {
            System.out.println("Hatalı Giriş");
        }

        int sayi = 9;

        if( sayi == 9|| sayi == 10){
            System.out.println("Sayı 9 veya 10 dur");
        }
        else {
            System.out.println("Sayı 9 veya 10 değildir");
        }

        //Switch = Kotlin dilinde karşılığı When
        int gun = 9;

        switch (gun){
            case 1:
                System.out.println("Pazartesi");
                break; // çalışmanı burada durdur demek break eklemezsek diğer caselere
        // bakmaya devam eder
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default: // hiçbir case şartı sağlanmazsa default çalışır if yapısındaki else gibi
                System.out.println("Böyle bir gün yok");
        }













    }
}
