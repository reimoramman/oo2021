public class Homework {
    public static void main(String[] args){
        Circle newcircle = new Circle(13);
        Square newsquare = new Square(5);

        System.out.println("A circle with a radius of " + newcircle.radius + " has the area of " + (newcircle.getArea()) + " units");
        System.out.println("A square with a side length of " + newsquare.side + " has the area of "+ (newsquare.getArea()) + " units");
    }
}
