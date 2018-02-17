package Figures;

public class Cercle implements Figura {

    //Atributs
    double radi;
    double area;


    //Constructor
    public Cercle(double radi)
    {
        this.radi = radi;
    }


    //Càlcul àrea
    public double calculArea()
    {
        area = Math.PI * radi * radi;
        return area;
    }
}
