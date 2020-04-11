/**
 * @param {number[]} digits
 * @return {number[]}
 */
module.exports = function plusOne(digits) {
  if (digits.length === 0) {
    return digits;
  }

  const results = [];

  let i = digits.length - 1;
  let carry = true;

  while (i >= 0) {
    const digit = digits[i--];
    if (!carry) {
      results.unshift(digit);
    } else {
      carry = digit === 9;
      results.unshift(carry ? 0 : (digit + 1));
    } 
  }

  if (carry) {
    results.unshift(1);
  }

  return results;
};