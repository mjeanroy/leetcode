/**
 * @param {number[]} prices
 * @return {number}
 */
module.exports = function maxProfit(prices) {
  if (prices.length <= 1) {
    return 0;
  }

  let maxProfit = 0;

  for (let i = 1; i < prices.length; ++i) {
    const diff = prices[i] - prices[i - 1];
    if (diff > 0) {
      maxProfit += diff;
    }
  }

  return maxProfit;
};