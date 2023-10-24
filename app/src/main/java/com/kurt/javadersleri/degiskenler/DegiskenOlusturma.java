package com.kurt.javadersleri.degiskenler;

public class DegiskenOlusturma {
    public static void main(String[] args) {
        String ogrenciAdi = "Ahmet"; // referans tip
        int ogrenciYas = 23;
        double ogrenciBoy = 1.78;
        char ogrenciBasHarf = 'A';
        boolean ogrenciDevamEdiyorMu = true;

        System.out.println(ogrenciAdi);
        System.out.println(ogrenciYas);
        System.out.println(ogrenciBoy);
        System.out.println(ogrenciBasHarf);
        System.out.println(ogrenciDevamEdiyorMu);

        int urun_id= 3416;
        String urun_adi = "Kol saati";
        int urun_adet = 100;
        double urun_fiyat = 149.99;
        String urun_tedarikci = "Rolex";

        System.out.println("Ürün İd : "+urun_id);
        System.out.println("Ürün Adı : "+urun_adi);
        System.out.println("Ürün Adet : "+urun_adet);
        System.out.println("Ürün Fiyat : "+urun_fiyat+" $");
        System.out.println("Ürün Tedarikçi : "+urun_tedarikci);

        // Sabit : Constant
        //final (java), let ( swift),val(kotlin,final-const(dart)
        int sayi = 10;
        System.out.println(sayi);
        sayi = 80;
        System.out.println(sayi);

        final int numara = 40;
        System.out.println(numara);
        // numara = 100; final olduğu için hata verir

        // Tür Dönüşüm - Type Casting
        //1. Sayısaldan Sayısala en zararlı
        //2. Satılasaldan Metine zararsız çok kullanılır
        //3. Metinden Sayısala orta zararlı çok kullanılır

        //-----1-----
        int i = 67;
        double d = 35.98;
        int sonuc1 = (int) d; //explicit açıklama yaptık parantez ile
        double sonuc2 = i; // unexplicit int double'dan küçük olduğu için hata vermedi dönüşürken

        System.out.println(sonuc1); //.98 kısmı silindi veri kaybı oldu tam sayı kısmını almak
        // için kullanılabilir
        System.out.println(sonuc2);

        //-----2-----
        String sonuc3 = String.valueOf(d);//35.98
        String sonuc4 = String.valueOf(i);//67
        System.out.println(sonuc3);
        System.out.println(sonuc4);

        //-----3-----
        String yazi1 = "89";
        String yazi2 = "43.91";

        int sonuc5 = Integer.parseInt(yazi1); //hangi tür ile işlem yapılacaksa onun parse methodu
        // kullanılacak
        double sonuc6 = Double.parseDouble(yazi2);
        System.out.println(sonuc5);
        System.out.println(sonuc6);
    }
}
