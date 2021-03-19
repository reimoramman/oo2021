/*import java.lang.Math.*;*/

public class Circle implements Shapes {
    public float radius;

public Circle(float radius){
    this.radius = radius;
}

    @Override
    public float getArea(){
        float findArea = (float)Math.PI * radius * radius;
        return findArea;
    }
}
