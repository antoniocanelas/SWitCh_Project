package week4;

import static org.junit.Assert.*;

import org.junit.Test;

import week4.ChessGame;

public class ChessGameTest {
	char[][] initialTable = { { 't', 'c', 'b', 'q', 'r', 'b', 'c', 't' }, { 'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p' },
			{ 'P', 'L', 'L', 'L', 'T', 'L', 'L', 'L' }, { 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L' },
			{ 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L' }, { 'p', 'L', 'L', 'L', 'b', 'L', 'L', 'L' },
			{ 'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P' }, { 'T', 'C', 'B', 'Q', 'R', 'B', 'C', 'T' } };

	char[][] rookTable = { { 'L', 'L', 'L', 'L', 'P', 'L', 'L', 'L' }, { 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L' },
			{ 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L' }, { 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L' },
			{ 'L', 'c', 'L', 'L', 'T', 'L', 'c', 'L' }, { 'L', 'L', 'T', 'L', 'L', 'L', 'L', 'L' },
			{ 'L', 'L', 'L', 'L', 'c', 'L', 'L', 'L' }, { 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L' } };

	char[][] bishopTable = { { 'B', 'L', 'L', 'L', 'L', 'L', 'L', 'L' }, { 'L', 'T', 'L', 'L', 'L', 'L', 'L', 'L' },
			{ 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L' }, { 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L' },
			{ 'L', 'L', 'L', 'L', 'b', 'L', 'L', 'L' }, { 'L', 'L', 'T', 'L', 'L', 'L', 'L', 'L' },
			{ 'L', 'L', 'T', 'L', 'L', 'L', 'L', 'L' }, { 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'r' } };

	char[][] queenTable = { { 'L', 'L', 'L', 'L', 'P', 'L', 'L', 'L' }, { 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L' },
			{ 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L' }, { 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L' },
			{ 'L', 'c', 'L', 'L', 'Q', 'L', 'c', 'L' }, { 'L', 'L', 'T', 'L', 'L', 'L', 'L', 'L' },
			{ 'L', 'L', 'L', 'L', 'c', 'L', 'L', 'L' }, { 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L' } };

	char[][] kingAndOthersTable = { { 'L', 'L', 'L', 'L', 'P', 'L', 'L', 'L' },
			{ 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L' }, { 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L' },
			{ 'L', 'L', 'c', 'c', 'L', 'L', 'L', 'L' }, { 'L', 'c', 'L', 'C', 'R', 'L', 'c', 'L' },
			{ 'L', 'b', 'T', 'L', 'L', 'b', 'L', 'L' }, { 'L', 'L', 'L', 'L', 'c', 'L', 'L', 'L' },
			{ 'L', 'L', 'L', 'L', 'L', 'L', 'L', 'L' } };

	// *** isChessValid ***
	@Test
	public void initialTable() {
		assertTrue(ChessGame.isChessValid(initialTable));

	}

	@Test
	public void rookTable() {
		assertTrue(ChessGame.isChessValid(rookTable));

	}

	// *** isFreeColumn ***
	@Test
	public void isFreeColumn1() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 1, 4 };
		assertTrue(ChessGame.isFreeColumn(rookTable, intialposition, finalPosition));

	}

	@Test
	public void isFreeColumn2() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 5, 4 };
		assertTrue(ChessGame.isFreeColumn(rookTable, intialposition, finalPosition));

	}

	@Test
	public void isFreeColumn3() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 7, 4 };
		assertFalse(ChessGame.isFreeColumn(rookTable, intialposition, finalPosition));

	}

	// *** isFreeRow ***
	@Test
	public void isFreeRow1() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 4, 2 };
		assertTrue(ChessGame.isFreeRow(rookTable, intialposition, finalPosition));

	}

