abstract class Payment
{
    double amount;

    Payment(double amount)
    {
        this.amount = amount;
    }

    abstract void processPayment();

    void displayPaymentInfo()
    {
        System.out.println("Amount: " + amount);
    }
}

class CreditCardPayment extends Payment
{
    String cardNumber;
    String cardHolderName;

    CreditCardPayment(double amount, String cardNumber, String cardHolderName)
    {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    void processPayment()
    {
        System.out.println("Processing Credit Card Payment...");
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card Number: **** **** **** "
                + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Amount Paid: " + amount);
        System.out.println("Payment Successful via Credit Card.");
    }
}

class UpiPayment extends Payment
{
    String upiId;

    UpiPayment(double amount, String upiId)
    {
        super(amount);
        this.upiId = upiId;
    }

    void processPayment()
    {
        System.out.println("Processing UPI Payment...");
        System.out.println("UPI ID: " + upiId);
        System.out.println("Amount Paid: " + amount);
        System.out.println("Payment Successful via UPI.");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Payment payment1 = new CreditCardPayment(
                2500.0, "1234567812345678", "Rahul Sharma");

        payment1.processPayment();

        System.out.println("----------------------------------");

        Payment payment2 = new UpiPayment(1200.0, "rahul@upi");
        payment2.processPayment();
    }
}
