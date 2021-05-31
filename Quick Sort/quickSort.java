/**
 * The class below performs a quickSort on an array. 
 * The Big O runtime for a quickSort is O(n^2)
 * 
 * @version April 3, 2020
 * */
import java.util.Arrays;

public class quickSort {

	public static void main(String[] args) {
		int[] array = {7, 2, 1, 13, 20, 6, 9, 33, 40, 3};
		
		System.out.println(Arrays.toString(sort(array, 0, array.length-1)));

	}
	
	// The method below begins our quickSort
	public static int[] sort(int[] arr, int left, int right) {
		
		// The if statement prevents an infinite loop and stops the
		// program when all passes have taken place. This is achieved
		// when the left and right are the same.
		if(left < right) {
			
			// Stores the index our pivot should be at
			int pivotIndex = pivot(arr, left, right);
			
			// Left
			sort(arr, left, pivotIndex-1); // Recursion
			
			// Right
			sort(arr, pivotIndex+1, right); // Recursion
		}
		
		
		return arr;
	}
	
	// The method below uses a pivot from our array, in this case the
	// value in the beginning, and returns the index that this pivot
	// should be at after shifting all smaller values to the left
	private static int pivot(int[] arr, int start, int end) {

		// Initializes our pivot to the first value
		int pivot = arr[start]; 
		System.out.println(pivot);

		// Keeps track of the number of values smaller than our pivot so that 
		// our pivot can then shift that number of values up the array's index
		int swapIndex = start; 
		
		// The for loop below finds values smaller than our pivot and swaps closer to the beginning of our array
		for(int i = start + 1; i < arr.length; i++) {
			if (pivot > arr[i]) {
				swapIndex++;
				swap(arr, swapIndex, i);
			}
		}
		
		// The swap call below performs a final swap to place our pivot after all the smaller values
		swap(arr, start, swapIndex);

		System.out.println(Arrays.toString(arr));
		
		return swapIndex;
	}
	
	// The method below performs between the pivot and the last smallest value in the array
	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}

}
