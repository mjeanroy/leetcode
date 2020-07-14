package com.github.mjeanroy.leetcode.easy.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidSudokuTest {

	@Test
	void case1() {
		char[][] board = new char[][]{
				new char[]{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
				new char[]{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
				new char[]{'.', '9', '8', '.', '.', '.', '.', '6', '.'},

				new char[]{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
				new char[]{'4', '.', '.', '8', '.', '3', '.', '.', '1'},
				new char[]{'7', '.', '.', '.', '2', '.', '.', '.', '6'},


				new char[]{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
				new char[]{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
				new char[]{'.', '.', '.', '.', '8', '.', '.', '7', '9'}
		};

		boolean isValid = ValidSudoku.isValidSudoku(board);

		assertThat(isValid).isTrue();
	}

	@Test
	void case2() {
		char[][] board = new char[][]{
				new char[]{'8', '3', '.', '.', '7', '.', '.', '.', '.'},
				new char[]{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
				new char[]{'.', '9', '8', '.', '.', '.', '.', '6', '.'},

				new char[]{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
				new char[]{'4', '.', '.', '8', '.', '3', '.', '.', '1'},
				new char[]{'7', '.', '.', '.', '2', '.', '.', '.', '6'},


				new char[]{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
				new char[]{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
				new char[]{'.', '.', '.', '.', '8', '.', '.', '7', '9'}
		};

		boolean isValid = ValidSudoku.isValidSudoku(board);

		assertThat(isValid).isFalse();
	}

	@Test
	void case3() {
		char[][] board = new char[][]{
				new char[]{'.', '.', '4', '.', '.', '.', '6', '3', '.'},
				new char[]{'.', '.', '.', '.', '.', '.', '.', '.', '.'},
				new char[]{'5', '.', '.', '.', '.', '.', '.', '9', '.'},

				new char[]{'.', '.', '.', '5', '6', '.', '.', '.', '.'},
				new char[]{'4', '.', '3', '.', '.', '.', '.', '.', '1'},
				new char[]{'.', '.', '.', '7', '.', '.', '.', '.', '.'},

				new char[]{'.', '.', '.', '5', '.', '.', '.', '.', '.'},
				new char[]{'.', '.', '.', '.', '.', '.', '.', '.', '.'},
				new char[]{'.', '.', '.', '.', '.', '.', '.', '.', '.'}
		};

		boolean isValid = ValidSudoku.isValidSudoku(board);

		assertThat(isValid).isFalse();
	}
}
