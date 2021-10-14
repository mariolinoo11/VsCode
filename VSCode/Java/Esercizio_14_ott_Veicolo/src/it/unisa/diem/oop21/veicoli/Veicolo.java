package it.unisa.diem.oop21.veicoli;

public abstract class Veicolo {
    private String numTelaio;
    private String modello;
    private String alimentazione;
    private String targa;

    public Veicolo(String numTelaio, String modello, String alimentazione, String targa) {
        this.numTelaio = numTelaio;
        this.modello = modello;
        this.alimentazione = alimentazione;
        this.targa = targa;
    }

    public String getNumTelaio() {
        return this.numTelaio;
    }

    public String getModello() {
        return this.modello;
    }

    public String getAlimentazione() {
        return this.alimentazione;
    }

    public String getTarga() {
        return this.targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    @Override
    public String toString() {
        return " Telaio= " + getNumTelaio() + " " + ", modello " + getModello() + " " + ", alimentazione= "
                + getAlimentazione() + " " + ", targa= " + getTarga() + "," ;
    }

    public abstract boolean controllaTarga();

}
