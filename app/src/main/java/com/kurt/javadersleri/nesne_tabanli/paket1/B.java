package com.kurt.javadersleri.nesne_tabanli.paket1;

import com.kurt.javadersleri.nesne_tabanli.paket1.*; // * = all , hepsi anlamına gelir
// * ile hepsini import ettin
//import com.kurt.javadersleri.nesne_tabanli.paket1.A; import ettik
public class B {
    public void metod(){
        A a = new A();
        System.out.println(a.publicDegisken);
        System.out.println(a.protectedDegisken);
        System.out.println(a.varsayilanDegisken);

    }
}
