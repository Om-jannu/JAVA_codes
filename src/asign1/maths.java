package asign1;

import java.util.*;
public class maths {

    public static int factorial() {         // start of factorial function
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here : ");
        int a = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }                                      // End of factorial function


    public static void testArmstrong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here : ");
        int b = sc.nextInt();
        int r, temp = b, sum = 0;
        while (temp > 0) {
            r = temp % 10;
            sum = sum + (r * r * r);
            temp /= 10;
        }
        if (sum == b)
            System.out.println("Entered number is Armstrong number");
        else
            System.out.println("Entered number is not Armstrong number");
    }


    public static void testPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here : ");
        int c = sc.nextInt();
        int temp = c;
        int rev = 0, rem;
        while (temp > 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (c == rev) {
            System.out.println("Entered number is palindrome");
        } else
            System.out.println("Entered number is not palindrome");
    }


    public static void testPrime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int d = sc.nextInt();
        int temp = 0;
        for (int i = 1; i <= d; i++) {
            if (d % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp < 3) {
            System.out.println("Given number is prime. ");
        } else
            System.out.println("Given number is not prime. ");
    }




    public static void fibonacciSeries() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here : ");
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        System.out.println("The fibonacci series is :");
        for (int i = 1; i <= n; i++) {
            System.out.print(+a + ",");
            c = a + b;
            a = b;
            b = c;
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a;
        while (true) {
            System.out.println("\nEnter your choice:\nPress 1 for Factorial.\nPress 2 for Armstrong.\nPress 3 for Palindrome.\nPress 4 for Prime number.\nPress 5 for Fibonacci series.\nPress 6 to exit.");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("The factorial =" + factorial());
                    break;
                case 2:
                    testArmstrong();
                    break;
                case 3:
                    testPalindrome();
                    break;
                case 4:
                    testPrime();
                    break;
                case 5:
                    fibonacciSeries();
                    break;
                case 6:
                    System.out.println("Session Terminated");
                    System.exit(0);

                default:
                    System.out.println("Invalid input");

            }

        }

    }
}