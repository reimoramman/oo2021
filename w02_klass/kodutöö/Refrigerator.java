public class Refrigerator {

  public Refrigerator(int apple, int cabbage, int chestnut){
    this.apple = apple;
    this.cabbage = cabbage;
    this.chestnut = chestnut;
  }
    private int apple;
    private int cabbage;
    private int chestnut;
  
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