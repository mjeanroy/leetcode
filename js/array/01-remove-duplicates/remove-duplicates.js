
/**
 * @param {number[]} nums
 * @return {number}
 */
module.exports = function removeDuplicates(nums) {
    const length = nums.length;
    if (length <= 1) {
        return length;
    }

    let idx = 1;

    for (let i = 1; i < length; ++i) {
        if (nums[i] !== nums[i - 1]) {
            nums[idx] = nums[i];
            idx++;
        }
    }

    return idx;
};