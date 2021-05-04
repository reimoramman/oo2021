import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsExample {
  public static void main(String[] args) {
    List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    /* for (Integer i : integerList){
      System.out.print(i);
    }
    integerList.forEach(elem -> System.out.print(elem));
    integerList.forEach(System.out::print); */

    /*  List<Integer> integerList2 = integerList.stream()
        .filter(element -> element < 5)
        .peek(System.out::print)
        .collect(Collectors.toList()); */

    //System.out.println(integerList2);

    List<Integer> integerList3 = integerList.stream()
      .filter(element -> element > 5)
      .map(element -> element * 2)
      .peek(element -> System.out.print(" " + element))
      .collect(Collectors.toList());

    // luua neljas list ja olgu seal elemendid, mis on paaris

    /*System.out.println(integerList.stream().count());
    System.out.println(integerList.stream().skip(4).count());*/

    IntStream.of(1, 2, 4, 8)
    .map(e -> e * e)
    .filter(e -> e < 50)
    .forEach(e -> System.out.print(e + " "));

    IntStream.iterate(1, i -> i * 2).limit(10).forEach(System.out::println);

    IntStream.range(1, 10)
    .filter(e -> e % 2 == 0)
    .forEach(System.out::print);
  }
}