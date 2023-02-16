package hangman.model;

public class OriginalScore implements GameScore {

	/**
	 * @pre El OriginalScore debe tener  los aciertos y los aciertos inválidos calculados.
	 * @pos Según la cantidad de aciertos inválidos se descuentan 10 puntos.
	 * @param correctCount - Cantidad de aciertos.
	 * @param incorrectCount - Cantidad de aciertos inválidos.
	 * @throws 
	 */
	public int calculateScore(int correctCount, int incorrectCount) {
		int result = 0;
		if(correctCount == 0 && incorrectCount <= 10) result = 100-(incorrectCount * 10);
		return result;
	}

}
