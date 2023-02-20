package hangman.model;

import hangman.exceptions.HangmanExceptions;
import java.lang.Math;

public class PowerScore implements GameScore {

	/**
	 * Calcula el puntaje de un jugador de acuerdo al esquema de juego actual.
	 *
	 * @pre El número de aciertos y desaciertos deben ser números enteros no negativos.
	 * @pos El puntaje devuelto será un número entero no negativo.
	 * @param correctCount el número de respuestas correctas ingresadas por el jugador.
	 * @param incorrectCount el número de respuestas incorrectas ingresadas por el jugador.
	 * @return el puntaje del jugador, después de aplicar la bonificación por las respuestas correctas y la penalización por las respuestas incorrectas.
	 * @throws HangmanExceptions si alguno de los parámetros de entrada es negativo.
	 */
	public int calculateScore(int correctCount, int incorrectCount) throws HangmanExceptions {
		if (correctCount < 0 || incorrectCount < 0) throw new HangmanExceptions(HangmanExceptions.parametersLessThanZero);
	    int score = 0;
	    score += Math.pow(5, correctCount);
	    score -= 8 * incorrectCount;
	    if (correctCount == 0 && incorrectCount == 0) score = 0;
	    else if (score < 0) score = 0;
	    else if (score > 500) score = 500;
	    return score;
	}

}
