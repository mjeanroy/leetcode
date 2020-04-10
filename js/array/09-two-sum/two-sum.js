/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
module.exports = function twoSum(nums, target) {
  if (nums.length <= 1) {
    return [];
  }

  const map = new Map();

  for (let j = 0; j < nums.length; ++j) {
    const current = nums[j];
    const lookingFor = target - nums[j];

    if (!map.has(lookingFor)) {
      map.set(current, j);
    } else {
      return [map.get(lookingFor), j];
    }
  }

  return [];
};