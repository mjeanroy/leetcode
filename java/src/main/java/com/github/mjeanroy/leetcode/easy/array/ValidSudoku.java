package com.github.mjeanroy.leetcode.easy.array;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

	public static boolean isValidSudoku(char[][] board) {
		// Validate each rows
		for (char[] row : board) {
			if (containsDuplicateNumbers(row)) {
				return false;
			}
		}

		// Validate each columns
		for (int i = 0; i < 9; ++i) {
			char[] column = new char[] {
					board[0][i],
					board[1][i],
					board[2][i],
					board[3][i],
					board[4][i],
					board[5][i],
					board[6][i],
					board[7][i],
					board[8][i]
			};

			if (containsDuplicateNumbers(column)) {
				return false;
			}
		}

		// Validate squares
		for (int i = 0; i < 9; i += 3) {
			for (int k = 0; k < 9; k += 3) {
				char[] square = new char[]{
						board[i][k],
						board[i][k + 1],
						board[i][k + 2],
						board[i + 1][k],
						board[i + 1][k + 1],
						board[i + 1][k + 2],
						board[i + 2][k],
						board[i + 2][k + 1],
						board[i + 2][k + 2]
				};

				if (containsDuplicateNumbers(square)) {
					return false;
				}
			}
		}

		return true;
	}

	private static boolean containsDuplicateNumbers(char[] row) {
		Set<Integer> visited = new HashSet<>();
		for (char c : row) {
			if (c != '.') {
				int value = toInt(c);
				if (visited.contains(value)) {
					return true;
				}

				visited.add(value);
			}
		}

		return false;
	}

	private static int toInt(char c) {
		return c - '0';
	}
}
