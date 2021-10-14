package figuregeometriche;

public class Cerchio implements Figura2D {
    private Punto2D posizione;
    private String colore;
    private double raggio;

    public Cerchio(Punto2D posizione, String colore, double raggio) {
        this.posizione = new Punto2D(posizione.getX(),posizione.getY());
        this.colore = colore;
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
    public String getColore() {
        return colore;
    }

    @Override
    public void setColore(String colore) {
        this.colore = colore;

    }

    @Override
    public Punto2D getPosizione() {
        return posizione;
    }

    @Override
    public void setPosizione(Punto2D posizione) {
        this.posizione = new Punto2D(posizione.getX(),posizione.getY());

    }

    @Override
    public void stampaInfo() {
        System.out.println("Classe: " + this.getClass() + "\nPosizione:" + this.getPosizione() + "\nColore:"
                + this.getColore() + "\nArea:" + this.calcolaArea() + "\nPerimetro:" + this.calcolaPerimetro());

    }

}