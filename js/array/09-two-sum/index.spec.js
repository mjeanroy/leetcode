const twoSum = require('./index');

describe('two-sum', () => {
  it('should get first elements matching target', () => {
    const input = [2, 7, 11, 15];
    const target = 9;
    expect(twoSum(input, target)).toEqual([0, 1]);
  });

  it('should find elements with duplications', () => {
    const input = [3, 3];
    const target = 6;
    expect(twoSum(input, target)).toEqual([0, 1]);
  });

  it('should find elements (case 3)', () => {
    const input = [3, 2, 4];
    const target = 6;
    expect(twoSum(input, target)).toEqual([1, 2]);
  });
});
