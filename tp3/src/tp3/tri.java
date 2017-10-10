package tp3;

public class tri {
	public static void main(String[] args) {

	}

	public static int [] trie(int [] tab) {
		for (int i = 1 ; i < tab.length ; i++) {
			if (tab[i-1]>tab[i]) {
				int a = tab[i-1];
				tab[i] = tab[i-1];
				tab[i-1] = a;
			}
		}
		return(tab);
	}
}
