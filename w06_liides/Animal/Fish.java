public class Fish implements Animal {
    public int health = 10;
    public boolean sneaky = false;
    public boolean defending = false;

    @Override
    public String speak(){
        return "Blop";
    }

    @Override
    public String eat() {
        this.health = this.health++;
        return "Fish eat seaweed";
    }

    @Override
    public String beSneaky() {
        this.sneaky = true;
        return "You play dead";
    }

    @Override
    public String lookAround() {
        this.health--;
        return "You see water";
    }

    @Override
    public String defend() {
        this.defending = true;
        return "Flop";
    }

    @Override
    public String attack(){
        return "Fish slaps with tail";
    }


}
