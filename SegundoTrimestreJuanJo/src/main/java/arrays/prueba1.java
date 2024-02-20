package arrays;

public class prueba1 {

	public static void main(String[] args) {

		int array[] = new int[5];

		array[0] = 15;
		array[1] = 11;
		array[2] = 16;
		array[3] = 19;
		array[4] = 29;

		System.out.println("Mi arraya en posicion [0] : " + array[0]);

		for (int i = 0; i <= 4; i++) {
			System.out.println("mi array[ " + i + " ]= " + array[i]);

		}
		System.out.println("\nPrueba dos\n");

		for (int i = 0; i < array.length; i++) {
			System.out.println("mi array[ " + i + " ]= " + array[i]);

		}
		System.out.println("\nEl tamaño de mi array es : " + array.length);
		
		
		//Forma dos de dar inicio un array
		
		int arrayDos [] = {33,44,56,65,98,12,46};
		

	}

}
