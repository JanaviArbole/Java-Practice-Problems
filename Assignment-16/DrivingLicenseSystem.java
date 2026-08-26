//Create a Driving License System that throws a custom exception if age is below 18
import java.util.Scanner;

class MinorAgeException extends Exception 
{
    MinorAgeException(String message) 
    {
        super(message);
    }
}

public class DrivingLicenseSystem 
{
    static int applicantAge;
    static String applicantName;
    static int minimumAge = 18;

    public static void main(String[] args) 
    {
        System.out.println("=========================================");
        System.out.println("Driving License Eligibility System");
        System.out.println("=========================================");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter applicant name: ");
        applicantName = sc.next();

        System.out.print("Enter applicant age: ");
        applicantAge = sc.nextInt();

        try 
        {
            if (applicantAge < minimumAge) 
            {
                throw new MinorAgeException(applicantName + " is not eligible. Minimum age required is " + minimumAge + ".");
            } 
            else 
            {
                System.out.println();
                System.out.println(applicantName + " is eligible for a driving license.");
            }
        } 
        catch (MinorAgeException e) 
        {
            System.out.println();
            System.out.println(e.getMessage());
        }

    }
}