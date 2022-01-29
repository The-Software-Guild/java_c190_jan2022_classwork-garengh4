package ClassesAndObjects.exercise.SimpleCalculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();

        Scanner sc = new Scanner(System.in);
        System.out.print("what would you like to do? ");
        String input = sc.next();
        if (input.equals("add")) {
            System.out.print("Please input first value:");
            int a = sc.nextInt();
            System.out.print("Please input second value:");
            int b = sc.nextInt();
            System.out.println("ans: " + calc.add(a, b));
        } else if (input.equals("subtract")) {
            System.out.print("Please input first value:");
            int a = sc.nextInt();
            System.out.print("Please input second value:");
            int b = sc.nextInt();
            System.out.println("ans: " + calc.subtract(a, b));
        } else if (input.equals("multiply")) {
            System.out.print("Please input first value:");
            int a = sc.nextInt();
            System.out.print("Please input second value:");
            int b = sc.nextInt();
            System.out.println("ans: " + calc.multiply(a, b));
        } else if (input.equals("divide")) {
            System.out.print("Please input first value:");
            int a = sc.nextInt();
            System.out.print("Please input second value:");
            int b = sc.nextInt();
            System.out.println("ans: " + calc.divide(a, b));
        }
        sc.close();

    }

}
