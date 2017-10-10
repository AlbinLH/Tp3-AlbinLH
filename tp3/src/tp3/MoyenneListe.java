package tp3;

public class MoyenneListe {
	public static void main(String[] args) {

	}

	public static double Moyenne(double[] tab) {

		int l = tab.length;
		double f = 0;
		double sum = 0;
		for (int i = 0; i < l; i++) {
			sum = sum + tab[i];
			f = f + 1;
		}
		double moyenne = sum / f;

		return moyenne;

	}
}
