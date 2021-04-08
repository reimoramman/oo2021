package org.hangman;

import java.util.Scanner;
import java.util.Arrays;


public class Game implements Keyboard{
    private static int counter = 0;
    static Scanner scanner = new Scanner(System.in);
    private static String continu = "y";
    private static Hangman[] hangmans = new Hangman[100];
    private static Gallows[] gallowss = new Gallows[100];
    public static void main(String[] args) {
        System.out.println("Mängid poomismängu!");
        game();
        while(continu.equals("y")){
            quest();
        }
    }

    public static void quest() {
        System.out.println("Kas soovid uuesti mängida?");
        continu = scanner.next();
        if (continu.equals("y")){   
            game();
        }    
    }

    public static void game() {
        hangmans[counter] = new Hangman();
        gallowss[counter] = new Gallows();
        
        while(hangmans[counter].wrongGuess<7){
            render(hangmans[counter], gallowss[counter]);
            hangmans[counter].play();
            if(!(Arrays.asList(hangmans[counter].getSplitLength()).contains(null))){
                break;
            }
        }
        if(hangmans[counter].wrongGuess>7){
            System.out.println("Kaotasid!");
            System.out.println("Õige sõna oli: "+hangmans[counter].word);
        } else if (hangmans[counter].wrongGuess<8){
            System.out.println("Võitsid!");
        }
        counter++;
    }

    public static void render(Hangman hangman, Gallows gallows){
        System.out.println(gallows.gallows(hangman.wrongGuess));
        System.out.println("Vigu: "+hangman.wrongGuess+"/7");
        for (String s : hangman.getSplitLength()) {
            if (s!=null){
                System.out.print(s);
            } else {
                System.out.print("_");
            }
        }
        System.out.println();
        System.out.println("Paku täht:");

        
    }
    @Override
    public String getInput(char a) {
        
        return null;
    }
    
}