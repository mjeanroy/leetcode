package com.github.mjeanroy.leetcode.easy.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveDuplicatesTest {

	@Test
	void it_should_remove_duplicates_with_empty_array() {
		int[] nums = {};
		int length = RemoveDuplicates.removeDuplicates(nums);
		assertThat(length).isZero();
	}

	@Test
	void it_should_remove_duplicates_with_singleton_array() {
		int[] nums = {1};
		int length = RemoveDuplicates.removeDuplicates(nums);
		assertThat(length).isOne();
	}

	@Test
	void it_should_remove_duplicates_with_unique_array() {
		int[] nums = {1, 2, 3, 4};
		int length = RemoveDuplicates.removeDuplicates(nums);
		assertThat(length).isEqualTo(4);
		assertThat(nums[0]).isEqualTo(1);
		assertThat(nums[1]).isEqualTo(2);
		assertThat(nums[2]).isEqualTo(3);
		assertThat(nums[3]).isEqualTo(4);
	}

	@Test
	void it_should_remove_duplicates() {
		int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
		int length = RemoveDuplicates.removeDuplicates(nums);
		assertThat(length).isEqualTo(5);
		assertThat(nums[0]).isEqualTo(0);
		assertThat(nums[1]).isEqualTo(1);
		assertThat(nums[2]).isEqualTo(2);
		assertThat(nums[3]).isEqualTo(3);
		assertThat(nums[4]).isEqualTo(4);
	}
}