	@Test
	public void isFreeRow2() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 4, 3 };
		assertTrue(ChessGame.isFreeRow(rookTable, intialposition, finalPosition));

	}

	@Test
	public void isFreeRow3() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 4, 0 };
		assertFalse(ChessGame.isFreeRow(rookTable, intialposition, finalPosition));

	}

	// *** isFinalPostionValid ***
	@Test
	public void isFinalPostionValid1() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 6, 4 };
		assertTrue(ChessGame.isFinalPostionValid(rookTable, intialposition, finalPosition));
	}

	@Test
	public void isFinalPostionValid2() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 1, 4 };
		assertTrue(ChessGame.isFinalPostionValid(rookTable, intialposition, finalPosition));
	}

	@Test
	public void isFinalPostionValid3() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 0, 4 };
		assertFalse(ChessGame.isFinalPostionValid(rookTable, intialposition, finalPosition));
	}

	// *** isFreeDiagonalUp ***
	@Test
	public void isFreeDiagonalUp1() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 2, 6 };
		assertTrue(ChessGame.isFreeDiagonalUp(bishopTable, intialposition, finalPosition));

	}

	@Test
	public void isFreeDiagonalUp2() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 6, 2 };
		assertTrue(ChessGame.isFreeDiagonalUp(bishopTable, intialposition, finalPosition));

	}

	@Test
	public void isFreeDiagonalUp3() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 7, 1 };
		assertFalse(ChessGame.isFreeDiagonalUp(bishopTable, intialposition, finalPosition));

	}

	// *** isFreeDiagonalDown ***
	@Test
	public void isFreeDiagonalDown1() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 6, 6 };
		assertTrue(ChessGame.isFreeDiagonalDown(bishopTable, intialposition, finalPosition));

	}

	@Test
	public void isFreeDiagonalDown2() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 2, 2 };
		assertTrue(ChessGame.isFreeDiagonalDown(bishopTable, intialposition, finalPosition));

	}

	@Test
	public void isFreeDiagonalDown3() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 0, 0 };
		assertFalse(ChessGame.isFreeDiagonalDown(bishopTable, intialposition, finalPosition));

	}

	// *** isFreeColumn Queen********
	@Test
	public void isFreeColumnQueen1() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 1, 4 };
		assertTrue(ChessGame.isFreeColumn(queenTable, intialposition, finalPosition));

	}

	@Test
	public void isFreeColumnQueen2() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 5, 4 };

		assertTrue(ChessGame.isFreeColumn(queenTable, intialposition, finalPosition));

	}

	@Test
	public void isFreeColumnQueen3() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 7, 4 };

		assertFalse(ChessGame.isFreeColumn(queenTable, intialposition, finalPosition));

	}

	// *** isFreeRow Queen********
	@Test
	public void isFreeRowQueen1() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 4, 2 };
		assertTrue(ChessGame.isFreeRow(queenTable, intialposition, finalPosition));

	}

	@Test
	public void isFreeRowQueen2() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 4, 3 };

		assertTrue(ChessGame.isFreeRow(queenTable, intialposition, finalPosition));

	}

	@Test
	public void isFreeRowQueen3() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 4, 0 };
		assertFalse(ChessGame.isFreeRow(queenTable, intialposition, finalPosition));

	}

	// *** isKingMovementValid ***
	@Test
	public void isKingMovementValid1() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 3, 3 };
		assertTrue(ChessGame.isKingMovementValid(kingAndOthersTable, intialposition, finalPosition));

	}

	@Test
	public void isKingMovementValid2() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 4, 5 };
		assertTrue(ChessGame.isKingMovementValid(kingAndOthersTable, intialposition, finalPosition));

	}

	@Test
	public void isKingMovementValid3() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 4, 3 };
		assertFalse(ChessGame.isKingMovementValid(kingAndOthersTable, intialposition, finalPosition));

	}

	// *** isKnightMovementValid ***
	@Test
	public void isKnightMovementValid1() {
		int[] intialposition = { 3, 2 };
		int[] finalPosition = { 4, 0 };
		assertTrue(ChessGame.isKnightMovementValid(kingAndOthersTable, intialposition, finalPosition));

	}

	@Test
	public void isKnightMovementValid2() {
		int[] intialposition = { 3, 2 };
		int[] finalPosition = { 4, 4 };
		assertTrue(ChessGame.isKnightMovementValid(kingAndOthersTable, intialposition, finalPosition));

	}

	@Test
	public void isKnightMovementValid3() {
		int[] intialposition = { 3, 2 };
		int[] finalPosition = { 5, 1 };
		assertFalse(ChessGame.isKnightMovementValid(kingAndOthersTable, intialposition, finalPosition));

	}

	// *** chessTableMirror ***
	@Test
	public void chessTableMirror() {
		char[] array = { 'L', 'L', 'L', 'L', 'P', 'L', 'L', 'L' };
		assertArrayEquals(array, ChessGame.chessTableMirror(kingAndOthersTable)[7]);
	}

	// *** chessTableMirror ***
	@Test
	public void intialpositionMirrored() {
		int[] intialposition = { 6, 3 };
		int[] intialpositionMirrored = { 1, 3 };
		assertArrayEquals(intialpositionMirrored, ChessGame.arrayMirror(intialposition));
	}

	// *** isWhitePawnMovementValid ***
	@Test
	public void isWhitePawnMovementValid1() {
		int[] intialposition = { 6, 3 };
		int[] finalPosition = { 5, 3 };
		assertTrue(ChessGame.isWhitePawnMovementValid(initialTable, intialposition, finalPosition));
	}

	@Test
	public void isWhitePawnMovementValid2() {
		int[] intialposition = { 6, 3 };
		int[] finalPosition = { 4, 3 };
		assertTrue(ChessGame.isWhitePawnMovementValid(initialTable, intialposition, finalPosition));
	}

	@Test
	public void isWhitePawnMovementValid3() {
		int[] intialposition = { 6, 3 };
		int[] finalPosition = { 5, 4 };
		assertTrue(ChessGame.isWhitePawnMovementValid(initialTable, intialposition, finalPosition));
	}

	@Test
	public void isWhitePawnMovementValid4() {
		int[] intialposition = { 6, 5 };
		int[] finalPosition = { 5, 4 };
		assertTrue(ChessGame.isWhitePawnMovementValid(initialTable, intialposition, finalPosition));
	}

	@Test
	public void isWhitePawnMovementValid5() {
		int[] intialposition = { 6, 0 };
		int[] finalPosition = { 5, 0 };
		assertFalse(ChessGame.isWhitePawnMovementValid(initialTable, intialposition, finalPosition));
	}

	// *** isBlackPawnMovementValid ***
	@Test
	public void isBlackPawnMovementValid1() {
		int[] intialposition = { 1, 3 };
		int[] finalPosition = { 2, 3 };
		assertTrue(ChessGame.isBlackPawnMovementValid(initialTable, intialposition, finalPosition));
	}

	@Test
	public void isBlackPawnMovementValid2() {
		int[] intialposition = { 1, 3 };
		int[] finalPosition = { 3, 3 };
		assertTrue(ChessGame.isBlackPawnMovementValid(initialTable, intialposition, finalPosition));
	}

	@Test
	public void isBlackPawnMovementValid3() {
		int[] intialposition = { 1, 3 };
		int[] finalPosition = { 2, 4 };
		assertTrue(ChessGame.isBlackPawnMovementValid(initialTable, intialposition, finalPosition));
	}

	@Test
	public void isBlackPawnMovementValid4() {
		int[] intialposition = { 1, 5 };
		int[] finalPosition = { 2, 4 };
		assertTrue(ChessGame.isBlackPawnMovementValid(initialTable, intialposition, finalPosition));
	}

	@Test
	public void isBlackPawnMovementValid5() {
		int[] intialposition = { 1, 0 };
		int[] finalPosition = { 2, 0 };
		assertFalse(ChessGame.isBlackPawnMovementValid(initialTable, intialposition, finalPosition));
	}

	// ****************** isPlayValid ***********************

	// *** isChessValid ***

	@Test
	public void isValidPlay1() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 1, 4 };
		assertTrue(ChessGame.isValidPlay(rookTable, intialposition, finalPosition));

	}

	@Test
	public void isValidPlay2() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 5, 4 };
		assertTrue(ChessGame.isValidPlay(rookTable, intialposition, finalPosition));

	}

	@Test
	public void isValidPlay3() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 7, 4 };
		assertFalse(ChessGame.isValidPlay(rookTable, intialposition, finalPosition));

	}

	@Test
	public void isValidPlay4() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 4, 2 };
		assertTrue(ChessGame.isValidPlay(rookTable, intialposition, finalPosition));

	}

	@Test
	public void isValidPlay5() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 4, 3 };
		assertTrue(ChessGame.isValidPlay(rookTable, intialposition, finalPosition));

	}

	@Test
	public void isValidPlay6() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 4, 0 };
		assertFalse(ChessGame.isValidPlay(rookTable, intialposition, finalPosition));

	}

	@Test
	public void isValidPlay7() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 6, 4 };
		assertTrue(ChessGame.isValidPlay(rookTable, intialposition, finalPosition));
	}

	@Test
	public void isValidPlay8() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 1, 4 };
		assertTrue(ChessGame.isValidPlay(rookTable, intialposition, finalPosition));
	}

	@Test
	public void isValidPlay9() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 0, 4 };
		assertFalse(ChessGame.isValidPlay(rookTable, intialposition, finalPosition));
	}

	// *** isFreeDiagonalUp ***
	@Test
	public void isValidPlay10() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 2, 6 };
		assertTrue(ChessGame.isValidPlay(bishopTable, intialposition, finalPosition));

	}

	@Test
	public void isValidPlay11() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 6, 2 };
		assertTrue(ChessGame.isValidPlay(bishopTable, intialposition, finalPosition));

	}

	@Test
	public void isValidPlay12() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 7, 1 };
		assertFalse(ChessGame.isValidPlay(bishopTable, intialposition, finalPosition));

	}

	// *** isFreeDiagonalDown ***
	@Test
	public void isValidPlay13() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 6, 6 };
		assertTrue(ChessGame.isValidPlay(bishopTable, intialposition, finalPosition));

	}

	@Test
	public void isValidPlay14() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 2, 2 };
		assertTrue(ChessGame.isValidPlay(bishopTable, intialposition, finalPosition));

	}

	@Test
	public void isValidPlay15() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 0, 0 };
		assertFalse(ChessGame.isValidPlay(bishopTable, intialposition, finalPosition));

	}

	@Test
	public void isValidPlay16() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 1, 4 };
		assertTrue(ChessGame.isValidPlay(queenTable, intialposition, finalPosition));

	}

	@Test
	public void isValidPlay17() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 5, 4 };

		assertTrue(ChessGame.isValidPlay(queenTable, intialposition, finalPosition));

	}

	@Test
	public void isValidPlay18() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 7, 4 };

		assertFalse(ChessGame.isValidPlay(queenTable, intialposition, finalPosition));

	}

	// *** isFreeRow Queen********
	@Test
	public void isValidPlay19() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 4, 2 };
		assertTrue(ChessGame.isValidPlay(queenTable, intialposition, finalPosition));

	}

	@Test
	public void isValidPlay20() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 4, 3 };

		assertTrue(ChessGame.isValidPlay(queenTable, intialposition, finalPosition));

	}

	@Test
	public void isValidPlay21() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 4, 0 };
		assertFalse(ChessGame.isValidPlay(queenTable, intialposition, finalPosition));

	}

	// *** isKingMovementValid ***
