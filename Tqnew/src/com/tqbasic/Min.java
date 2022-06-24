package com.tqbasic;

public class Min {
	public static void main(String[] args) {
		char A[] = { 'a', 'b', 'b', 'c', 'c', 'b' };
		int[] freq = new int[A.length];
		char minChar = A[0];
		int i, j, min, max;

		// Count each word in given string and store in array freq
		for (i = 0; i < A.length; i++) {
			freq[i] = 1;
			for (j = i + 1; j < A.length; j++) {
				if (A[i] == A[j] && A[i] != ' ' && A[i] != '0') {
					freq[i]++;

					// Set string[j] to 0 to avoid printing visited character
					A[j] = '0';
				}
			}
		}

		// Determine minimum and maximum occurring characters
		min = freq[0];
		for (i = 0; i < freq.length; i++) {

			// If min is greater than frequency of a character
			// then, store frequency in min and corresponding character in minChar
			if (min > freq[i] && freq[i] != '0') {
				min = freq[i];
				minChar = A[i];
			}
		}
		System.out.println(minChar);
	}
}