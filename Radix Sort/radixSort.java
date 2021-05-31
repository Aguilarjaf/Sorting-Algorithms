/**
 * The class below performs a radix sort on an array of integers.
 * radixSort has a Big O runtime of O(nk)
 * 
 * @version April 3, 2020
 * */

import java.util.*;

public class radixSort {

	public static void main(String[] args) {
		int[] nums = {12, 44, 5, 0, 2, 3, 99, 44, 5, 6, 12, 35, 36, 39, 19, 79, 23, 75, 2345, 23, 3446353, 4};
		
		System.out.println(Arrays.toString(sort(nums)));

	}
	
	public static int[] sort(int[] nums) {
		final int RADIX = 10; // As a general rule, the radix can not be more than 10. Stores from 0 - 9.
		
		int maxDigitCount = mostDigits(nums); // Checks for the greatest number of digits from the array
		
		// Creates an ArrayList of arrays to make buckets of digits
		@SuppressWarnings("unchecked")
		List<Integer>[] buckets = new ArrayList[RADIX];
		
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new ArrayList<Integer>();
		}
		
		// The for loop below continues for as long as the greatest number of digits
		for(int k = 0; k < maxDigitCount; k++) {
			
			// The for loop below gets individual digits and stores them in buckets from 0 - 9
			for (int i = 0; i < nums.length; i++) {
				int digits = getDigit(nums[i], k);
				buckets[digits].add(nums[i]);
 			}
			
			// The for loop below concatenates all of the values from the buckets into one array.
 	 		int x = 0;
			for (int y = 0; y < RADIX; y++) {
				for(Integer i : buckets[y]) {
					nums[x++] = i;
				}
				buckets[y].clear(); // Clears the memory from the ArrayList of arrays (buckets)
			}
		}
		return nums;
	}
	
	// The method below gets a digit with respect to the ith place from right
	public static int getDigit(int num, int i) {
		return (int) (Math.floor(Math.abs(num) / Math.pow(10, i)) % 10);
	}
	
	
	// The method below counts the number of digits in an integer
	public static int digitCount(int num) {
		String number = Integer.toString(num);
		int count = 0;
		
		for(int i = 0; i < number.length(); i++) {
			count++;
		}
		
		return count;
	}
	
	// The method below returns the highest number of digits of values within an array
	public static int mostDigits(int[] nums) {
		int maxDigits = 0;
		
		for (int i = 0; i < nums.length; i++) {
			maxDigits = Math.max(maxDigits, digitCount(nums[i]));
		}
		
		return maxDigits;
		
	}

}
