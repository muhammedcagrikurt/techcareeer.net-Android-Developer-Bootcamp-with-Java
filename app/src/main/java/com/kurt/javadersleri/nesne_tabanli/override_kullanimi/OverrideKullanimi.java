package com.kurt.javadersleri.nesne_tabanli.override_kullanimi;

public class OverrideKullanimi {
    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan();
        Memeli memeli = new Memeli();
        Kedi kedi = new Kedi();
        Kopek kopek = new Kopek();

        hayvan.sesCikar(); // Kalıtım yok , kendi methoduna erişti
        memeli.sesCikar(); // Kalıtım var , üst sınıfın methoduna erişti
        kedi.sesCikar(); // Kalıtım var , kendi methoduna erişti
        kopek.sesCikar(); // Kalıtım var , kendi methoduna erişti
    }
}
