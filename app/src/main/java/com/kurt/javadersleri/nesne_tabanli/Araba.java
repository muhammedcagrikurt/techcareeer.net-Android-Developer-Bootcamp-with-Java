package com.kurt.javadersleri.nesne_tabanli;

public class Araba {
    String renk; // araba sınıfı taslak olduğu için değerleri yok
    int hiz;
    boolean calisiyorMu;

    public void bilgiAl(){ //public her yerden erişilebilir demek
        // araba classından oluşturduğumuz her nesne bu fonksiyona ulaşabilir
        //this = Araba , bulunduğu class'ı temsil eder.
        // self (swift) = this
        System.out.println("----------------------------");
        System.out.println("Renk         : "+renk);
        System.out.println("Hız          : "+hiz);
        System.out.println("Çalışıyor Mu : "+calisiyorMu);
    }
}


