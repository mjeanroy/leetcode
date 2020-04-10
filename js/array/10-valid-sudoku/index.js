/**
 * @param {character[][]} board
 * @return {boolean}
 */
module.exports = function isValidSudoku(board) {
  for (let i = 0; i < 9; ++i) {
    const row = board[i];
    if (!isValid(row)) {
      return false;
    }
  }

  for (let i = 0; i < 9; ++i) {
    const column = [
      board[0][i],
      board[1][i],
      board[2][i],
      board[3][i],
      board[4][i],
      board[5][i],
      board[6][i],
      board[7][i],
      board[8][i],
    ];

    if (!isValid(column)) {
      return false;
    }
  }

  for (let i = 0; i < 9; i += 3) {
    for (let k = 0; k < 9; k += 3) {
      const square = [
        board[i][k],
        board[i][k + 1],
        board[i][k + 2],

        board[i + 1][k],
        board[i + 1][k + 1],
        board[i + 1][k + 2],

        board[i + 2][k],
        board[i + 2][k + 1],
        board[i + 2][k + 2],
      ];

      if (!isValid(square)) {
        return false;
      }
    }
  }

  return true;
};

function isValid(row) {
  const set = new Set();
  for (let i = 0; i < row.length; ++i) {
    const value = row[i];
    if (value.length !== 1) {
      return false;
    }

    if (value !== '.') {
      const nb = parseInt(value, 10);
      if (!nb) {
        return false;
      }

      if (set.has(nb)) {
        return false;
      }

      set.add(nb);
    }
  }

  return true;
}