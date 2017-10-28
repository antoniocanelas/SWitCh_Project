package week4;

import java.util.Arrays;

public class SquarePaint {

	public static char[] steps = { 'P', 'F', 'P', 'F', 'R', 'R', 'R', 'F', 'F', 'P', 'R', 'R', 'F', 'P', 'R', 'F', 'P', 'R',
			'R', 'F', 'F', 'F' };
	public static char[][] matrix = new char[6][6];
	public static String direction = "RIGHT";
	public static char step = 'F';
	public static int[] positionCoordinates = { 0, 0 };
	public static final int TABLE_LIMIT = 5;
	public static int charFind;
	public static char[] newStepsArray;
	public static int numberOfRemovedSteps = 0;

	/**
	 * Game have a table, the goal is to move and paint the desired squares. For
	 * that there are 3 different instructions one to move, other to rotate and the
	 * last to paint the actual square.
	 * 
	 * @param
	 */
	public static void main(String[] args) {
		drawMatrix(steps, matrix);
		newSteps();
		printMatrix(matrix);
		printNewStepsArray(newStepsArray);
	}

	public static void drawMatrix(char[] steps, char[][] matrix) {
		for (int actualStep = 0; actualStep < steps.length; actualStep++) {
			step = steps[actualStep];
			if (isStepValid(step))
				executeOrder();

		}
	}

	public static boolean isStepValid(char step) {
		if (step == 'F')
			return true;
		if (step == 'R')
			return true;
		if (step == 'P')
			return true;

		return false;

	}

	public static void executeOrder() {
		if (step == 'F')
			goForward();
		if (step == 'R')
			rotatePosition();
		if (step == 'P')
			paintSquare();

	}

	public static void paintSquare() {
		matrix[positionCoordinates[0]][positionCoordinates[1]] = 'P';

	}

	public static void rotatePosition() {

		if (direction == "RIGHT") {
			direction = "DOWN";
			return;
		}
		if (direction == "DOWN") {
			direction = "LEFT";
			return;
		}
		if (direction == "LEFT") {
			direction = "UP";
			return;
		}
		if (direction == "UP") {
			direction = "RIGHT";
			return;
		}

	}

	public static void goForward() {
		if (isGoForwardValid() == false)
			return;
		if (direction == "RIGHT")
			positionCoordinates[1] = positionCoordinates[1] + 1;
		if (direction == "DOWN")
			positionCoordinates[0] = positionCoordinates[0] + 1;
		if (direction == "LEFT")
			positionCoordinates[1] = positionCoordinates[1] - 1;
		if (direction == "UP")
			positionCoordinates[0] = positionCoordinates[0] + 1;
	}

	public static boolean isGoForwardValid() {
		if ((direction == "RIGHT") && (positionCoordinates[0] + 1 > TABLE_LIMIT))
			return false;
		if ((direction == "DOWN") && (positionCoordinates[1] + 1 > TABLE_LIMIT))
			return false;
		if ((direction == "LEFT") && (positionCoordinates[0] - 1 < 0))
			return false;
		if ((direction == "UP") && (positionCoordinates[1] - 1 < 0))
			return false;

		return true;

	}

	public static void printMatrix(char[][] matrix) {
		for (int imprimirLinha = 0; imprimirLinha <= TABLE_LIMIT; imprimirLinha++) {
			System.out.println(Arrays.toString(matrix[imprimirLinha]));
		}
	}

	public static void charFind() {
		while (charFind < steps.length - numberOfRemovedSteps - 1) {
			if ((steps[charFind] == 'R') && (steps[charFind + 1] == 'R'))
				isRRepeated(charFind);
			charFind++;
		}
	}

	public static void newSteps() {
		charFind();
		newStepsArray();
	}

	public static void newStepsArray() {
		newStepsArray = new char[steps.length - numberOfRemovedSteps];
		for (int index = 0; index < newStepsArray.length; index++) {
			newStepsArray[index] = steps[index];
		}
	}

	public static void isRRepeated(int charFind) {
		if (steps[charFind + 2] == 'R') {
			numberOfRemovedSteps += 2;
			repeatedStepsRemove(charFind, steps, 'L', 2);

		} else {
			numberOfRemovedSteps += 1;
			repeatedStepsRemove(charFind, steps, 'I', 1);

		}
	}

	public static void repeatedStepsRemove(int charFind, char[] steps, char newComand, int removeSteps) {

		steps[charFind] = newComand;

		for (int charFill = charFind + 1; charFill < steps.length - numberOfRemovedSteps; charFill++) {
			steps[charFill] = steps[charFill + removeSteps];
		}

	}

	public static void printNewStepsArray(char[] newStepsArray) {
		System.out.println(Arrays.toString(newStepsArray));
	}

}
