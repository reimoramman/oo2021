public class GameCharacter {
  public int x;
  public int y;
  public String name;
  private char symbol;
  public boolean isVisible = true;
  private GameItem inv[] = {null,null};

  private Direction direction;

  private GameCharacterType gameCharacterType;

  public GameCharacter(String name, int x, int y, char symbol, GameCharacterType gameCharacterType){
    this.name = name;
    this.gameCharacterType = gameCharacterType;
    this.direction = Direction.RIGHT;
    this.symbol = symbol;

    this.x = x;
    this.y = y;
  }

  public char getSymbol(){
    return symbol;
  }

  public void setDirection(Direction d){
    this.direction = d;
    move();
  }

  public void move(){
    switch(this.direction){
      case UP:
        this.y--;
        break;
      case RIGHT:
        this.x++;
        break;
      case DOWN:
        this.y++;
        break;
      case LEFT:
        this.x--;
        break;
      default:
        break;
    }
  }

  @Override
  public String toString(){
    return "My name is " + name + " and x: " + x + " and y: " + y;
  }

  public void addItemToInv(GameItem name){
        
    for(int i = 0; i < inv.length; i++){
        if(inv[i] == null){
            inv[i] = name;
            
            System.out.println("You have added: " + name + ".");
            return;
        }
    }
    System.out.println("You have no room in your inventory.");
  }
  public void printInv(){
    for(GameItem x: inv){
        System.out.println(x);
    }
}

  public void removeItemFromInv(String name){
    for(int i = 0; i < inv.length; i++){
        if(inv[i].equals(name)){
            inv[i] = null;
        }
    }
    System.out.println("That item is not in your inventory.");
}

  public int[] getPos(){
    int[] position = new int[2];
    position[0] = x;
    position[1] = y;
    return position;
  }
}
