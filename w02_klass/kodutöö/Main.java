public class Main {

    public static void refrigerator(){
        Refrigerator fridge1 = new Refrigerator(3, 1, 12);
        System.out.println(fridge1);
    
        Refrigerator fridge2 = new Refrigerator(5, 2, 6);
        System.out.println(fridge2);
    
        System.out.println("Esimese külikus on " + fridge1.getApple() + " õuna ja teises on" + fridge2.getApple());
      }

      public static void main(String[]args){
        refrigerator();
      }
}

