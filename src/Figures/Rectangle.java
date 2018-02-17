package Figures;

public class Rectangle implements Figura {

    //Atributs
    protected double c1;
    protected double c2;
    protected double area;


    //Constructor
    public Rectangle (double c1, double c2)
    {
        this.c1 = c1;
        this.c2 = c2;
    }


    //Càlcul àrea
    public double calculArea()
    {
        area = c1 * c2;
        return area;
    }
}
