package JavaBasics;

import java.util.Scanner;


public class Factorizer {



    private static boolean isPerfect(int input) {
        // 
        int sum=0;
        for(int i=1;i<input;i++){

            if(input%i==0){
                System.out.print(i+" ");
                sum+=i;
            }
        }
        System.out.println(sum);
        if(sum==input){
            return true;
        }
        return false;


    }

    private static boolean isPrime(int input) {
        // intialize variable
        // check if 0 or 1. not prime

        if (input == 0 || input == 1) {
            return false;
        }
        for (int i = 2; i < input / 2; i++) {
            if (input % i == 0) {
                return false;
            }
        }

        // check if divisible by 2, not prime
        // check if divisible by 3, not prime

        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like to factor? ");
        int input = sc.nextInt();
        System.out.println("The factors of 6 are:");
        

        if(isPerfect(input)==true) {
            System.out.println(input+"is perfect number");
        } else {
            System.out.println("not perfect");

        }
         if(isPrime(input)){
            System.out.println(input+"is prime number");
        } else{
            System.out.println("error");
        }
        sc.close();



    }
}
