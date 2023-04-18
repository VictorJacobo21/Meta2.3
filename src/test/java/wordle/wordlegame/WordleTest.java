package wordle.wordlegame;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author VictorJ
 */
public class WordleTest {
    
    public WordleTest() {
    }

    @Test
    public void testGetSecreto() {
        System.out.println("getSecreto");
        Wordle instance = new Wordle();
        String expResult = "";
        String result = instance.getSecreto();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIntento() {
        System.out.println("intento");
        String intento = "";
        Wordle instance = new Wordle();
        instance.intento(intento);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetResultado() {
        System.out.println("getResultado");
        Wordle instance = new Wordle();
        String expResult = "";
        String result = instance.getResultado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
