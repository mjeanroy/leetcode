package com.github.mjeanroy.leetcode.easy.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {

	@Test
	void case1() {
		int[] nums = new int[]{2, 7, 11, 15};
		int target = 9;
		int[] results = TwoSum.twoSum(nums, target);
		assertThat(results).containsExactly(
				0, 1
		);
	}
}
