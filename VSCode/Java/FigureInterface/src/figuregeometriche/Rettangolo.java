package figuregeometriche;

public class Rettangolo extends AbstractFigura2D {
    // Attributi specifici del rettangolo
    private double base, altezza;


    public Rettangolo(Punto2D posizione, String colore, double base, double altezza) {
        super(posizione, colore);
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

        return base*altezza;
    }

    @Override
    public double calcolaPerimetro() {

        return (base+altezza)*2;
    }

    @Override
    public void stampaInfo() {
        super.stampaInfo();
        System.out.println("\nBase:" + this.base + "\nAltezza:" + this.altezza + "\n");

    }

}