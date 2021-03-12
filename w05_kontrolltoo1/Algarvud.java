import java.util.Scanner;


public class Algarvud {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the numner you want to check wether it's prime or not: ");
        int number = scan.nextInt();
        //int number = 6;
        scan.close();


        if (number % 2 == 0){
            System.out.println(number + " is divisible with 2");
        }

        if (number % 3 == 0){
            System.out.println(number + " is divisible with 3");
        }

        if (number % 5 == 0){
            System.out.println(number + " is divisible with 5");
        }

        if (number % 7 == 0){
            System.out.println(number + " is divisible with 7");
        }


        isPrime(number, true);
        
        int[] primes = new int[1000];
        int count = 0;
        int num = 1;

        while(count < 1000){
            if (isPrime(num, false)){
                primes[count] = num;
                count++;
            }
            num++;
           
        }

        int[] bigprime = new int[10];
        int count2 = 0;
        int num2 = primes[999]*primes[999];

        while(count2 < 10){
            if (isPrime(num2, false)){
                bigprime[count2] = num2;
                count2++;
            }
            num2--;
        }

        for (int i = 0; i < bigprime.length; i++){
            System.out.println(bigprime[i]);
        }
        

    }

    public static boolean isPrime(int number, boolean print){
        boolean prime = false;
        for (int i = 2; i <= number / 2; ++i){
            if (number % i == 0){
                prime = true;
                break;
            }
        }

        if (!prime){
            if (print){
                System.out.println(number + " is a prime number.");
            }
            return true;
        }
        else{
            if (print){
                System.out.println(number + " is not a prime number.");
            }
            return false;
        }
    }
}