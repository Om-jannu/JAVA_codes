package asign1;
import java.util.*;
public class banking {
    static float bal = 0;



    public static void CreateAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------Enter Your Details:---------");
        System.out.println("Enter your Full Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Address:");
        String address = sc.nextLine();
        System.out.println("Enter your mobile number:");
        String mobnum = sc.nextLine();
        System.out.println("Enter Your age:");
        String age = sc.nextLine();
        System.out.println("Your Account is successfully Created!!!!!!");
    }
    public static void deposit(){
        float depamt;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: \nRs");
        depamt = sc.nextFloat();
        bal = bal + depamt;
        System.out.println("Your amount is successfully deposited!!!!");
    }
    public static void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: \nRs");
        float withdrawamt = sc.nextFloat();
        if (withdrawamt>bal)
        {
            System.out.println("!!!INSUFFICIENT BALANCE!!!");
        }
        else bal = bal - withdrawamt;
    }

    public static double compute_interest(int time){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rate of interest");
        double rate = sc.nextDouble();
        return (bal*rate*time)/100;
    }

    public static void display(){
        System.out.println("YOUR BALANCE is Rs"+bal);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op;
        do {
            System.out.println("ENTER YOUR CHOICE:\n 1.Create Account\n 2.Deposit\n 3.Withdraw\n 4.Compute Interest\n 5.Display Balance");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    CreateAccount();
                    System.out.println("To continue enter 'y' else press any key to exit");
                    op = sc.next();
                    break;
                case 2:
                    deposit();
                    System.out.println("To continue enter 'y' else press any key to exit");
                    op = sc.next();
                    break;
                case 3:
                    withdraw();
                    System.out.println("To continue enter 'y' else press any key to exit");
                    op = sc.next();
                    break;
                case 4:
                    System.out.println("Enter time period:");
                    int time = sc.nextInt();
                    System.out.println("Interest ="+compute_interest(time));
                    System.out.println("To continue enter 'y' else press any key to exit");
                    op = sc.next();
                    break;
                case 5:
                    display();
                    System.out.println("To continue enter 'y' else press any key to exit");
                    op = sc.next();
                    break;
                default:
                    System.out.println("Enter valid choice!!!!!");
                    System.out.println("To continue enter 'y' else press any key to exit");
                    op = sc.next();
                    break;
            }
        }while (Objects.equals(op, "y"));
    }
}