/*Soovitavalt 3 liikmelise võistkonnana (võib 2 ka)
teha mingisugune mäng (sõnamäng, trips-traps-trull),
kus oleksid olemas interface, testid, mänguloogika 
(kus on implementitud interface) ja mängu 
realiseeriv rakendus (mingisugune klass,
kus main meetod, kus te teete uue objekti mängust,
kus kasutaja saab mängida läbi)*/


package org.hangman;

public class Hangman{
   private static String[] words = {"apple", "banana", "programming", "thunderstorm"};
   public static String word = words[(int) (math.random() * words.length)];
   public static int wrongGuess = 0;
}
