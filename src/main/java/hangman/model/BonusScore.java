package hangman.model;

public class BonusScore implements GameScore {

	/**
	 * @pre El BonusScore debe tener  los aciertos y los aciertos inválidos calculados.
	 * @pos Según la cantidad de aciertos inválidos se le descuentan 5 puntos, mientras que por cada acierto se le cuenta 10 puntos.
	 * @param correctCount - Cantidad de aciertos.
	 * @param incorrectCount - Cantidad de aciertos inválidos.
	 * @throws  
	 */
	@Override
	public int calculateScore(int correctCount, int incorrectCount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
