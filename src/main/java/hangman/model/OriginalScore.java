package hangman.model;

import hangman.exceptions.HangmanExceptions;

public class OriginalScore implements GameScore {

	/**
	 * Calcula el puntaje de un jugador de acuerdo al esquema de juego actual.
	 *
	 * @pre El número de aciertos y desaciertos deben ser números enteros no negativos.
	 * @pos El puntaje devuelto será un número entero no negativo.
	 * @param correctCount el número de respuestas correctas ingresadas por el jugador.
	 * @param incorrectCount el número de respuestas incorrectas ingresadas por el jugador.
	 * @return el puntaje del jugador, después de la penalización por las respuestas incorrectas.
	 * @throws HangmanExceptions 
	 */
	public int calculateScore(int correctCount, int incorrectCount) throws HangmanExceptions {
		if (correctCount < 0 || incorrectCount < 0) throw new HangmanExceptions(HangmanExceptions.parametersLessThanZero);
		int score = 100 - (10*incorrectCount);
		if (score < 0) score = 0;
		return score;
	}
}
