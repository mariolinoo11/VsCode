package it.unisa.diem.oop21.veicoli;

public class Camion extends Veicolo {
    private int numeroAssi;

    public Camion(String numTelaio, String modello, String alimentazione, String targa, int numeroAssi) {
        super(numTelaio, modello, alimentazione, targa);
        this.numeroAssi = numeroAssi;
    }

    public int getNumeroAssi() {
        return this.numeroAssi;
    }

    @Override
    public boolean controllaTarga() {
        return getTarga().matches("\\w{2}\\d{6}");
    }

    @Override
    public String toString() {
        return super.toString() + " Numero assi=" + this.getNumeroAssi();
    }
}
