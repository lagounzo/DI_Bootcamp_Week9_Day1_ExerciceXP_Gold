/**
 * Exercice 1 : Réorganiser Un Tableau Sous Forme Maximum Minimum En Utilisant La Technique À Deux Pointeurs
 * Instructions
 * Étant donné un tableau trié d'entiers positifs, réorganisez le tableau alternativement,
 * c'est-à-dire que le premier élément doit être une valeur maximale, en deuxième position une valeur minimale,
 * en troisième position en deuxième max, en quatrième position en deuxième min, etc.
 *
 * Exemples:
 *
 * JAVA
 * Input: arr[] = {1, 2, 3, 4, 5, 6, 7}
 * Output: arr[] = {7, 1, 6, 2, 5, 3, 4}
 *
 * Input: arr[] = {1, 2, 3, 4, 5, 6}
 * Output: arr[] = {6, 1, 5, 2, 4, 3}
 *
 *
 * L'idée est d'utiliser un tableau auxiliaire. Nous maintenons deux pointeurs, l'un vers l'élément le plus à gauche ou le plus petit
 * et l'autre vers l'élément le plus à droite ou le plus grand. Nous déplaçons les deux pointeurs l'un vers l'autre et copions alternativement
 * les éléments de ces pointeurs vers un tableau auxiliaire. Enfin, nous copions le tableau auxiliaire dans le tableau d'origine.
 */


package exercice1;

import java.util.Arrays;

public class MaxMinRearrange {

    public static void rearrangeArray(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int left = 0, right = n - 1;
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (flag)
                temp[i] = arr[right--];
            else
                temp[i] = arr[left++];

            flag = !flag;
        }

        // Copier les éléments du tableau temporaire dans le tableau d'origine
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Tableau d'origine : " + Arrays.toString(arr));
        rearrangeArray(arr);
        System.out.println("Tableau réarrangé : " + Arrays.toString(arr));
    }
}

