package tp3;

public class RechercheExhaustive {
	public static void main(String[] args) {

	}

	public static int recherche(int [][] tab, int indice) {
		for (int i = 0 ; i < tab.length ; i++) {
			for (int j = 0 ; j < tab[0].length ; j++) {
				if (indice == tab[i][j]) {
					return(i+j);
				}
			}
		}
	return(-1);
	}
}
