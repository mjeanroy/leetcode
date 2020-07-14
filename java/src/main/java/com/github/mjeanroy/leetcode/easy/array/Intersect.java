package com.github.mjeanroy.leetcode.easy.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 *
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Note:
 *
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * Follow up:
 *
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
public class Intersect {

	public static int[] intersect(int[] nums1, int[] nums2) {
		if (nums1 == null || nums1.length == 0) {
			return new int[0];
		}

		if (nums2 == null || nums2.length == 0) {
			return new int[0];
		}

		List<Integer> results = new ArrayList<>(
				Math.max(nums1.length, nums2.length)
		);

		Map<Integer, Integer> counters1 = new HashMap<>();
		for (int i : nums1) {
			counters1.put(i, counters1.getOrDefault(i, 0) + 1);
		}

		for (int k : nums2) {
			if (counters1.containsKey(k)) {
				int counter = counters1.get(k);
				int newCounter = counter - 1;

				if (newCounter == 0) {
					counters1.remove(k);
				} else {
					counters1.put(k, newCounter);
				}

				results.add(k);
			}
		}

		int[] intersection = new int[results.size()];
		int idx = 0;
		for (int i : results) {
			intersection[idx++] = i;
		}

		return intersection;
	}
}
