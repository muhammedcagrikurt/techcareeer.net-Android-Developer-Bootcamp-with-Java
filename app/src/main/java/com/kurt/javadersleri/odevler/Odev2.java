package com.kurt.javadersleri.odevler;

public class Odev2 {

    public Double soru1(double km){

        return km*0.621;
    }

    public void soru2(int kenar1, int kenar2){
        System.out.println("Diktörge'nin Alanı : "+(kenar1*kenar2));
    }

    public int soru3(int faktoriyel){
        if(faktoriyel==0){
            return 1;
        }
        return faktoriyel*soru3(faktoriyel-1);
    }

    public int soru4(String kelime){
        int adet =0;
        for (int i=0;i<kelime.length();i++){
            if (kelime.charAt(i)=='e'){ //charAt string içindeki belirli bir pozisyondaki
                // karakteri almak için kullanılan bir metot.
                adet++;
            }
        }
        return adet;
    }

    public double soru5(double kenarSayisi){
        return (((kenarSayisi-2)*180)/kenarSayisi);
    }

    public int soru6(int gunSayisi){
       int calismaUcreti=0,calismaSuresi=0;
        calismaSuresi=gunSayisi*8;
       if(calismaSuresi>150){
            calismaUcreti=(150*40)+((calismaSuresi-150)*80);
       }
       else{
           calismaUcreti=calismaSuresi*40;
       }
        return calismaUcreti;
    }

    public int soru7(int sure){
        int ucret=0;
        if(sure>1){
            ucret+=50;
            for (int i=1;i<sure;i++){
                ucret+=10;
            }
        }
        else if(sure==1){
            ucret+=50;
        }
        else {
            System.out.println("Sıfır Girildi");
        }
        return ucret;
    }













}
