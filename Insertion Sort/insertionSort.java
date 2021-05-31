import java.util.Arrays;

public class insertionSort {
	public static void main(String[] args) {
		int[] array = {8, 6, 7, 5, 3, 0, 9};
		System.out.println(sort(array));
	}
	
	public static String sort(int[] a) {
		int j;
		for (int i = 1; i < a.length; i++) {
			
			boolean swapped = false;
			
			int current = a[i];
			 System.out.println("Current pass" + Arrays.toString(a)); // Most Accurate of iterations
			for (j = i-1; j >= 0 && a[j] > current; j--) {
				a[j+1] = a[j];
				swapped = true;
			}
			
			a[j+1] = current;
			
			if (swapped)
				System.out.println("Current pass" + Arrays.toString(a));
			
			
			
		}
		return Arrays.toString(a);
	}
}
