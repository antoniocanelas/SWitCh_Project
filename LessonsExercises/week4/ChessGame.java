package week4;

public class ChessGame {
	public static final int CHESS_MAX_INDEX=7, CHESS_MIN_INDEX=0;
	public static char[][] movePiece(char[][] chessTable, int[] initialPosition, int[] finalPosition) {

		char pieceType = chessTable[initialPosition[0]][initialPosition[1]];
		chessTable[initialPosition[0]][initialPosition[1]] = 'L';
		chessTable[finalPosition[0]][finalPosition[1]] = pieceType;
		return chessTable;

	}
	
	public static boolean isValidPlay(char[][] chessTable, int[] initialPosition, int[] finalPosition) {
		char pieceType = chessTable[initialPosition[0]][initialPosition[1]];
		
		switch (pieceType) {
		case 'T':
			if (!isRookMovementValid(chessTable, initialPosition, finalPosition)) return false;
			break;
		case 't':
			if (!isRookMovementValid(chessTable, initialPosition, finalPosition)) return false;
			break;
			
		case 'B':
			if (!isBishopMovementValid(chessTable, initialPosition, finalPosition)) return false;
			break;
		case 'b':
			if (!isBishopMovementValid(chessTable, initialPosition, finalPosition)) return false;
			break;
			
		case 'Q':
			if (!isQueenMovementValid(chessTable, initialPosition, finalPosition)) return false;
			break;
		case 'q':
			if (!isQueenMovementValid(chessTable, initialPosition, finalPosition)) return false;
			break;
			
		case 'K':
			if (!isKingMovementValid(chessTable, initialPosition, finalPosition)) return false;
			break;
		case 'k':
			if (!isKingMovementValid(chessTable, initialPosition, finalPosition)) return false;
			break;
			
		case 'P':
			if (!isWhitePawnMovementValid(chessTable, initialPosition, finalPosition)) return false;
			break;
		case 'p':
			if (!isBlackPawnMovementValid(chessTable, initialPosition, finalPosition)) return false;
			break;
			
		default:
			return false;
		}
		return true;
	}


	public static boolean isChessValid(char[][] tabuleiro) {

		if (!(tabuleiro.length == 8))
			return false;
		for (int line = 0; line < 8; line++) {
			if (!(tabuleiro[line].length == 8))
				return false;
		}
		return true;
	}

	public static boolean isPostionValid(int[] piecePosition) {
		
		
		if (!(piecePosition[0] >= CHESS_MIN_INDEX))
			return false;
		if (!(piecePosition[0] <= CHESS_MAX_INDEX))
			return false;
		if (!(piecePosition[1] >= CHESS_MIN_INDEX))
			return false;
		if (!(piecePosition[1] <= CHESS_MAX_INDEX))
			return false;

		return true;

	}

	public static boolean areDiferentPositions(int[] initialPosition, int[] finalPosition) {
		if (!(initialPosition != finalPosition)) {
			return false;
		}
		return true;
	}

	public static boolean isRookMovementValid(char[][] chessTable, int[] initialPosition, int[] finalPosition) {
		if (!isChessValid(chessTable))
			return false;
		if (!isPostionValid(initialPosition))
			return false;
		if (!isPostionValid(finalPosition))
			return false;
		if (!areDiferentPositions(initialPosition, finalPosition))
			return false;
		if (!isFinalPostionValid(chessTable, initialPosition, finalPosition))
			return false;
		if (!isFreePathRook(chessTable, initialPosition, finalPosition))
			return false;
		return true;
	}

	public static boolean isBishopMovementValid(char[][] chessTable, int[] initialPosition, int[] finalPosition) {
		if (!isChessValid(chessTable))
			return false;
		if (!isPostionValid(initialPosition))
			return false;
		if (!isPostionValid(finalPosition))
			return false;
		if (!areDiferentPositions(initialPosition, finalPosition))
			return false;
		if (!isFinalPostionValid(chessTable, initialPosition, finalPosition))
			return false;
		if (!isFreePathBishop(chessTable, initialPosition, finalPosition))
			return false;
		return true;

	}

