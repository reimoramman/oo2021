public class Main {

    public static void main(String[] args) {


        Pendelum pendelum = new Pendelum(10);
        double duration = pendelum.findDuration() * 1000;


        for(;;){
            System.out.println(" tic ");

            try {
                Thread.sleep((long) duration);
            } catch(InterruptedException ex){

                System.exit(0);
            }

            System.out.println(" tac ");
            try {
                Thread.sleep((long) duration);
            } catch(InterruptedException ex){
                System.exit(0);
            }
        }
    }
}