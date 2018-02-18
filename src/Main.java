public class Main {

    public static void main(Figura[] l) {
	// funcion suma
	double ret=0;
	for(Figura:l){
	      ret+=l.calculArea();
	}
	//ver area circulo     
        Cercle cercle = new Cercle();
        cercle.calculArea();
        System.out.println("Area del cercle: " + cercle.calculArea());
    }
}
