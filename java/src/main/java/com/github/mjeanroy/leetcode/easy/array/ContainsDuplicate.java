package com.github.mjeanroy.leetcode.easy.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static boolean containsDuplicate(int[] nums) {
		if (nums == null || nums.length <= 1) {
			return false;
		}

		Set<Integer> visited = new HashSet<>();

		for (int value : nums) {
			if (visited.contains(value)) {
				return true;
			}

			visited.add(value);
		}

		return false;
	}
}
