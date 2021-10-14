package figuregeometriche;

public class Trapezio extends AbstractFigura2D{
    private double baseMinore,baseMaggiore,altezza;

    public Trapezio(Punto2D posizione,String colore,double baseMinore, double baseMaggiore, double altezza) {
        super(posizione,colore);
        this.baseMinore = baseMinore;
        this.baseMaggiore = baseMaggiore;
        this.altezza = altezza;
    }

    public double getBaseMinore() {
        return this.baseMinore;
    }

    public void setBaseMinore(double baseMinore) {
        this.baseMinore = baseMinore;
    }

    public double getBaseMaggiore() {
        return this.baseMaggiore;
    }

    public void setBaseMaggiore(double baseMaggiore) {
        this.baseMaggiore = baseMaggiore;
    }

    public double getAltezza() {
        return this.altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public Trapezio(Punto2D posizione, String colore) {
        super(posizione, colore);
        
    }

    @Override
    public double calcolaArea() {
        
        return (altezza * (baseMinore + baseMaggiore))/2;
    }

    @Override
    public double calcolaPerimetro() {
        
        return 0;
    }

    @Override
    public void stampaInfo() {
        super.stampaInfo();
        System.out.println("\nBase: " + this.baseMinore + "\nBaseMaggiore" + this.baseMaggiore + "\nAltezza:" + this.altezza);

    }
}
