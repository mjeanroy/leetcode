package com.github.mjeanroy.leetcode.easy.array;

public class MoveZeroes {

	public static void moveZeroes(int[] nums) {
		if (nums == null || nums.length <= 1) {
			return;
		}

		int size = nums.length;
		int i = 0;
		int j = 0;

		while (i < size) {
			if (nums[i] != 0) {
				nums[j] = nums[i];
				j++;
			}

			++i;
		}

		while(j < size) {
			nums[j++] = 0;
		}
	}
}
