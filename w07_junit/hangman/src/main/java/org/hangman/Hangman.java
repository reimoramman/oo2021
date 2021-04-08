/*Soovitavalt 3 liikmelise võistkonnana (võib 2 ka)
teha mingisugune mäng (sõnamäng, trips-traps-trull),
kus oleksid olemas interface, testid, mänguloogika 
(kus on implementitud interface) ja mängu 
realiseeriv rakendus (mingisugune klass,
kus main meetod, kus te teete uue objekti mängust,
kus kasutaja saab mängida läbi)*/


// Kasutatud allikad
// https://www.considerable.com/entertainment/games/hangman/


package org.hangman;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public class Hangman{
   private static String[] words = {"apple", "banana", "programming", "thunderstorm"};
   private static Random r = new Random();
   public static String word = words[(r.nextInt(words.length))];
   public static int wrongGuess = 0;
   public static String[] splitWord = word.split("");
   public static String[] splitLength = new String[word.length()];
   public static ArrayList<String> wrong = new ArrayList<String>();

   public static void play(){
      String guessed = guess();
      if(inWord(splitWord, guessed)){
         splitLength = fillList(splitWord, splitLength, guessed);
      }
      else{
         wrongGuess ++;
         if(!wrong.contains(guessed)){
            wrong.add(guessed);
         }
      }
   }
   public static String guess(){
      Scanner scGuess = new Scanner(System.in);
      scGuess.close();
      return scGuess.next();
      
   }

   public static boolean inWord(String[] list, String inString){
      for (String string : list) {
         if (string.equals(inString)){
            return true;
         }
      }
      return false;
   }

   public static String[] fillList(String[] fromList, String[] toList, String string){
      for (int i = 0; i < fromList.length; i++){
         if (fromList[i].equals(string)){
            toList[i] = string;
         }
      }
      return toList;
   }

   public String[] getSplitLength(){
      return splitLength;
   }
}