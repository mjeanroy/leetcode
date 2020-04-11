/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
module.exports = function isAnagram(s, t) {
  if (s.length !== t.length) {
    return false;
  }

  return isAnagramUsingMap(s, t);
};

// O(n) in space complexity
function isAnagramUsingMap(s, t) {
  const map = new Map();
  const length = s.length;

  for (let i = 0; i < length; ++i) {
    const c1 = s[i];
    const c2 = t[i];

    map.set(c1, (map.get(c1) || 0) + 1);
    map.set(c2, (map.get(c2) || 0) - 1);
  }

  for (const v of map.values()) {
    if (v < 0) {
      return false;
    } 
  }

  return true;
}

// 0(1) in space complexity
function isAnagamUsingArray(s, t) {
  const inputs = [];
  const length = s.length;
  const a = 'a'.charCodeAt(0);

  for (let i = 0; i < length; ++i) {
    const c1 = s.charCodeAt(i) - a;
    const c2 = t.charCodeAt(i) - a;
    inputs[c1] = (inputs[c1] || 0) + 1;
    inputs[c2] = (inputs[c2] || 0) - 1;
  }

  for (let i = 0; i < 26; ++i) {
    if (inputs[i] && inputs[i] < 0) {
      return false;
    } 
  }

  return true;
}