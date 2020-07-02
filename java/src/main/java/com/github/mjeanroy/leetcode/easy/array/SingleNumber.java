package com.github.mjeanroy.leetcode.easy.array;

public class SingleNumber {

	public static int singleNumber(int[] nums) {
		int result = 0;
		for (int i : nums) {
			result = result ^ i;
		}

		return result;
	}
}
