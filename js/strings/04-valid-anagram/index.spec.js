const isAnagram = require('./index');

describe('isAnagram', () => {
  it('should return true with valid anagram', () => {
    const s = "anagram";
    const t = "nagaram";
    expect(isAnagram(s, t)).toBe(true);
  });

  it('should return false with invalid anagram', () => {
    const s = "rat";
    const t = "car";
    expect(isAnagram(s, t)).toBe(false);
  });
});
