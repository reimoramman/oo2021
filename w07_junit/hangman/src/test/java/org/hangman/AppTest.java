package org.hangman;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest{

    @Test
    public void inWordTest(){
        String[] list = new String []{"a", "b", "c"};
        String inString = "b";
        assertTrue( Hangman.inWord(list, inString));
        inString = "d";
        assertTrue(! Hangman.inWord(list, inString));
    }

    @Test
    public void gallowsTest(){
        Gallows gallows = new Gallows();
        int  testnumber = 4;
        String image = "";
        image+="              __\n";
        image+="              |\n";
        image+="              |\n";
        image+="              |\n";
        image+="              |\n";
        image+="_/¯¯¯------/¯¯¯¯¯¯¯¯¯¯¯¯¯\\-----\\_____";
        assertTrue(gallows.gallows(testnumber).equals(image));
    }

    @Test
    public void checkFillList(){
        String word =  "apple";
        String fromList[] = new String[5];
        fromList = word.split("");
        String toList[] = new String[5];
        String string = "p";
        String[] correct = new String[5];
        correct[1]="p";
        correct[2]="p";

        assertArrayEquals("Arrays must be equal", Hangman.fillList(fromList, toList, string), correct);
    }

    @Test
    public void checkGetSplitLength(){
        Hangman hangman = new Hangman();
        
        assertArrayEquals("Arrays must be equal", hangman.splitLength, hangman.getSplitLength());
    }
    
}