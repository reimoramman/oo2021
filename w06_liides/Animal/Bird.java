public class Bird implements Animal {
    public int health = 11;
    public boolean sneaky = false;
    public boolean defending = false;

    @Override
    public String speak() {
        return "Ca Caw!!";
    }

    @Override
    public String eat() {
        this.health = this.health++;
        return "Birb eats worm";
    }

    @Override
    public String beSneaky() {
        return "Birb desided to walk and not fly";
    }

    @Override
    public String lookAround() {
        return "Birb sees a weird fish";
    }

    @Override
    public String defend() {
        this.defending = true;
        return "Defending!";
    }

    @Override
    public String attack() {
        return "Bird pecks furiously, for he is a woodpecker";
    }

    

   
}
