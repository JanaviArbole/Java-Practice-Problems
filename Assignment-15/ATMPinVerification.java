//Create an ATM PIN Verification program that throws exception for invalid PIN, uses finally block 
import java.util.Scanner;

public class ATMPinVerification 
{
    static int correctPin = 5678;
    static int enteredPin;

    public static void main(String[] args) 
    {
        System.out.println("===============================");
        System.out.println("ATM PIN Verification");
        System.out.println("===============================");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 4-digit PIN: ");

        try 
        {
            enteredPin = sc.nextInt();

            if (enteredPin != correctPin) 
            {
                throw new Exception("Incorrect PIN entered. Access denied.");
            } 
            else 
            {
                System.out.println();
                System.out.println("PIN verified successfully. Access granted.");
            }
        } 
        catch (Exception e) 
        {
            System.out.println();
            System.out.println(e.getMessage());
        } 
        finally 
        {
            System.out.println();
            System.out.println("PIN verification process has been completed.");
        }

    }
}