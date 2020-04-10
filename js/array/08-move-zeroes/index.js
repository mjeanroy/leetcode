/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
module.exports = function moveZeroes(nums) {
  if (nums.length <= 1) {
    return;
  }

  let i = 0;
  let j = 0;

  while(i < nums.length) {
    if (nums[i] !== 0) {
        nums[j++] = nums[i];
    }

    ++i;
  }

  while(j < nums.length) {
    nums[j++] = 0;
  }
};
