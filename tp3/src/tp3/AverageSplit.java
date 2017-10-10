package tp3;

public class AverageSplit {
	public static void main(String[] args) {

		double[] tab = Liste.generateRandomListe();
		double average = MoyenneListe.Moyenne(tab);
		int l = tab.length;
		double a;
		double b;
		String ip = "";
		String ig = "";
		for (int i = 0; i < l; i++) {
			if (tab[i] < average) {
				a = tab[i];
				ip = ip + a + " ";
			} else {
				b = tab[i];
				ig = ig + b + " ";
			}
		}
		System.out.println("Moyenne : " + average);
		System.out.println("Plus petit que la moyenne : " + ip);
		System.out.println("Plus grand ou égal que la moyenne : " + ig);
	}

}
