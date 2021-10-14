package figuregeometriche;

public class Cerchio extends AbstractFigura2D {
    private double raggio;
    

    public Cerchio(Punto2D posizione, String colore, double raggio) {
        super(posizione, colore);
        this.raggio = raggio;
    }


    @Override
    public double calcolaArea() {
        return raggio * raggio * 2 * Math.PI;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * Math.PI * raggio;
    }

    @Override
    public void stampaInfo() {
        super.stampaInfo();
        System.out.println("\nRaggio:" + this.raggio);

    }

}
