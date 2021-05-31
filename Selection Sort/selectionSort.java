/**
 * The class below performs a selection sort.
 * 
 * The selection sort has a Big O runtime of O(n^2)
 * 
 * @version April 2, 2020
 * */

import java.util.Arrays;

public class selectionSort {

	public static void main(String[] args) {
		char[] array = { 'N', 'C', 'D', 'E', 'A'};
		System.out.println("Starting array: " + Arrays.toString(array));
		System.out.println("Sorted array: " + sort(array));

	}
	
	public static String sort(char[] a) {
		
		// Iterates through the array
		for (int i = 0; i < a.length; i++) {
			boolean swapped = false;
			
			int min = i;
			
			// Iterates through the array with a head start of 1
			for (int j = i+1; j < a.length; j++) {
				// Finds new min
				if(a[j] < a[min]) {
					min = j;
				}
			}
			
			// Performs swapping
			if (i != min) {
				char temp = a[i];
				a[i] = a[min];
				a[min] = temp;
				swapped = true;
			}
			
			if (swapped)
				System.out.println("Current swap:" + Arrays.toString(a));
			
		}
		return Arrays.toString(a);
	}

}
