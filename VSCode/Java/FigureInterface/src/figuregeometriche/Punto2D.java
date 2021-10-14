package figuregeometriche;

public class Punto2D {
    private int x,y;

    public Punto2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //Overloading
    public Punto2D(){
        this(0,0);
    }
    //Overloading
    public Punto2D(int a){
        this(a,a);
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public String toString() {
        return "Punto2D:" +" x='" + getX() + "'" +", y='" + getY();
    }
    
}
