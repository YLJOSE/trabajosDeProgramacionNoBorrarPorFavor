package bidimensionalesRec;

public class arrayBidimensionales {
	public static void main(String[] args) {
//		int temperaturas [] = new int [31] ;
//		
//		for(int ayuda : temperaturas) {
//			System.out.println(temperaturas[1]);
//			
//		}
//		
//		for (int i =0;i < temperaturas.length;i++) {
//			System.out.println(temperaturas[1]);
//			
//		}
//		
		int[][][] temperaturas = new int[12][31][24];
//        temperaturas[0][0] = 2;

//		System.out.println("DIas: " + temperaturas.length + " Horas: " + temperaturas[0]);
		for (int k = 0; k < temperaturas.length; k++) {
			for (int i = 0; i < temperaturas[0].length; i++) {
				for (int j = 0; j < temperaturas[0][0].length; j++) {
					System.out.print("MES " + k + " DIA " + i + " Hora: " + j + " | ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
