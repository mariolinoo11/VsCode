package figuregeometriche;

public abstract class AbstractFigura2D implements Figura2D {
    private Punto2D posizione;
    private String colore;

    public AbstractFigura2D(Punto2D posizione, String colore) {
        this.posizione = new Punto2D(posizione.getX(), posizione.getY());
        this.colore = colore;
    }

    public Punto2D getPosizione() {
        return this.posizione;
    }

    public void setPosizione(Punto2D posizione) {
        this.posizione = new Punto2D(posizione.getX(), posizione.getY());
    }

    public String getColore() {
        return this.colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    @Override
    public void stampaInfo() {
        System.out.println("Classe: " + this.getClass() + "\nPosizione:" + this.getPosizione() + "\nColore:"
                + this.getColore() + "\nArea:" + this.calcolaArea() + "\nPerimetro:" + this.calcolaPerimetro());

    }
}
