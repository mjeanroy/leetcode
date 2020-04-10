const containsDuplicates = require('./index');

describe('contains-duplicates', () => {
  it('should return false empty array', () => {
    expect(containsDuplicates([])).toBe(false);
  });

  it('should return false with singleton array', () => {
    expect(containsDuplicates([0])).toBe(false);
  });

  it('should return false with array containing unique elements', () => {
    expect(containsDuplicates([0, 1, 2, 3, 4])).toBe(false);
  });

  it('should return true with array containing twice the same elements', () => {
    expect(containsDuplicates([0, 0])).toBe(true);
  });

  it('should return true with array containing duplicated elements', () => {
    expect(containsDuplicates([0, 1, 2, 3, 4, 4])).toBe(true);
  });
});
