package it.unisa.diem.oop21.veicoli;

public class Autovettura extends Veicolo {
    private int numeroPosti;

    public Autovettura(String numTelaio, String modello, String alimentazione, String targa, int numeroPosti) {
        super(numTelaio, modello, alimentazione, targa);
        this.numeroPosti = numeroPosti;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    @Override
    public boolean controllaTarga() {
        return getTarga().matches("\\w{2}\\d{3}\\w{2}");
    }

     @Override
    public String toString() {
        return super.toString() + ", Numero Posti=" + this.getNumeroPosti();
    }
}
