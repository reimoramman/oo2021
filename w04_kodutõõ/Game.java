import java.util.ArrayList;
import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    int width = 20;
    int height = 10;

    World world = new World(width, height);
    GameCharacter player = new GameCharacter("Reimo", 2, 3, 'C', GameCharacterType.WIZARD);
    GameCharacter dummy = new GameCharacter("Dummy", 5, 6, 'D', GameCharacterType.WIZARD);
    GameCharacter witch = new GameCharacter("Witch", 8, 9, '?', GameCharacterType.WIZARD);
    GameItem banana = new GameItem("banana", 4, 8, 'B', GameItemType.CONSUMABLE);

    ArrayList<GameCharacter> characters = new ArrayList<>();
    characters.add(player);
    characters.add(dummy);
    characters.add(witch);

    ArrayList<GameItem> items = new ArrayList<>();
    items.add(banana);
    

    world.addCharacters(characters);
    world.addItems(items);
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
      } else if (input.equals("i")){
        player.printInv();
        System.out.print("Press enter to continue");
        input = scanner.nextLine().toLowerCase();
      }

      if (player.x == witch.x && player.y == witch.y){
        player.x = (int)(Math.random() * width - 1) + 1;
        player.y = (int)(Math.random() * height - 1) + 1;

        //dummy.isVisible = dummy.isVisible ? false : true;
      }

     /* for (GameItem gameItem : items) {
       if (compareGrid(gameItem.getPos(),player.getPos())){
         player.addItemToInv(gameItem);
         items.remove(gameItem);
       }
     } */
     int index = 0;

     while (index < items.size()){
       GameItem gameItem = items.get(index);
      if (compareGrid(gameItem.getPos(),player.getPos())){
        player.addItemToInv(gameItem);
        items.remove(gameItem);
        index --;
      }
      index ++;
     }


      world.render();
      // player.printinv();
      System.out.println(player);
    }
    scanner.close();
  }
  private static boolean compareGrid(int[] pos1, int[] pos2){
    return (pos1[0] == pos2[0] && pos1[1] == pos2[1]);
  }
}