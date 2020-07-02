package com.github.mjeanroy.leetcode.easy.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxProfitTest {

	@Test
	void it_should_returns_zero_with_empty_array() {
		int[] nums = {};
		int profit = MaxProfit.maxProfit(nums);
		assertThat(profit).isZero();
	}

	@Test
	void it_should_returns_zero_with_singleton_array() {
		int[] nums = {1};
		int profit = MaxProfit.maxProfit(nums);
		assertThat(profit).isZero();
	}

	@Test
	void it_should_compute_max_profit_case1() {
		int[] nums = {7,1,5,3,6,4};
		int profit = MaxProfit.maxProfit(nums);
		assertThat(profit).isEqualTo(7);
	}

	@Test
	void it_should_compute_max_profit_case2() {
		int[] nums = {1,2,3,4,5};
		int profit = MaxProfit.maxProfit(nums);
		assertThat(profit).isEqualTo(4);
	}

	@Test
	void it_should_compute_max_profit_case3() {
		int[] nums = {7,6,4,3,1};
		int profit = MaxProfit.maxProfit(nums);
		assertThat(profit).isEqualTo(0);
	}
}
