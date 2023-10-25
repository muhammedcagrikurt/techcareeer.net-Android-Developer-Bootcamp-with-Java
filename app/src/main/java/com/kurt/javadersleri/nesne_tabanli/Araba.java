package com.kurt.javadersleri.nesne_tabanli;

public class Araba {
    String renk; // araba sınıfı taslak olduğu için değerleri yok
    int hiz;
    boolean calisiyorMu;

    public Araba() { //Constructor = init function
        // Classtan her nesne oluştuğunda Constructor oluşacaktır
        //Constructor sınıf ile aynı isime sahip olmalıdır
        //Boş Constructor
        System.out.println("Nesne Oluştu");
    }

    public Araba(String renk,int hiz,boolean calisiyorMu){
        //this = Araba , bulunduğu class'ı temsil eder.
        // this ile hangi değerin sışardan hangi değerin sınıftan olduğunu belirtik
        this.renk = renk; // Shadowing = Gölgeleme
        this.hiz = hiz;
        this.calisiyorMu = calisiyorMu;

    }
    public void calistir(){ // Side effect : bir methodun bulunduğu sınıfın özelliğini değiştirmesi
        calisiyorMu = true;
        hiz = 5;
    }
    public void durdur(){
        calisiyorMu = false;
        hiz = 0;
    }
    public void hizlan(int miktar){
        hiz = hiz + miktar;
    }
    public void yavasla(int miktar){
        hiz = hiz - miktar;
    }

    public void bilgiAl(){ //public her yerden erişilebilir demek
        // araba classından oluşturduğumuz her nesne bu fonksiyona ulaşabilir
        // self (swift) = this
        System.out.println("----------------------------");
        System.out.println("Renk         : "+renk);
        System.out.println("Hız          : "+hiz);
        System.out.println("Çalışıyor Mu : "+calisiyorMu);
    }
}


