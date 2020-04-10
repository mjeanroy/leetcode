const removeDuplicates = require('./index');

describe('remove-duplicates', () => {
  it('should return empty array', () => {
    const array = [];
    const len = removeDuplicates(array);
    expect(array).toEqual([]);
    expect(len).toBe(0);
  });

  it('should return singleton array', () => {
    const array = [0];
    const len = removeDuplicates(array);
    expect(array).toEqual([0]);
    expect(len).toBe(1);
  });

  it('should return array with unique elements', () => {
    const array = [0, 1, 2, 3];
    const len = removeDuplicates(array);
    expect(array).toEqual([0, 1, 2, 3]);
    expect(len).toBe(4);
  });

  it('should truncate array ending with duplicated elements', () => {
    const array = [0, 1, 2, 3, 4, 4, 4];
    const len = removeDuplicates(array);
    expect(array).toEqual([0, 1, 2, 3, 4, 4, 4]);
    expect(len).toBe(5);
  });

  it('should remove array duplicated elements of array', () => {
    const array = [0, 1, 1, 2, 3, 4, 4, 4];
    const len = removeDuplicates(array);
    expect(array).toEqual([0, 1, 2, 3, 4, 4, 4, 4]);
    expect(len).toBe(5);
  });
});
