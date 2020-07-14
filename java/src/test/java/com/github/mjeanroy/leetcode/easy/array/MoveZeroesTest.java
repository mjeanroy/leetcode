package com.github.mjeanroy.leetcode.easy.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoveZeroesTest {

	@Test
	void case1() {
		int[] nums = new int[]{0, 1, 0, 3, 12};
		MoveZeroes.moveZeroes(nums);
		assertThat(nums).containsExactly(
				1, 3, 12, 0, 0
		);
	}

	@Test
	void case2() {
		int[] nums = new int[]{0, 1, 2, 3};
		MoveZeroes.moveZeroes(nums);
		assertThat(nums).containsExactly(
				1, 2, 3, 0
		);
	}

	@Test
	void case3() {
		int[] nums = new int[]{1, 0};
		MoveZeroes.moveZeroes(nums);
		assertThat(nums).containsExactly(
				1, 0
		);
	}

	@Test
	void case4() {
		int[] nums = new int[]{4, 2, 4, 0, 0, 3, 0, 5, 1, 0};
		MoveZeroes.moveZeroes(nums);
		assertThat(nums).containsExactly(
				4, 2, 4, 3, 5, 1, 0, 0, 0, 0
		);
	}
}
