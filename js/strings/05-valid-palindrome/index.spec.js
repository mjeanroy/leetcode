const isPalindrome = require('./index');

describe('isPalindrome', () => {
  it('should return true with valid palindrome', () => {
    expect(isPalindrome('A man, a plan, a canal: Panama')).toBe(true);
  });

  it('should return false with invalid palindrome', () => {
    expect(isPalindrome('race a car')).toBe(false);
  });

  it('should return false with invalid palindrome (case 1)', () => {
    expect(isPalindrome('OP')).toBe(false);
  });

  it('should return false with valid palindrome (case 2)', () => {
    expect(isPalindrome('12321')).toBe(true);
  });
});
