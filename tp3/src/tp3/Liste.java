package tp3;

public class Liste {
	public static void main(String[] args) {

	}

	public static double[] generateRandomListe() {
		int b = (int) (Math.random() * 10);
		double[] tab = new double[b];

		for (int j = 0; j < b; j++) {
			tab[j] = (int) (Math.random() * 10);
		}
		return tab;
	}
}
