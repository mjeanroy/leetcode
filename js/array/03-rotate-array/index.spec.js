const rotate = require('./index');

describe('rotate', () => {
  it('should not rotate empty array', () => {
    const array = [];
    const k = 1;
    rotate(array, k);

    expect(array).toEqual([]);
  });

  it('should not rotate singleton array', () => {
    const array = [0];
    const k = 1;
    rotate(array, k);

    expect(array).toEqual([0]);
  });

  it('should rotate array with k=1', () => {
    const array = [1,2,3,4,5,6,7];
    const k = 1;
    rotate(array, k);

    expect(array).toEqual([7,1,2,3,4,5,6]);
  });

  it('should rotate array with k=3', () => {
    const array = [1,2,3,4,5,6,7];
    const k = 3;
    rotate(array, k);

    expect(array).toEqual([5,6,7,1,2,3,4]);
  });
});