	public static boolean isQueenMovementValid(char[][] chessTable, int[] initialPosition, int[] finalPosition) {
		if (!isChessValid(chessTable))
			return false;
		if (!isPostionValid(initialPosition))
			return false;
		if (!isPostionValid(finalPosition))
			return false;
		if (!areDiferentPositions(initialPosition, finalPosition))
			return false;
		if (!isFinalPostionValid(chessTable, initialPosition, finalPosition))
			return false;
		if (!isFreePathQueen(chessTable, initialPosition, finalPosition))
			return false;
		return true;

	}

	public static boolean isKingMovementValid(char[][] chessTable, int[] initialPosition, int[] finalPosition) {
		if (!isChessValid(chessTable))
			return false;
		if (!isPostionValid(initialPosition))
			return false;
		if (!isPostionValid(finalPosition))
			return false;
		if (!areDiferentPositions(initialPosition, finalPosition))
			return false;
		if (!isFinalPostionValid(chessTable, initialPosition, finalPosition))
			return false;
		if (!isKingMovementOneSquare(chessTable, initialPosition, finalPosition))
			return false;
		return true;

	}

	public static boolean isKnightMovementValid(char[][] chessTable, int[] initialPosition, int[] finalPosition) {
		if (!isChessValid(chessTable))
			return false;
		if (!isPostionValid(initialPosition))
			return false;
		if (!isPostionValid(finalPosition))
			return false;
		if (!areDiferentPositions(initialPosition, finalPosition))
			return false;
		if (!isFinalPostionValid(chessTable, initialPosition, finalPosition))
			return false;
		if (!isLKnightMovement(chessTable, initialPosition, finalPosition))
			return false;
		return true;

	}

	public static boolean isWhitePawnMovementValid(char[][] chessTable, int[] initialPosition, int[] finalPosition) {
	
		if (!isChessValid(chessTable))
			return false;
		if (!isPostionValid(initialPosition))
			return false;
		if (!isPostionValid(finalPosition))
			return false;
		if (!areDiferentPositions(initialPosition, finalPosition))
			return false;
		if (!isFinalPostionValid(chessTable, initialPosition, finalPosition))
			return false;
		if (!isPawnMovementOK(chessTable, initialPosition, finalPosition))
			return false;
		return true;
	
	}

	public static boolean isBlackPawnMovementValid(char[][] tabuleiro, int[] posicaoInicial, int[] posicaoFinal) {
		if (!isWhitePawnMovementValid(chessTableMirror(tabuleiro), arrayMirror(posicaoInicial),
				arrayMirror(posicaoFinal)))
			return false;
	
		return true;
	
	}

	public static boolean isFinalPostionValid(char[][] tabuleiro, int[] posicaoInical, int[] posicaoFinal) {
		boolean verificarDestino;

		if (tabuleiro[posicaoFinal[0]][posicaoFinal[1]] == 'L') {// se livre
			verificarDestino = true;
		} else if ((!Character.isUpperCase(tabuleiro[posicaoInical[0]][posicaoInical[1]])) == (Character
				.isUpperCase(tabuleiro[posicaoFinal[0]][posicaoFinal[1]]))) {// se cores diferentes
			verificarDestino = true;
		} else {
			verificarDestino = false;

		}
		return verificarDestino;
	}

	public static boolean isFreeRow(char[][] tabuleiro, int[] posicaoInical, int[] posicaoFinal) {

		int movimentoHorizontal = posicaoFinal[1] - posicaoInical[1];
		int sentidoHorizontal = movimentoHorizontal / Math.abs(movimentoHorizontal);
		int numeroCasasTotal = Math.abs(movimentoHorizontal);

		for (int movimentoCasaNumero = 1; movimentoCasaNumero < numeroCasasTotal; movimentoCasaNumero++) {
			if (tabuleiro[posicaoInical[0]][posicaoInical[1] + movimentoCasaNumero * sentidoHorizontal] != 'L') {
				return false;
			}
		}
		return true;

	}

