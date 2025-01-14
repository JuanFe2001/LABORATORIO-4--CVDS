package hangman.model;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

import hangman.exceptions.HangmanExceptions;

public class GameScoreTest{
	
	@Test
	public void testCalculateScoreWithValidAndInvalidInputs() throws HangmanExceptions {
		OriginalScore score = new OriginalScore();
        
        // Pruebas con entradas válidas

        assertEquals(100, score.calculateScore(0, 0));
        assertEquals(90, score.calculateScore(0, 1));
        assertEquals(80, score.calculateScore(0, 2));
        assertEquals(70, score.calculateScore(0, 3));
        assertEquals(60, score.calculateScore(0, 4));
        assertEquals(50, score.calculateScore(0, 5));
        assertEquals(40, score.calculateScore(0, 6));
        assertEquals(30, score.calculateScore(0, 7));
        assertEquals(20, score.calculateScore(0, 8));
        assertEquals(10, score.calculateScore(0, 9));
        assertEquals(0, score.calculateScore(0, 10));
        assertEquals(80, score.calculateScore(2, 2));
        assertEquals(50, score.calculateScore(5, 5));
        assertEquals(20, score.calculateScore(8, 8));
        assertEquals(0, score.calculateScore(10, 10));
        assertEquals(0, score.calculateScore(0, 15));
        
        // Pruebas con entradas inválidas
        try {
            score.calculateScore(-1, 0);
            fail("No se lanzó la excepción esperada");
        } catch (HangmanExceptions e) {
            assertEquals("Los parámetros no pueden ser negativos.", e.getMessage());
        }
        
        try {
            score.calculateScore(0, -1);
            fail("No se lanzó la excepción esperada");
        } catch (HangmanExceptions e) {
            assertEquals("Los parámetros no pueden ser negativos.", e.getMessage());
        }
        
        try {
            score.calculateScore(-1, -1);
            fail("No se lanzó la excepción esperada");
        } catch (HangmanExceptions e) {
            assertEquals("Los parámetros no pueden ser negativos.", e.getMessage());
        }
	}
	
	@Test 
	public void testCalculateBonusWithValidAndInvalidInputs() throws HangmanExceptions{
		BonusScore score = new BonusScore();
		// Pruebas con entradas válidas

        assertEquals(0, score.calculateScore(0, 0));
        assertEquals(0, score.calculateScore(0, 1));
        assertEquals(0, score.calculateScore(0, 2));
        assertEquals(0, score.calculateScore(0, 3));
        assertEquals(0, score.calculateScore(0, 4));
        assertEquals(0, score.calculateScore(0, 5));
        assertEquals(0, score.calculateScore(0, 6));
        assertEquals(0, score.calculateScore(0, 7));
        assertEquals(0, score.calculateScore(0, 8));
        assertEquals(0, score.calculateScore(0, 9));
        assertEquals(0, score.calculateScore(0, 10));
        assertEquals(10, score.calculateScore(2, 2));
        assertEquals(25, score.calculateScore(5, 5));
        assertEquals(40, score.calculateScore(8, 8));
        assertEquals(50, score.calculateScore(10, 10));
        assertEquals(100, score.calculateScore(10, 0));
        
        // Pruebas con entradas inválidas
        try {
            score.calculateScore(-1, 0);
            fail("No se lanzó la excepción esperada");
        } catch (HangmanExceptions e) {
            assertEquals("Los parámetros no pueden ser negativos.", e.getMessage());
        }
        
        try {
            score.calculateScore(0, -1);
            fail("No se lanzó la excepción esperada");
        } catch (HangmanExceptions e) {
            assertEquals("Los parámetros no pueden ser negativos.", e.getMessage());
        }
        
        try {
            score.calculateScore(-1, -1);
            fail("No se lanzó la excepción esperada");
        } catch (HangmanExceptions e) {
            assertEquals("Los parámetros no pueden ser negativos.", e.getMessage());
        }
	}
	
	@Test
	public void testCalculatePowerScoreWithValidAndInvalidInputs() throws HangmanExceptions{
		PowerScore score = new PowerScore();
		// Pruebas con entradas válidas

        assertEquals(0, score.calculateScore(0, 0));
        assertEquals(0, score.calculateScore(0, 1));
        assertEquals(0, score.calculateScore(0, 2));
        assertEquals(0, score.calculateScore(0, 3));
        assertEquals(0, score.calculateScore(0, 4));
        assertEquals(0, score.calculateScore(0, 5));
        assertEquals(0, score.calculateScore(0, 6));
        assertEquals(0, score.calculateScore(0, 7));
        assertEquals(0, score.calculateScore(0, 8));
        assertEquals(0, score.calculateScore(0, 9));
        assertEquals(0, score.calculateScore(0, 10));
        assertEquals(9, score.calculateScore(2, 2));
        assertEquals(500, score.calculateScore(5, 5));
        assertEquals(500, score.calculateScore(8, 8));
        assertEquals(45, score.calculateScore(3, 10));
        assertEquals(125, score.calculateScore(3, 0));
        
        // Pruebas con entradas inválidas
        try {
            score.calculateScore(-1, 0);
            fail("No se lanzó la excepción esperada");
        } catch (HangmanExceptions e) {
            assertEquals("Los parámetros no pueden ser negativos.", e.getMessage());
        }
        
        try {
            score.calculateScore(0, -1);
            fail("No se lanzó la excepción esperada");
        } catch (HangmanExceptions e) {
            assertEquals("Los parámetros no pueden ser negativos.", e.getMessage());
        }
        
        try {
            score.calculateScore(-1, -1);
            fail("No se lanzó la excepción esperada");
        } catch (HangmanExceptions e) {
            assertEquals("Los parámetros no pueden ser negativos.", e.getMessage());
        }
	}
	
}