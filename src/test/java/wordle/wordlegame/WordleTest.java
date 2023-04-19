/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package wordle.wordlegame;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
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
    
}
