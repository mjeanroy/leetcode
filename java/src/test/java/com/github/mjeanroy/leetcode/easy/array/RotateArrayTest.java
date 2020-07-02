package com.github.mjeanroy.leetcode.easy.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RotateArrayTest {

	@Test
	void it_should_not_rotate_empty_array() {
		int[] nums = {};
		int k = 0;
		RotateArray.rotate(nums, k);
		assertThat(nums).isEmpty();
	}

	@Test
	void it_should_not_rotate_singleton_array() {
		int[] nums = {1};
		int k = 0;
		RotateArray.rotate(nums, k);
		assertThat(nums).containsExactly(1);
	}

	@Test
	void it_should_rotate_array_case1() {
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		int k = 3;
		RotateArray.rotate(nums, k);
		assertThat(nums).containsExactly(
				5, 6, 7, 1, 2, 3, 4
		);
	}

	@Test
	void it_should_rotate_array_case2() {
		int[] nums = {-1, -100, 3, 99};
		int k = 2;
		RotateArray.rotate(nums, k);
		assertThat(nums).containsExactly(
				3, 99, -1, -100
		);
	}

	@Test
	void it_should_rotate_array_case3() {
		int[] nums = {1, 2};
		int k = 3;
		RotateArray.rotate(nums, k);
		assertThat(nums).containsExactly(
				2, 1
		);
	}

	@Test
	void it_should_rotate_array_case4() {
		int[] nums = {1, 2};
		int k = 4;
		RotateArray.rotate(nums, k);
		assertThat(nums).containsExactly(
				1, 2
		);
	}
}
