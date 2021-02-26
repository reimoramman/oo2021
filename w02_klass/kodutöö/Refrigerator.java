public class Refrigerator {

  private int apple;
  private int cabbage;
  private int chestnut;

  public Refrigerator(int apple, int cabbage, int chestnut){
    this.apple = apple;
    this.cabbage = cabbage;
    this.chestnut = chestnut;
  }
    
  
    public int getApple(){
      return apple;
    }

    public int getCabage(){
      return cabbage;
    }

    public int getChestnut(){
      return chestnut;
    }

    public String toString(){
      return "Selles külmkapis on " + apple + " õuna, " + cabbage + " kapsast ja " + chestnut + " hobukastanit.";
    }

  }