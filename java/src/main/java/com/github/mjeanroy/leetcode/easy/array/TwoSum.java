package com.github.mjeanroy.leetcode.easy.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		if (nums == null || nums.length <= 1) {
			return new int[]{};
		}

		Map<Integer, Integer> indexes = new HashMap<>();
		for (int i = 0; i < nums.length; ++i) {
			int value = nums[i];
			int lookingFor = target - value;
			if (indexes.containsKey(lookingFor)) {
				return new int[] {indexes.get(lookingFor), i};
			}

			indexes.put(nums[i], i);
		}

		return new int[]{};
	}
}
