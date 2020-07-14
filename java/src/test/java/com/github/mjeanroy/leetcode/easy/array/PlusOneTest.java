package com.github.mjeanroy.leetcode.easy.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlusOneTest {

	@Test
	void case1() {
		int[] digits = new int[]{1, 2, 3};
		int[] output = PlusOne.plusOne(digits);
		assertThat(output).containsExactly(
				1, 2, 4
		);
	}

	@Test
	void case2() {
		int[] digits = new int[]{4, 3, 2, 1};
		int[] output = PlusOne.plusOne(digits);
		assertThat(output).containsExactly(
				4, 3, 2, 2
		);
	}

	@Test
	void case3() {
		int[] digits = new int[]{9};
		int[] output = PlusOne.plusOne(digits);
		assertThat(output).containsExactly(
				1, 0
		);
	}

	@Test
	void case4() {
		int[] digits = new int[]{9, 9, 9};
		int[] output = PlusOne.plusOne(digits);
		assertThat(output).containsExactly(
				1, 0, 0, 0
		);
	}
}
