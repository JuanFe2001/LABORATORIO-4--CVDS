package hangman.model;

import hangman.exceptions.HangmanExceptions;

public interface GameScore {
	public int calculateScore(int correctCount, int incorrectCount) throws HangmanExceptions;	
}
