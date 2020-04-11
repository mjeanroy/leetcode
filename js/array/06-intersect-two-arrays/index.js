/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
module.exports = function intersect(nums1, nums2) {
  const size1 = nums1.length;
  const size2 = nums2.length;
  if (size1 === 0 || size2 === 0) {
    return [];
  }

  const map = new Map();
  for (let i = 0; i < size1; ++i) {
    const value = nums1[i];
    const occurences = map.get(value) || 0;
    map.set(value, occurences + 1);
  }

  const intersection = [];

  for (let i = 0; i < size2; ++i) {
    const value = nums2[i];
    const occurences = map.get(value) || 0;
    if (occurences) {
      intersection.push(value);
      map.set(value, occurences - 1);
    }
  }

  return intersection;
};