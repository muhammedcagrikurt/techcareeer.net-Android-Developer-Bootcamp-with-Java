package com.kurt.javadersleri.collections;

public class HataYakalama {
    public static void main(String[] args) {
        // 1 .Compile Error
        // kodlama yaparken yaptığımız uyarılar hatalar
        final int x = 10;
        // x = 90; burada veren hata compile hata

        //2 .Runtime Error ( Exception)
        // uygulama çalışırken  oluşan hatalar
        int a = 10;
        int b = 5;

        //System.out.println("Sonuç : "+(a/b));
        //System.out.println("İşlem bitti");
        //Exception in thread "main" java.lang.ArithmeticException: / by zero  bu satır hatayı
        //	at com.kurt.javadersleri.collections.HataYakalama.main(HataYakalama.java:15) bu satır
        //	hatanın olduğu yeri söyler


        //try-catch
        // try kısmında hata olursa catch kısmı çalışır

        try {
            System.out.println("Sonuç : "+(a/b));
            System.out.println("İşlem bitti");
        }catch (Exception e){

            System.out.println("İkinci Sayı sıfır olamaz");
        }
    }
}
