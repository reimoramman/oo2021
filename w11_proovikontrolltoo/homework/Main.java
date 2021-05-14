public class Main{
  public static void main(String[] args){
    Integer[] intArray= {1, 2, 3, 4, 5, 6, 7, 8, 9};
    Double[] doubleArray= {1.1, 2.1, 3.1, 4.1, 5.1, 6.1, 7.1, 8.1, 9.1};
    Character[] charArray= {'H', 'o', 'm', 'e', 'w', 'o', 'r', 'k'};

    System.out.println("Esimeses listis on j2rgnevad integerid: ");
    Generics.printArray(intArray);

    System.out.println("\nTeises listis on j2rgnevad ujukomaarvud: ");
    Generics.printArray(doubleArray);

    System.out.println("\nKolmandas listis on j2rgnevad t2hed: ");
    Generics.printArray(charArray);
  }
}