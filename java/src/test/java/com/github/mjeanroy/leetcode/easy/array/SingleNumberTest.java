package com.github.mjeanroy.leetcode.easy.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SingleNumberTest {

	@Test
	void case1() {
		int[] nums = {2, 2, 1};
		int result = SingleNumber.singleNumber(nums);
		assertThat(result).isEqualTo(1);
	}

	@Test
	void case2() {
		int[] nums = {4, 1, 2, 1, 2};
		int result = SingleNumber.singleNumber(nums);
		assertThat(result).isEqualTo(4);
	}
}
