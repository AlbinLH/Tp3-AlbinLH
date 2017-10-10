package tp3;

import java.util.Scanner;

public class Tab2D_34 {
	public static void main(String[] args) {
		
	}
	
	public static double[][] generateRandomDoubleArray() {
		Scanner scan = new Scanner(System.in);
		System.out.println("lignes?");
		int a = scan.nextInt();
		System.out.println("colonnes?");
		int b = scan.nextInt();
		double[][] tab = new double[a][b];

		for (int x = 0; x < a; x++) {
			for (int j = 0; j < b; j++) {
				tab[x][j] = (int) (Math.random() * 10);
			}
		}
		scan.close();
		return tab;

	}
}
