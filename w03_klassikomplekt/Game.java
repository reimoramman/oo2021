import java.util.ArrayList;
import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    int width = 20;
    int height = 10;

    World world = new World(width, height);
    GameCharacter player = new GameCharacter("Reimo", 2, 3, 'R', GameCharacterType.WIZARD);
    GameCharacter dummy = new GameCharacter("Dummy", 5, 6, 'D', GameCharacterType.WIZARD);
    GameCharacter witch = new GameCharacter("Witch", 8, 9, '?', GameCharacterType.WIZARD);

    ArrayList<GameCharacter> characters = new ArrayList<>();
    characters.add(player);
    characters.add(dummy);
    characters.add(witch);

    world.addCharacters(characters);
    world.render();
    System.out.println(player);

    Scanner scanner = new Scanner(System.in);
    String input = "";

    while(!input.equals("end")){
      input = scanner.nextLine().toLowerCase();

      if (input.equals("")){
        player.move();
      } else if (input.equals("a")){
        player.setDirection(Direction.LEFT);
      } else if (input.equals("d")){
        player.setDirection(Direction.RIGHT);
      } else if (input.equals("w")){
        player.setDirection(Direction.UP);
      } else if (input.equals("s")){
        player.setDirection(Direction.DOWN);
      }

      // player == witch => 
      // telepordib playeri suvalisse kohta (width, height piires)

      world.render();
      System.out.println(player);
    }
  }
}