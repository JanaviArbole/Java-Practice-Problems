//Create a Login program that throws an exception for invalid password and uses finally block
import java.util.Scanner;

public class LoginProgram 
{
    static String username = "Janavi";
    static String password = "java887";
    static String enteredUser;
    static String enteredPass;

    public static void main(String[] args) 
    {
        System.out.println("===============================");
        System.out.println("Login Portal");
        System.out.println("===============================");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        enteredUser = sc.next();

        System.out.print("Enter password: ");
        enteredPass = sc.next();

        try 
        {
            if (!enteredUser.equals(username)) 
            {
                throw new Exception("Username not found.");
            } 
            else if (!enteredPass.equals(password)) 
            {
                throw new Exception("Incorrect password entered.");
            } 
            else 
            {
                System.out.println();
                System.out.println("Login successful. Welcome " + username + "!");
            }
        } 
        catch (Exception e) 
        {
            System.out.println();
            System.out.println("Login failed: " + e.getMessage());
        } 
        finally 
        {
            System.out.println();
            System.out.println("Login attempt process completed.");
        }

    }
}