	public static boolean isFreeColumn(char[][] tabuleiro, int[] posicaoInical, int[] posicaoFinal) {
		int movimentoVertical;
		movimentoVertical = posicaoFinal[0] - posicaoInical[0];
		int sentidoVertical = movimentoVertical / Math.abs(movimentoVertical);
		int numeroCasasTotal = Math.abs(movimentoVertical);

		for (int movimentoCasaNumero = 1; movimentoCasaNumero < numeroCasasTotal; movimentoCasaNumero++) {
			if (tabuleiro[posicaoInical[0] + movimentoCasaNumero * sentidoVertical][posicaoInical[1]] != 'L') {
				return false;
			}
		}
		return true;

	}

	public static boolean isFreeDiagonalUp(char[][] tabuleiro, int[] posicaoInical, int[] posicaoFinal) {
		int movimentoDiagonalCres;
		movimentoDiagonalCres = posicaoFinal[0] - posicaoInical[0];
		int sentidoCres = movimentoDiagonalCres / Math.abs(movimentoDiagonalCres);
		int numeroCasasTotal = Math.abs(movimentoDiagonalCres);
		for (int movimentoCasaNumero = 1; movimentoCasaNumero < numeroCasasTotal; movimentoCasaNumero++) {

			if (tabuleiro[posicaoInical[0] + movimentoCasaNumero * sentidoCres][posicaoInical[1]
					- movimentoCasaNumero * sentidoCres] != 'L') {
				return false;
			}

		}

		return true;
	}

	public static boolean isFreeDiagonalDown(char[][] tabuleiro, int[] posicaoInical, int[] posicaoFinal) {
		int movimentoDiagonalDec;
		movimentoDiagonalDec = posicaoFinal[0] - posicaoInical[0];
		int sentidoDec = movimentoDiagonalDec / Math.abs(movimentoDiagonalDec);
		int numeroCasasTotal = Math.abs(movimentoDiagonalDec);
		for (int movimentoCasaNumero = 1; movimentoCasaNumero < numeroCasasTotal; movimentoCasaNumero++) {
			//
			if (tabuleiro[posicaoInical[0] + movimentoCasaNumero * sentidoDec][posicaoInical[1]
					+ movimentoCasaNumero * sentidoDec] != 'L') {
				return false;
			}

		}

		return true;
	}

	public static boolean isFreePathRook(char[][] chessTable, int[] initialPosition, int[] finalPosition) {
		boolean isLineMovement;
		boolean isRowMovement;

		isRowMovement = (finalPosition[1] - initialPosition[1] != 0) && (finalPosition[0] - initialPosition[0] == 0);
		isLineMovement = (finalPosition[0] - initialPosition[0] != 0) && (finalPosition[1] - initialPosition[1] == 0);

		if (isRowMovement) {
			if (isFreeRow(chessTable, initialPosition, finalPosition))
				return true;
			else
				return false;
		}

		if (isLineMovement) {
			if (isFreeColumn(chessTable, initialPosition, finalPosition))
				return true;
			else
				return false;
		}
		return false;

	}

	public static boolean isFreePathBishop(char[][] chessTable, int[] initialPosition, int[] finalPosition) {
		boolean isMovimentoDiagonalCres;
		boolean isMovimentoDiagonalDec;

		isMovimentoDiagonalCres = (finalPosition[0] - initialPosition[0]) == -(finalPosition[1] - initialPosition[1]);
		isMovimentoDiagonalDec = (finalPosition[0] - initialPosition[0]) == (finalPosition[1] - initialPosition[1]);

		if (isMovimentoDiagonalCres) {
			if (isFreeDiagonalUp(chessTable, initialPosition, finalPosition))
				return true;
			else
				return false;
		}
		if (isMovimentoDiagonalDec) {
			if (isFreeDiagonalDown(chessTable, initialPosition, finalPosition))
				return true;
			else
				return false;
		}
		return false;

	}

