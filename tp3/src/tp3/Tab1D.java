package tp3;

import java.util.Scanner;

public class Tab1D {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1ere valeur ?");
		double a = scan.nextDouble();
		System.out.println("2eme valeur ?");
		double b = scan.nextDouble();
		System.out.println("3eme valeur ?");
		double c = scan.nextDouble();
		System.out.println("4eme valeur ?");
		double d = scan.nextDouble();
		System.out.println("{" + a + "," + b + "," + c + "," + d + "}");
		scan.close();
	}
}
