//Create an ATM program handling invalid withdrawal amount using try-catch
import java.util.Scanner;

public class ATMProgram 
{
    static int balance = 10000;
    static int withdrawAmount;
    static int depositAmount = 99;
    static int choice;
    static int pin = 1234;


    public static void main(String[] args) 
    {
        System.out.println("===============================");
        System.out.println("Welcome to the Virtual ATM");
        System.out.println("===============================");
        
        System.out.println();
        System.out.print("Enter the pin number: ");
        Scanner sc = new Scanner(System.in);
        int inputPin = sc.nextInt();

        try {
            if (inputPin == pin) 
            {
                System.out.println();
                System.out.println("Welcome Janavi!!");
                System.out.println("Pin accepted. What would you like to do?");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println();
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
            } 
            else 
            {
                System.out.println("Invalid pin.");
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Invalid input. Please enter a valid pin number.");
        }

        try {
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter the amount to withdraw: ");
                    withdrawAmount = sc.nextInt();
                    try 
                    {
                        if (withdrawAmount > balance) 
                        {
                            throw new Exception("Insufficient balance.");
                        } 
                        else if (withdrawAmount <= 0) 
                        {
                            throw new Exception("Invalid withdrawal amount.");
                        } 
                        else 
                        {
                            balance -= withdrawAmount;
                            System.out.println();
                            System.out.println("Withdrawal successful. New balance: " + balance);
                        }
                    } 
                    catch (Exception e) 
                    {
                        System.out.println();
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    depositAmount = sc.nextInt();
                    balance += depositAmount;
                    System.out.println("Deposit successful. New balance: " + balance);
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Current balance: " + balance);
                    System.out.println();
                    break;

                default:
                    System.out.println();
                    System.out.println("Invalid choice.");
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }
}
