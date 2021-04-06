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


public class Hangman{
   private static String[] words = {"apple", "banana", "programming", "thunderstorm"};
   public static String word = words[(int) (math.random() * words.length)];
   public static int wrongGuess = 0;
   public static String[] splitWord = word.split("");
   public static String[] splitLength = String[word.length()];

   public static void play(){
      while(true){
         String guessed = guess();
      }
      
   }
   public static String guess(){
      Scanner scGuess = new Scanner(System.in);
      return scGuess.next();
   }
}