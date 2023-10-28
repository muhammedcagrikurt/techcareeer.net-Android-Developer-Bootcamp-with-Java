package com.kurt.javadersleri.nesne_tabanli.kalitim;

public class KalitimMain {
    public static void main(String[] args) {
        Saray topkapiSaray = new Saray();
        topkapiSaray.setKuleSayisi(10);
        topkapiSaray.setPencereSayisi(200);

        System.out.println(topkapiSaray.getKuleSayisi());
        System.out.println(topkapiSaray.getPencereSayisi());

        Villa bogazVilla = new Villa();
        bogazVilla.setGarajVarmi(true);
        bogazVilla.setPencereSayisi(30);

        System.out.println(bogazVilla.isGarajVarmi());
        System.out.println(bogazVilla.getPencereSayisi());


        //Upcasting
        // Sub > Super

        Saray saray = new Saray();
        Ev ev = saray;

        //Downcasting
        //Super >Sub
        // en çok kullanılacak olan

        Ev home = new Ev();
        Saray palace = (Saray) home;

        // Downcasting ve Upcasting için kalıtım olması lazım

        // Type Control
        if(topkapiSaray instanceof Saray){ // tür kontrolü topkapiSaray Saray mıdır dedik
            System.out.println("Saraydır");
        }
        else {
            System.out.println("Saray değildir");
        }




    }
}
