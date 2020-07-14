package com.github.mjeanroy.leetcode.easy.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-empty array of digits representing a non-negative integer, increment one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 *
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 *
 * Example 2:
 *
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 */
public class PlusOne {

	public static int[] plusOne(int[] digits) {
		if (digits == null || digits.length == 0) {
			return new int[0];
		}

		List<Integer> results = new ArrayList<>(digits.length + 1);

		int carry = 1;
		for (int i = digits.length - 1; i >= 0; --i) {
			int digit = digits[i];
			int newDigit = digit + carry;
			if (newDigit > 9) {
				newDigit = 0;
				carry = 1;
			} else {
				carry = 0;
			}

			results.add(newDigit);
		}

		// Do not forget last carry
		if (carry == 1) {
			results.add(carry);
		}

		int[] plusOne = new int[results.size()];
		int idx = results.size() - 1;
		for (int i : results) {
			plusOne[idx--] = i;
		}

		return plusOne;
	}
}
