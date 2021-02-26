import java.util.HashMap;

public class Test2 {
public static void main(String[] args) {
    HashMap<String, Integer> fridge = new HashMap<String, Integer>();


    // Add keys and values (Name, Age)
    fridge.put("õun", 8);
    fridge.put("kapsas", 3);
    fridge.put("hobukastan", 18);
    fridge.put("õun", 10);

    for (String i : fridge.keySet()) {
      System.out.println("Külmikus on " + i + ": " + fridge.get(i));
    }
  }
}

