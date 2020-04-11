const intersect = require('./index');

describe('intersect', () => {
  it('should return intersection (case 1)', () => {
    expect(intersect([1,2,2,1], [2,2])).toEqual([2, 2]);
  });

  it('should return singleton array (case 2)', () => {
    expect(intersect([4,9,5], [9,4,9,8,4])).toEqual([9, 4]);
  });
});
