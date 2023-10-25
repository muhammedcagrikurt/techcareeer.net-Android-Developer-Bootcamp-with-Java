package com.kurt.javadersleri.standart_programlama;

public class KarsilastirmaOperatorleri {
    public static void main(String[] args) {
        int a = 40;
        int b = 50;

        int x = 90;
        int y = 80;

        System.out.println("a == b :"+(a==b)); // a b'ye eşit mi evet ise true değil ise false
        System.out.println("a != b :"+(a!=b)); // ! not anlamına gelir var olan ifadeyi tersler
        // a b'ye eşit değil mi mi evet ise true değil ise false
        System.out.println("a > b :"+(a>b)); //a b'den büyük mü evet ise true değil ise false
        System.out.println("a >= b :"+(a>=b)); //a b'den büyük veya eşit mi evet ise true değil
        // ise false
        System.out.println("a < b :"+(a<b)); //a b'den küçük mü evet ise true değil ise false
        System.out.println("a <= b :"+(a<=b)); //a b'den küçük veya eşit mi evet ise true değil
        // ise false

        System.out.println("a > b || x > y : "+(a > b || x > y)); // OR ( VEYA) : false - false : false
        //diğer durumlarda hep true

        System.out.println("a > b && x > y : "+(a > b && x > y)); // AND (VE) : true - true : true
        //diğer durumlarda hep false





    }
}
