package Kodutöö;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class StreamConverter{
  public static void main(String[] arg) throws Exception{
    PrintWriter pw = new PrintWriter( new FileWriter("EnglishWords.txt"));
    List<String> words = Arrays.asList("no", "la", "wi", "ki", "ty", "ti", "ba", "pi", "ky");
    words
    .stream()
    //.map(WordUtils::capitalize)
    .map(entry -> entry + "Thing")
    .distinct()
    .sorted()
    .peek(System.out::println)
    .forEach(pw::println);

    pw.close();

  }
}