package com.github.mjeanroy.leetcode.easy.array;

public class RotateArray {

	public static void rotate(int[] nums, int k) {
		if (nums == null || k < 0 || nums.length <= 1) {
			return;
		}

		int pivot = k % nums.length;

		reverseArray(nums, 0, nums.length - 1);
		reverseArray(nums, 0, pivot - 1);
		reverseArray(nums, pivot, nums.length - 1);
	}

	private static void reverseArray(int[] nums, int begin, int end) {
		for (int i = begin, j = end; i < j; ++i, --j) {
			swap(nums, i, j);
		}
	}

	private static void swap(int[] nums, int x, int y) {
		if (x != y) {
			int tmp = nums[x];
			nums[x] = nums[y];
			nums[y] = tmp;
		}
	}
}
