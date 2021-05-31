/**
 * The class below performs a bubble sort.
 * 
 * The bubble sort has a Big O runtime of O(n^2)
 * 
 * @version April 1, 2020
 * */

import java.util.Arrays;

public class bubbleSort {
	public static void main(String[] args) {
		int[] array = {9, 8, 7, 6, 5};
		System.out.println(sort(array));
	}
	
	public static String sort(int[] a) {
		boolean noSwaps;
		
		for (int i = a.length; i > 0; i--) {
			noSwaps = true;
			for (int j = 0; j < i - 1; j++) {
				System.out.println("Current pass: " + Arrays.toString(a)); // Shows all comparisons
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					noSwaps = false;
				}
			}
			
			
			if (noSwaps) break;
		}
		return Arrays.toString(a);
	}

}
