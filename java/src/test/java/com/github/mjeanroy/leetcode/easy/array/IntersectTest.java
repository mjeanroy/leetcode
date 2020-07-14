package com.github.mjeanroy.leetcode.easy.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntersectTest {

	@Test
	void case1() {
		int[] nums1 = new int[]{1, 2, 2, 1};
		int[] nums2 = new int[]{2, 2};
		int[] results = Intersect.intersect(nums1, nums2);
		assertThat(results).containsExactlyInAnyOrder(
				2, 2
		);
	}

	@Test
	void case2() {
		int[] nums1 = new int[]{4, 9, 5};
		int[] nums2 = new int[]{9, 4, 9, 8, 4};
		int[] results = Intersect.intersect(nums1, nums2);
		assertThat(results).containsExactlyInAnyOrder(
				4, 9
		);
	}
}
