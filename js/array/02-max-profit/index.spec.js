const maxProfit = require('./index');

describe('maxProfit', () => {
  it('should return zero with empty array', () => {
    expect(maxProfit([])).toBe(0);
  });

  it('should return zero with singleton array', () => {
    expect(maxProfit([1])).toBe(0);
  });

  it('should return max profit (case 1)', () => {
    expect(maxProfit([7,1,5,3,6,4])).toBe(7);
  });

  it('should return max profit (case 2)', () => {
    expect(maxProfit([1,2,3,4,5])).toBe(4);
  });

  it('should return max profit (case 2)', () => {
    expect(maxProfit([7,6,4,3,1])).toBe(0);
  });
});
