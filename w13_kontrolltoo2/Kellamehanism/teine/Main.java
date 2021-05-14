public class Main {

public static void main(String[] args) {


    Pendelum pendelum = new Pendelum(10);
    double duration = pendelum.findDuration() * 1000;

    Teeth teeth = new Teeth(2);
    double amount = teeth.getAmount();

    int counter = 0;

    for(;;){

        for(int i = 0; i < amount; i++){
            System.out.println(" tic ");

            try {
                Thread.sleep((long) duration);
            } catch(InterruptedException ex){
                System.exit(0);
            }
        }
    counter ++;
    System.out.println( counter + ". Pööre");

    }
}
}