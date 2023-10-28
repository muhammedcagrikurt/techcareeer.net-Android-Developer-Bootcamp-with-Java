package com.kurt.javadersleri.nesne_tabanli.interface_kullanimi;

public class MyClass implements MyInterface{
    @Override
    public void metod1() {
        System.out.println("Metod 1 çalıştı");
    }

    @Override
    public String method2() {
        return  "Metod 2 çalıştı";
    }
}
