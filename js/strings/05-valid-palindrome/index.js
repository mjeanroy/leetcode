/**
 * @param {string} s
 * @return {boolean}
 */
module.exports = function isPalindrome(s) {
  if (s.length <= 1) {
    return true;
  }

  return isPalindromeWithoutRegexp(s);
};

function isPalindromeWithoutRegexp(s) {
  let left = 0;
  let right = s.length - 1;

  const a = 'a'.charCodeAt(0);
  const z = 'z'.charCodeAt(0);
  const zero = '0'.charCodeAt(0);
  const nine = '9'.charCodeAt(0);

  function isAlpha(x) {
    return x >= a && x <= z;
  }

  function isNumeric(x) {
    return x >= zero && x <= nine;
  }

  function isAlphaNumeric(x) {
    return isAlpha(x) || isNumeric(x);
  }

  while (left < right) {
    const c1 = s[left].toLowerCase().charCodeAt(0);
    if (!isAlphaNumeric(c1)) {
      left++;
      continue;
    }


    const c2 = s[right].toLowerCase().charCodeAt(0);
    if (!isAlphaNumeric(c2)) {
      right--;
      continue;
    }

    if (c2 !== c1) {
      return false;
    }

    left++;
    right--;
  }

  return true;
}

function isPalindromeWithRegexp(s) {
  const str = s.replace(/[^\w]/gi, '').toLowerCase();

  let left = 0;
  let right = str.length - 1;

  while (left < right) {
    const c1 = str[left++];
    const c2 = str[right--];
    if (c2 !== c1) {
      return false;
    }
  }

  return true;
}
