const moveZeroes = require('./move-zeroes');

describe('move-zeroes', () => {
  it('should return array with empty array', () => {
    const array = [];
    moveZeroes(array);
    expect(array).toEqual([]);
  });

  it('should return array with singleton array', () => {
    const array = [0];
    moveZeroes(array);
    expect(array).toEqual([0]);
  });

  it('should shift zeroes to the end', () => {
    const array = [0,1,0,3,12];
    moveZeroes(array);
    expect(array).toEqual([1,3,12,0,0]);
  });
});
