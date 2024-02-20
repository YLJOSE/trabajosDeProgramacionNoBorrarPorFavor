package arrays;

public class prueba3 {
	public static void main(String[] args) {
		int matriz[] = new int[3];

		for (int i = 0; i < matriz.length; i++) {
			matriz[i] = (int) Math.round(Math.random() * 3);

		}
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i] + " ");

		}
		
		for(int numAle : matriz) {
			System.out.println(numAle);
			
		}
	
	}
}
