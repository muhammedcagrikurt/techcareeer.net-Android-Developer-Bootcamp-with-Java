package com.kurt.javadersleri.nesne_tabanli.kalitim;

public class Saray extends Ev{
    private int kuleSayisi;

    public Saray() {
    }

    public Saray(int kuleSayisi) {
        this.kuleSayisi = kuleSayisi;
    }

    public int getKuleSayisi() {
        return kuleSayisi;
    }

    public void setKuleSayisi(int kuleSayisi) {
        this.kuleSayisi = kuleSayisi;
    }
}
