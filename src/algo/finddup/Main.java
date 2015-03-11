package algo.finddup;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int arr[] = { 6, 2, 3, 1, 3, 1, 6 };
		printRepeating(arr);
	}

	/**
	 * This solution only works for arrays which contain elements from [0, n-1]
	 * and finds all the <i>duplicates</i>. If the array contains an element
	 * three times, the element will be printed twice.
	 * 
	 * <br>
	 * <br>
	 * Time: O(n)
	 * <br>
	 * Time: O(1)
	 * <br>
	 * 
	 * http://www.geeksforgeeks.org/find-duplicates-in-on-time-and-constant-extra-space/
	 * 
	 * @param arr
	 */
	static void printRepeating(int[] arr) {
		System.out.println("The repeating elements are: \n");
		for (int i = 0; i < arr.length; i++) {
			if (arr[Math.abs(arr[i])] >= 0) {
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
				System.out.println(Arrays.toString(arr));
			} else
				System.out.println(Math.abs(arr[i]));
		}
	}

}
