package com.kurt.javadersleri.nesne_tabanli.kalitim;

public class Villa extends Ev{
    private boolean garajVarmi;

    public Villa() {
    }

    public Villa(boolean garajVarmi) {
        this.garajVarmi = garajVarmi;
    }

    public boolean isGarajVarmi() { // get methodu
        return garajVarmi;
    }

    public void setGarajVarmi(boolean garajVarmi) {
        this.garajVarmi = garajVarmi;
    }




}
