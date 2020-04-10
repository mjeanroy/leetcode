/**
 * @param {character[]} s
 * @return {void} Do not return anything, modify s in-place instead.
 */
module.exports = function reverseString(s) {
  if (!s || s.length <= 1) {
    return;
  }

  let i = 0;
  let j = s.length - 1;
  while (i < j) {
    const tmp = s[i];
    s[i] = s[j];
    s[j] = tmp;

    ++i;
    --j;
  }
};