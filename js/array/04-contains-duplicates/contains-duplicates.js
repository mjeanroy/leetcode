/**
 * @param {number[]} nums
 * @return {boolean}
 */
module.exports = function containsDuplicate(nums) {
  if (nums.length <= 1) {
    return false;
  }

  const set = new Set();
  for (let i = 0; i < nums.length; ++i) {
    if (set.has(nums[i])) {
      return true;
    }

    set.add(nums[i]);
  }

  return false;
};