package figuregeometriche;

/**
 *
 * @author mac_mario
 */
public interface Figura2D {

    public double calcolaArea();

    public double calcolaPerimetro();

    public String getColore();

    public void setColore(String colore);

    public Punto2D getPosizione();

    public void setPosizione(Punto2D posizione);

    public void stampaInfo();

}