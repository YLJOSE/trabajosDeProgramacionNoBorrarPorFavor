package InterfacesAbstract;

public class FormaMain {
public static void main(String[] args) {
	Circulo c1 = new Circulo(1);
	Circulo c2 = new Circulo(2);
	Rectangulo r1 = new Rectangulo(1,2);
	Rectangulo r2 = new Rectangulo(3,4);
	
	Forma  formas[]  = new Forma[4];
	formas[0]=c1;
	formas[1]=c2;
	formas[2]=r1;
	formas[3]=r2;
	for(Forma f : formas  ) {
		System.out.println("Forma: " + f.getClass().getSimpleName() + "\n\t Area: " + f.calcularArea());
		System.out.println( "\n\t Perimetro: " + f.calcularPerimetro());
	}
	
	
}
}
