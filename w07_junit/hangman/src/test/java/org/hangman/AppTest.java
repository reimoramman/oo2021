package org.hangman;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest{

    @Test
    public void shouldAnswerWithTrue(){
        assertTrue( true );
    }

    @Test
    public void inWordTest(){
        String[] list = new String []{"a", "b", "c"};
        String inString = "b";
        assertTrue( Hangman.inWord(list, inString));
        inString = "d";
        assertTrue(! Hangman.inWord(list, inString));
    }

    
    
}