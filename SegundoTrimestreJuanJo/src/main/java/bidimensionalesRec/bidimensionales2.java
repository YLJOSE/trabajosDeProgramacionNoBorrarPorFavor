package bidimensionalesRec;

public class bidimensionales2 {

	public static void main(String[] args) {
		int [][] matriz = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}
		};
		
		for (int i =0;i<matriz.length;i++) {
			for(int j = 0; j<matriz[0].length;j++) {
				System.out.print(matriz[i][j] + " ");
				
			}
			System.out.println();
		}

	}

}
