import java.util.Scanner;

public class ShoppingProgram 
{
    static int stock = 50;
    static double price = 499;
    static int quantity;
    static int choice;
    static double totalAmount;

    public static void main(String[] args) 
    {
        System.out.println("=================================================");
        System.out.println("Welcome to the Online Shopping Store");
        System.out.println("=================================================");

        System.out.println();
        System.out.println("Available Product: Wireless Mouse");
        System.out.println("Price per unit: " + price);
        System.out.println("Stock available: " + stock);
        System.out.println();
        System.out.println("1. Buy Product");
        System.out.println("2. Check Stock");
        System.out.println();
        System.out.print("Enter your choice: ");

        Scanner sc = new Scanner(System.in);

        try 
        {
            choice = sc.nextInt();
        } 
        catch (Exception e) 
        {
            System.out.println("Invalid input. Please enter a valid choice.");
            return;
        }

        try 
        {
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter the quantity you want to buy: ");
                    quantity = sc.nextInt();
                    try 
                    {
                        if (quantity <= 0) 
                        {
                            throw new Exception("Invalid quantity. Quantity must be greater than zero.");
                        } 
                        else if (quantity > stock) 
                        {
                            throw new Exception("Not enough stock available.");
                        } 
                        else 
                        {
                            totalAmount = quantity * price;
                            stock -= quantity;
                            System.out.println();
                            System.out.println("Order placed successfully!");
                            System.out.println("Total amount: " + totalAmount);
                            System.out.println("Remaining stock: " + stock);
                        }
                    } 
                    catch (Exception e) 
                    {
                        System.out.println();
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println();
                    System.out.print("Stock available: " + stock);
                    System.out.println();
                    break;

                default:
                    System.out.println();
                    System.out.println("Invalid choice.");
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

    }
}