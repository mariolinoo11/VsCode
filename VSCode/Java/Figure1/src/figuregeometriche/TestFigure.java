package figuregeometriche;

public class TestFigure {
    public static void main(String[] args) {
        Figura2D figure[];
        figure= new Figura2D[5];

        figure[0]= new Rettangolo(new Punto2D(6, 8),"white",5,10);
        figure[1] = new Cerchio(new Punto2D(3,12), "black",10);
        for(int i=0; i<figure.length; i++) {
            figure[i].stampaInfo();
        }
        


        
    }

}
