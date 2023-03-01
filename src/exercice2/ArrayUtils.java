/**
 * Exercice 2 : Réorganiser Un Tableau
 * Instructions
 * Étant donné un tableau d'éléments de longueur N, allant de 0 à N - 1. Tous les éléments peuvent ne pas être présents dans le tableau.
 * Si l'élément n'est pas présent, il y aura -1 présent dans le tableau. Réorganisez le tableau de telle sorte que A[i] = iet s'il in'est pas présent,
 * affichez -1 à cet endroit.
 *
 * Exemples:
 *
 * JAVA
 * Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
 * Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]
 *
 * Input : arr = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
 *               11, 10, 9, 5, 13, 16, 2, 14, 17, 4}
 * Output : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
 *          11, 12, 13, 14, 15, 16, 17, 18, 19]
 *
 *
 * Approche (approche naïve):
 *
 * Naviguez dans les nombres de 0 à n-1.
 * Naviguez maintenant dans le tableau.
 * Si ( i==a[j]) , alors remplacez l'élément à la position i par a[j]la position.
 * S'il y a un élément dans lequel -1 est utilisé à la place du nombre, il sera automatiquement remplacé.
 * Maintenant, parcourez le tableau et vérifiez si ( a[i]!=i) , si c'est vrai, remplacez-le a[i]par -1.
 */

package exercice2;

import java.util.Arrays;

public class ArrayUtils {
	
	private int[] table;
	//constructeur
	public ArrayUtils(int[] table) {
		this.table = table;
	}
	//getter
	public int[] getTable() {
		return this.table;
	}
	
	public int[] rearrangeArray() {
        ;
        for (int i = 0; i < this.table.length; i++) {
            if (this.table[i] != -1 && this.table[i] != i) {
                int x = this.table[i];
                while (this.table[x] != -1 && this.table[x] != x) {
                    int y = this.table[x];
                    this.table[x] = x;
                    x = y;
                }
                this.table[x] = x;
                if (this.table[i] != i) {
                	this.table[i] = -1;
                }
            }
        }
        return this.table;
    }

    // Example usage:
    public static void main(String[] args) {
        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        ArrayUtils arrayUtils = new ArrayUtils(arr);
        System.out.println(Arrays.toString(arrayUtils.getTable()));
        System.out.println(Arrays.toString(arrayUtils.rearrangeArray()));
        //System.out.println(rearrangedArr);
        //System.out.println(Arrays.toString(arr)); // Output: [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]
    }
    
}
