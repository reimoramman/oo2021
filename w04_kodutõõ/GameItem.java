public class GameItem {
    public int x;
    public int y;
    public String name;
    private char symbol;
    

    private GameItemType item;

    private GameItemType gameItemType;

    public char getSymbol(){
        return symbol;
      }

    public GameItem(String name, int x, int y, char symbol, GameItemType gameItemType){
        this.name = name;
        this.gameItemType = gameItemType;
        this.item = GameItemType.NOTE;
        this.symbol = symbol;

        this.x = x;
        this.y = y;
    }

    public int[] getPos(){
        int[] position = new int[2];
        position[0] = x;
        position[1] = y;
        return position;
    }
    
    public String toString(){
        return name;
    }
}