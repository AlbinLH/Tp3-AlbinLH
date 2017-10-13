package tp3;

public class tri {
	public static void main(String[] args) {

	}

	public static int[] trie(int[] tab) {
		boolean b = false;
		while (b != true) {
			b = true;
			for (int j = 1; j < tab.length; j++) {
				if (tab[j - 1] > tab[j]) {
					int a = tab[j - 1];
					tab[j] = tab[j - 1];
					tab[j - 1] = a;
					b = false;
				}
			}
		}
		return (tab);
	}
}
