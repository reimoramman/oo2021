public class Pendelum implements Clock{

  private int length;
  
  public Pendelum (int length){
      this.length = length;
  }

  @Override
  public double findDuration(){
      return 2 * Math.PI * Math.sqrt(length/9.8);
  }
}