//	@Test
//	public void isValidPlay22() {
//		int[] intialposition = { 4, 4 };
//		int[] finalPosition = { 3, 3 };
//		assertTrue(ChessGame.isValidPlay(kingAndOthersTable, intialposition, finalPosition));
//
//	}

//	@Test
//	public void isValidPlay23() {
//		int[] intialposition = { 4, 4 };
//		int[] finalPosition = { 4, 5 };
//		assertTrue(ChessGame.isValidPlay(kingAndOthersTable, intialposition, finalPosition));
//
//	}

	@Test
	public void isValidPlay24() {
		int[] intialposition = { 4, 4 };
		int[] finalPosition = { 4, 3 };
		assertFalse(ChessGame.isValidPlay(kingAndOthersTable, intialposition, finalPosition));

	}

//	@Test
//	public void isValidPlay25() {
//		int[] intialposition = { 3, 2 };
//		int[] finalPosition = { 4, 0 };
//		assertTrue(ChessGame.isValidPlay(kingAndOthersTable, intialposition, finalPosition));
//
//	}

	@Test
	public void isKnightMovementValid25() {
		int[] intialposition = { 3, 2 };
		int[] finalPosition = { 4, 4 };
		assertTrue(ChessGame.isKnightMovementValid(kingAndOthersTable, intialposition, finalPosition));

	}

	@Test
	public void isValidPlay26() {
		int[] intialposition = { 3, 2 };
		int[] finalPosition = { 5, 1 };
		assertFalse(ChessGame.isValidPlay(kingAndOthersTable, intialposition, finalPosition));

	}

	@Test
	public void isValidPlay27() {
		int[] intialposition = { 6, 3 };
		int[] finalPosition = { 5, 3 };
		assertTrue(ChessGame.isValidPlay(initialTable, intialposition, finalPosition));
	}

	@Test
	public void isValidPlay28() {
		int[] intialposition = { 6, 3 };
		int[] finalPosition = { 4, 3 };
		assertTrue(ChessGame.isValidPlay(initialTable, intialposition, finalPosition));
	}

	@Test
	public void isValidPlay29() {
		int[] intialposition = { 6, 3 };
		int[] finalPosition = { 5, 4 };
		assertTrue(ChessGame.isValidPlay(initialTable, intialposition, finalPosition));
	}

	@Test
	public void isValidPlay30() {
		int[] intialposition = { 6, 5 };
		int[] finalPosition = { 5, 4 };
		assertTrue(ChessGame.isValidPlay(initialTable, intialposition, finalPosition));
	}

	@Test
	public void isValidPlay31() {
		int[] intialposition = { 6, 0 };
		int[] finalPosition = { 5, 0 };
		assertFalse(ChessGame.isValidPlay(initialTable, intialposition, finalPosition));
	}

	// *** isBlackPawnMovementValid ***
	@Test
	public void isValidPlay32() {
		int[] intialposition = { 1, 3 };
		int[] finalPosition = { 2, 3 };
		assertTrue(ChessGame.isValidPlay(initialTable, intialposition, finalPosition));
	}

	@Test
	public void isValidPlay33() {
		int[] intialposition = { 1, 3 };
		int[] finalPosition = { 3, 3 };
		assertTrue(ChessGame.isValidPlay(initialTable, intialposition, finalPosition));
	}

	@Test
	public void isValidPlay34() {
		int[] intialposition = { 1, 3 };
		int[] finalPosition = { 2, 4 };
		assertTrue(ChessGame.isValidPlay(initialTable, intialposition, finalPosition));
	}

	@Test
	public void isValidPlay35() {
		int[] intialposition = { 1, 5 };
		int[] finalPosition = { 2, 4 };
		assertTrue(ChessGame.isValidPlay(initialTable, intialposition, finalPosition));
	}

	@Test
	public void isValidPlay36() {
		int[] intialposition = { 1, 0 };
		int[] finalPosition = { 2, 0 };
		assertFalse(ChessGame.isValidPlay(initialTable, intialposition, finalPosition));
	}
}
