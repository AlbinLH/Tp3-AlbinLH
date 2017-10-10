package tp3;

public class Moyenne {
	public static void main(String[] args) {

	}

	public static double MoyenneDouble(double[][] tab) {

		int l = tab.length;
		int c = tab[0].length;
		double f = 0;
		double sum = 0;
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				sum = sum + tab[i][j];
				f = f + 1;
			}
		}
		double moyenne = sum / f;
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(tab[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println(sum / f);

		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				if (sum / f == tab[i][j]) {
					System.out.println("Moyenne atteinte sur le coeff " + (i + 1) + "/" + (j + 1));
				}
			}
		}
		return moyenne;
	}
}
