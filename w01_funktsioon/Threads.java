public class Threads {
  public static void main(String args[]){

    Thread thread1_10 = new Thread(){
      public void run(){
        for(int i = 1; i <= 10; i++){
          System.out.println(i);
          try{
            sleep(100);
          }catch(Exception e){
            System.out.println(e.getMessage());
          }
        }
      }
    };

    Thread thread10_1 = new Thread(){
      public void run(){
        for(int i = 10; i >= 1; i--){
          System.out.println(i);
          try{
            thread1_10.join();
            sleep(100);
          }catch(Exception e){
            System.out.println(e.getMessage());
          }
        }
      }
    };

    Threads threadA_K = new Threads();
    Thread A_K = new Thread(new Runnable(){
      public void run(){
        threadA_K.a_k();
      }
    });

    Threads threadK_A = new Threads();
    Thread K_A = new Thread(new Runnable(){
      public void run(){
        threadK_A.k_a();
      }
    });

    thread1_10.start();
    thread10_1.start();
    A_K.start();
    K_A.start();

  }


    public void a_k(){
      char letter;
      for(letter = 'a'; letter <= 'k'; letter++){
        try{
          System.out.println(letter);
        }catch(Exception e){
          System.out.println(e.getMessage());
        }
      }
    }

    public void k_a(){
      char letter;
      for(letter = 'k'; letter >= 'a'; letter --){
        try{
          System.out.println(letter);
        }catch(Exception e){
          System.out.println(e.getMessage());
        }
      }
    }
  }