package hangman.exceptions;

public class HangmanExceptions extends Exception{
	
	public static final String parametersLessThanZero = "Los parámetros no pueden ser negativos.";
	
	public HangmanExceptions(String message) {
		super(message);
	}
}