import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		int[] array = {9, 8, 7, 6, 5};
		
		int size = array.length;
		
		System.out.println("OG: " + Arrays.toString(array));
		bubbleSort(array, size);
	}
	
	static void bubbleSort(int[] arr, int n) {
		
		// Base case
		if (n == 1)
			return; // A list of size 1 is sorted
		
		for (int i = 0; i < n-1; i++) {
			if (arr[i] > arr[i+1]) {
				int temp = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = temp;
				System.out.println(Arrays.toString(arr));
			}
		}
		
		
		bubbleSort(arr, n-1);
		
	}
	
}
