/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
module.exports = function rotate(nums, k) {
  if (nums.length <= 1) {
    return;
  }

  if (k <= 0) {
    return;
  }

  rotateUsingReverse(nums, k);
};

function rotateUsingReverse(nums, k) {
  const pivot = k % nums.length;
  const length = nums.length;

  // Reverse entire array
  reverse(nums, 0, length - 1);

  // Reverse 0...k
  reverse(nums, 0, pivot - 1);

  // Reverse k...n
  reverse(nums, pivot, length - 1);
}

function reverse(nums, start, end) {
  let i = start;
  let j = end;

  while (i < j) {
    const tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;

    i++;
    j--;
  }
}

function rotateUsingExtraArray(nums, k) {
  const length = nums.length;
  const buffer = [];
  for (let i = 0; i < length; ++i) {
    buffer[(i + k) % length] = nums[i];
  }

  for (let i = 0; i < length; ++i) {
    nums[i] = buffer[i];
  }
}
