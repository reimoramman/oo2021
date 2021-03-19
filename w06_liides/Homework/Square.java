public class Square implements Shapes {
    public float side;

public Square(float side){
    this.side = side;
}

    @Override
    public float getArea(){
        float findArea = side * side;
        return findArea;
    }
}