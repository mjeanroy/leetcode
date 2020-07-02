package com.github.mjeanroy.leetcode.easy.array;

import java.util.Arrays;

public class MaxProfit {

	public static int maxProfit(int[] prices) {
		if (prices == null || prices.length <= 1) {
			return 0;
		}

		int profit = 0;
		for (int i = 0; i < prices.length - 1; ++i) {
			int today = prices[i];
			int tomorrow = prices[i + 1];
			int diff = tomorrow - today;
			if (diff > 0) {
				profit += diff;
			}
		}

		return profit;
	}
}
