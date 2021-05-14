public class Pendelum implements Clock{

  private double length;
  
  public Pendelum (double length){
      this.length = length;
  }


@Override
  public double findDuration(){
      return 2* Math.PI * Math.sqrt(length/9.8);
  }
}