package com.kurt.javadersleri.nesne_tabanli;

public class StaticKullanimi {
    public static void main(String[] args) {
        ASinifi a = new ASinifi(); //tek nesne

       // System.out.println(a.x);
       // a.metod();

        // Sanal nesne , isimsiz nesne (Virtual or nameless object)
        //System.out.println(new ASinifi().x);//new ASinifi()= a; 1. nesne
        //new ASinifi().metod(); // 2. nesne  1. ve 2. nesye aynı nesne değil
        // bu yöntem hafıza fazla kullnılır

        System.out.println(ASinifi.x);
        ASinifi.metod();

    }
}
