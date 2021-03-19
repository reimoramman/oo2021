public class Main {
    public static void main(String[] args){
        Fish fish = new Fish();
        Bird bird = new Bird();

        System.out.println(fish.beSneaky());
        System.out.println(fish.defend());
        System.out.println(fish.attack());
       
        System.out.println(bird.attack());
        System.out.println(bird.beSneaky());

    }
}
