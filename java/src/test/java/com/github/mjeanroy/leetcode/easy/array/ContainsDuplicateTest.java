package com.github.mjeanroy.leetcode.easy.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainsDuplicateTest {

	@Test
	void it_should_return_false_with_empty_array() {
		int[] nums = {};
		boolean result = ContainsDuplicate.containsDuplicate(nums);
		assertThat(result).isFalse();
	}

	@Test
	void it_should_return_false_with_singleton_array() {
		int[] nums = {1};
		boolean result = ContainsDuplicate.containsDuplicate(nums);
		assertThat(result).isFalse();
	}

	@Test
	void case1() {
		int[] nums = {1, 2, 3, 1};
		boolean result = ContainsDuplicate.containsDuplicate(nums);
		assertThat(result).isTrue();
	}

	@Test
	void case2() {
		int[] nums = {1, 2, 3, 4};
		boolean result = ContainsDuplicate.containsDuplicate(nums);
		assertThat(result).isFalse();
	}

	@Test
	void case3() {
		int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
		boolean result = ContainsDuplicate.containsDuplicate(nums);
		assertThat(result).isTrue();
	}
}
