/**
 * Exercice 3 : Trouver Le Nombre De Rotations
 * Instructions
 * Étant donné un tableau arr[]de taille Nayant des nombres distincts triés dans l'ordre croissant et le tableau a été tourné à droite (c'est-à-dire que le dernier élément sera cycliquement décalé vers la position de départ du tableau) knombre de fois, la tâche consiste à trouver la valeur de k.
 *
 * Exemples:
 *
 * JAVA
 * Input: arr[] = {15, 18, 2, 3, 6, 12}
 * Output: 2
 * Explanation: Initial array must be {2, 3, 6, 12, 15, 18}.
 * We get the given array after rotating the initial array twice.
 *
 * Input: arr[] = {7, 9, 11, 12, 5}
 * Output: 4
 *
 * Input: arr[] = {7, 9, 11, 12, 15};
 * Output: 0
 *
 *
 * Approche 1 (À L'aide De La Recherche Linéaire) :
 * Ce problème peut être résolu en utilisant la recherche linéaire.
 *
 * Si nous regardons de plus près les exemples, nous pouvons remarquer que le nombre de rotations est égal
 * à l'indice de l'élément minimum. Une solution linéaire simple consiste à trouver l'élément minimum et à retourner son indice.
 *
 * Illustration:
 *
 * Consider the array arr[]={15, 18, 2, 3, 6, 12};
 * Initially minimum = 15, min_index = 0
 *
 * At i = 1: min = 15, min_index = 0
 * At i = 2: min = min(2, 15) = 2, min_index = 2
 * At i = 3: min = 2, min_index = 2
 * At i = 4: min = 2, min_index = 2
 * At i = 5: min = 2, min_index = 2
 *
 *
 * Le tableau est tourné deux fois vers la droite
 *
 * Suivez les étapes mentionnées ci-dessous pour mettre en œuvre l'idée :
 *
 * Initialisez deux variables pour stocker la valeur minimale et l'indice de cette valeur.
 * Parcourez le tableau du début à la fin :
 * recherchez la valeur minimale et l'index où la valeur minimale est stockée.
 * Renvoie l'indice de la valeur minimale.
 */

package exercice3;

public class RotationCount {
	
	 public static int findRotationCount(int[] arr) {
	        int n = arr.length;
	        int min = arr[0], minIndex = -1;
	        
	        // Find the minimum element and its index
	        for (int i = 0; i < n; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	                minIndex = i;
	            }
	        }
	        
	        // Return the index of the minimum element
	        return minIndex;
	    }
	    
	    public static void main(String[] args) {
	        int[] arr1 = {15, 18, 2, 3, 6, 12};
	        System.out.println("Rotation count for arr1: " + findRotationCount(arr1));
	        
	        int[] arr2 = {7, 9, 11, 12, 5};
	        System.out.println("Rotation count for arr2: " + findRotationCount(arr2));
	        
	        int[] arr3 = {7, 9, 11, 12, 15};
	        System.out.println("Rotation count for arr3: " + findRotationCount(arr3));
	    }

}
