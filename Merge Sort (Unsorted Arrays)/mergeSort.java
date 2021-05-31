/**
 * The class below performs a mergeSort with the help of 
 * two methods: sort and merge.
 * 
 * The Big O runtime for this algorithm is O(n log n) because
 * it divides the original array in half.
 * 
 * @version April 3, 2020
 * */

import java.util.Arrays;

public class mergeSort {

	public static void main(String[] args) {
		int[] arrayOne = {31, 4, 37, 20, 13, 17, 43, 47, 40, 5, 24, 45, 7, 9};
		
		System.out.println(Arrays.toString(sort(arrayOne)));
	}
	
	public static int[] sort(int[] a) {
		if (a.length <= 1) return a; // Base case
		
		int mid = a.length / 2; // Finds the middle of the array

		// Creates an array the size of the middle to store the left values
		int[] left = new int[mid]; 
		
		// Creates an array to store the right values
		int[] right;
		
		// The if else statement below adds size to the right array depending if the
		// mid is divisible by 2. If its not, a one is added to account for the one
		// remaining index
		if (a.length % 2 == 0) right = new int[mid];
		else right = new int[mid + 1];
		
		// The for loop below adds the first half of the values of
		// our array to the left side array
		for (int i = 0; i < mid; i++) {
			left[i] = a[i];
		}
		
		// The for loop below adds the second half of the values
		// of our array to the right side array
		for(int j = 0; j < right.length; j++) {
			right[j] = a[mid + j];
		}
		
		// A new array is created to store the sorted array
		int[] result = new int[a.length];
		left = sort(left); // Recursion for divide and conquer of left
		right = sort(right); // Recursion for divide and conquer of right
		
		// The array is initialized to the merged array of the left and right halves
		result = merge(left, right);
		
		return result;

	}
	
	private static int[] merge(int[] left, int[] right) {
		// An array is created to store the result of the merged arrays
		int[] result = new int[left.length + right.length];
		
		int leftPointer = 0;
		int rightPointer = 0;
		int resultIndex = 0;
		
		while(leftPointer < left.length || rightPointer < right.length) {
			
			// The if statement below checks if there are elements in both arrays
			if (leftPointer < left.length && rightPointer < right.length) {
				
				// The if/else statement below compares the elements in either array to find the smallest
				if (left[leftPointer] < right[rightPointer]) result[resultIndex++] = left[leftPointer++];
				else result[resultIndex++] = right[rightPointer++];
			}
			
			// The if statement below checks if there are only elements in the left array
			else if (leftPointer < left.length) {
				result[resultIndex++] = left[leftPointer++];
			}
			
			// The if statement below checks if there are only elements in the right array
			else if (rightPointer < right.length) {
				result[resultIndex++] = right[rightPointer++];
			}
		}
		
		return result;
	}

}
