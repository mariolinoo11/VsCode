package figuregeometriche;

public class Rettangolo implements Figura2D {
    // attributi comuni a tutte le Figure2D
    private Punto2D posizione;
    private String colore;

    // Attributi specifici del rettangolo
    private double base, altezza;


    public Rettangolo(Punto2D posizione, String colore, double base, double altezza) {
        this.posizione = new Punto2D(posizione.getX(),posizione.getY());
        this.posizione = posizione;
        this.colore = colore;
        this.base = base;
        this.altezza = altezza;
    }



    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return this.altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }


    @Override
    public double calcolaArea() {

        return base * altezza;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * (base * altezza);
    }

    @Override
    public String getColore() {
        // TODO Auto-generated method stub
        return colore;
    }

    @Override
    public void setColore(String colore) {
        this.colore = colore;

    }

    @Override
    public Punto2D getPosizione() {
        // TODO Auto-generated method stub
        return posizione;
    }

    @Override
    public void setPosizione(Punto2D posizione) {
        this.posizione = posizione;

    }

    @Override
    public void stampaInfo() {
        System.out.println("Classe : "+this.getClass()+"\n Posizione: "+this.posizione+"\nColore :"+ this.colore+"\nArea: "+this.calcolaArea()+"\nPreimetro: "+this.calcolaPerimetro()+"\nBase: "+this.base+"\nAltezza"+this.altezza);

    }

}
