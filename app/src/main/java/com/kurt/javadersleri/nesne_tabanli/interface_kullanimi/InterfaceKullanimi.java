package com.kurt.javadersleri.nesne_tabanli.interface_kullanimi;

public class InterfaceKullanimi {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        myClass.metod1();
        String gelenSonuc = myClass.method2();
        System.out.println(gelenSonuc);
    }
}
