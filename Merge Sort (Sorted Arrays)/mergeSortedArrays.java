/**
 * The class below merges two arrays that are already sorted. 
 * This class is the helper method for completing a mergeSort.
 * 
 * The Big O runtime complexity of this algorithm is O(n)
 * 
 * @version April 3, 2020
 * */

import java.util.ArrayList;
import java.util.List;

public class mergeSortedArrays {
	public static void main(String[] args) {
		int[] arrayOne = {1, 10, 50};
		int[] arrayTwo = {2, 14, 99, 100};
		
		System.out.println(sort(arrayOne, arrayTwo));
	}
	
	public static String sort(int[] a, int[] b) {
		List<Integer> results = new ArrayList<>();
		int i = 0;
		int j = 0;
		
		while(i < a.length && j < b.length) {
			if (b[j] > a[i]) {
				results.add(a[i]);
				i++;
			} else {
				results.add(b[j]);
				j++;
			}
			
		}
		
		while(i < a.length) {
			results.add(a[i]);
			i++;
		}
		
		while (j < b.length) {
			results.add(b[j]);
			j++;
		}
		
		return results.toString();
	}

}
