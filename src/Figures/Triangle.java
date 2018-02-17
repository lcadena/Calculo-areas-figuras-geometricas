package Figures;

public class Triangle implements Figura {

    //Atributs
    private double base;
    private double alçada;
    private double area;


    //Constructor
    public Triangle (double base, double alçada)
    {
        this. base = base;
        this.alçada = alçada;
    }


    //Càlcul àrea
    public double calculArea()
    {
        area = (base * alçada) / 2;
        return area;
    }
}
