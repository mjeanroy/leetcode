const plusOne = require('./index');

describe('plusOne', () => {
  it('should add one (case 1)', () => {
    expect(plusOne([1, 2, 3])).toEqual([1, 2, 4]);
  });

  it('should add one (case 2)', () => {
    expect(plusOne([0])).toEqual([1]);
  });

  it('should add one (case 2)', () => {
    expect(plusOne([9])).toEqual([1, 0]);
  });

  it('should add one (case 3)', () => {
    expect(plusOne([9, 9])).toEqual([1, 0, 0]);
  });

  it('should add one (case 4)', () => {
    expect(plusOne([8, 9])).toEqual([9, 0]);
  });

  it('should add one (case 4)', () => {
    expect(plusOne([1, 0, 0, 0])).toEqual([1, 0, 0, 1]);
  });
});
