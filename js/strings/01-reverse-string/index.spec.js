const reverseString = require('./index');

describe('reverseString', () => {
  it('should reverse string', () => {
    const str = ['h', 'e', 'l', 'l', 'o'];
    reverseString(str);
    expect(str).toEqual(['o', 'l', 'l', 'e', 'h']);
  });
});
