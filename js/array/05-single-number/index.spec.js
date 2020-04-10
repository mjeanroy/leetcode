const singleNumber = require('./index');

describe('single-number', () => {
  it('should return undefined with empty array', () => {
    expect(singleNumber([])).toBeUndefined();
  });

  it('should return first element with singleton array', () => {
    expect(singleNumber([0])).toBe(0);
  });

  it('should return single number (case 1)', () => {
    expect(singleNumber([2,2,1])).toBe(1);
  });

  it('should return single number (case 2)', () => {
    expect(singleNumber([4,1,2,1,2])).toBe(4);
  });

  it('should return single number (case 3)', () => {
    expect(singleNumber([4,20,4,10,10])).toBe(20);
  });
});