	public static boolean isFreePathQueen(char[][] chessTable, int[] initialPosition, int[] finalPosition) {
		boolean isLineMovement;
		boolean isRowMovement;
		boolean isMovimentoDiagonalCres;
		boolean isMovimentoDiagonalDec;

		isRowMovement = (finalPosition[1] - initialPosition[1] != 0) && (finalPosition[0] - initialPosition[0] == 0);
		isLineMovement = (finalPosition[0] - initialPosition[0] != 0) && (finalPosition[1] - initialPosition[1] == 0);
		
		isMovimentoDiagonalCres = (finalPosition[0] - initialPosition[0]) == -(finalPosition[1] - initialPosition[1]);
		isMovimentoDiagonalDec = (finalPosition[0] - initialPosition[0]) == (finalPosition[1] - initialPosition[1]);

		if (isRowMovement) {
			if (isFreeRow(chessTable, initialPosition, finalPosition))
				return true;
			else
				return false;
		}

		if (isLineMovement) {
			if (isFreeColumn(chessTable, initialPosition, finalPosition))
				return true;
			else
				return false;
		}

		if (isMovimentoDiagonalCres) {
			if (isFreeDiagonalUp(chessTable, initialPosition, finalPosition))
				return true;
			else
				return false;
		}
		if (isMovimentoDiagonalDec) {
			if (isFreeDiagonalDown(chessTable, initialPosition, finalPosition))
				return true;
			else
				return false;
		}
		return false;
	}

	public static boolean isKingMovementOneSquare(char[][] chessTable, int[] initialPosition, int[] finalPosition) {

		if (!(Math.abs(initialPosition[0] - finalPosition[0]) <= 1))
			return false;

		if (!(Math.abs(initialPosition[1] - finalPosition[1]) <= 1))
			return false;

		return true;
	}

	public static boolean isLKnightMovement(char[][] chessTable, int[] initialPosition, int[] finalPosition) {

		boolean movementLA;
		boolean movementLB;

		movementLA = (((Math.abs(finalPosition[0] - initialPosition[0])) == 2
				&& (Math.abs(finalPosition[1] - initialPosition[1])) == 1));
		movementLB = (((Math.abs(finalPosition[0] - initialPosition[0])) == 1
				&& (Math.abs(finalPosition[1] - initialPosition[1])) == 2));
		if (!(movementLA) && !(movementLB))
			return false;

		return true;

	}

	public static boolean isPawnMovementOK(char[][] chessTable, int[] initialPosition, int[] finalPosition) {

		// Movimento do peão branco 1 casa frente
		if (((initialPosition[0] - finalPosition[0]) == 1) && ((initialPosition[1] - finalPosition[1]) == 0)) {

			if (!(chessTable[finalPosition[0]][finalPosition[1]] == 'L'))
				return false;
		}

		// Primeiro movimento do peão branco pode ser 2 casas
		if (((initialPosition[0] - finalPosition[0]) == 2) && ((initialPosition[1] - finalPosition[1]) == 0)) {
			if (!(chessTable[finalPosition[0]][finalPosition[1] + 1] == 'L'))
				return false;
			if (!(chessTable[finalPosition[0]][finalPosition[1]] == 'L'))
				return false;
		}

		// Comer diagonal - 1 casa para a frente e 1 casa para o lado
		if (((initialPosition[0] - finalPosition[0]) == 1) && (Math.abs((initialPosition[1] - finalPosition[1])) == 1))

		{
			if (!((chessTable[finalPosition[0]][finalPosition[1]] != 'L'))
					|| (!(isFinalPostionValid(chessTable, initialPosition, finalPosition))))
				return false;
			// Não pode ser vazia 'L' e tem de ser de cor oposta
		}

		return true;
	}

	public static char[][] chessTableMirror(char[][] chessTable) {
		char[][] chessTableMirror = new char[8][8];
		for (int row = 0; row <= 7; row++) {
			chessTableMirror[7 - row] = chessTable[row];
		}

		return chessTableMirror;

	}

	public static int[] arrayMirror(int[] arrayPosition) {
		int[] arrayMirror = new int[2];
		arrayMirror[0] = 7 - arrayPosition[0];
		arrayMirror[1] = arrayPosition[1];

		return arrayMirror;

	}

}
