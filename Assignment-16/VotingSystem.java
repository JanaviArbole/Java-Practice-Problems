//Create a Voting System that throws a custom exception if age is below 18
import java.util.Scanner;

class UnderAgeException extends Exception 
{
    UnderAgeException(String message) 
    {
        super(message);
    }
}

public class VotingSystem 
{
    static int voterAge;
    static String voterName;

    public static void main(String[] args) 
    {
        System.out.println("===============================");
        System.out.println("Voter Eligibility Check");
        System.out.println("===============================");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        voterName = sc.next();

        System.out.print("Enter your age: ");
        voterAge = sc.nextInt();

        try 
        {
            if (voterAge < 18) 
            {
                throw new UnderAgeException("Sorry " + voterName + ", you must be 18 or older to vote.");
            } 
            else 
            {
                System.out.println();
                System.out.println(voterName + ", you are eligible to vote.");
            }
        } 
        catch (UnderAgeException e) 
        {
            System.out.println();
            System.out.println(e.getMessage());
        }

    }
}