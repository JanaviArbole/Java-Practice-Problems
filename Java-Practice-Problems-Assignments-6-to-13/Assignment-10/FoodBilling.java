abstract class FoodOrder
{
    double amount;

    FoodOrder(double amount)
    {
        this.amount = amount;
    }

    abstract double calculateBill();

    void displayOrderInfo()
    {
        System.out.println("Base Amount: " + amount);
    }
}

class DineInOrder extends FoodOrder
{
    int numberOfPeople;
    double serviceChargePercent = 5.0;
    double gstPercent = 5.0;

    DineInOrder(double amount, int numberOfPeople)
    {
        super(amount);
        this.numberOfPeople = numberOfPeople;
    }

    double calculateBill()
    {
        double serviceCharge = amount * (serviceChargePercent / 100);
        double gst = amount * (gstPercent / 100);

        return amount + serviceCharge + gst;
    }

    void displayBill()
    {
        displayOrderInfo();
        System.out.println("Number of People: " + numberOfPeople);
        System.out.println("Service Charge: "
                + (amount * (serviceChargePercent / 100)));
        System.out.println("GST: "
                + (amount * (gstPercent / 100)));
        System.out.println("Total Bill: " + calculateBill());
    }
}

class TakeAwayOrder extends FoodOrder
{
    double packagingCharge = 20.0;
    double gstPercent = 5.0;

    TakeAwayOrder(double amount)
    {
        super(amount);
    }

    double calculateBill()
    {
        double gst = amount * (gstPercent / 100);

        return amount + packagingCharge + gst;
    }

    void displayBill()
    {
        displayOrderInfo();
        System.out.println("Packaging Charge: " + packagingCharge);
        System.out.println("GST: "
                + (amount * (gstPercent / 100)));
        System.out.println("Total Bill: " + calculateBill());
    }
}

public class FoodBilling
{
    public static void main(String[] args)
    {
        DineInOrder dineIn = new DineInOrder(1000.0, 4);
        dineIn.displayBill();

        System.out.println("----------------------------------");

        TakeAwayOrder takeAway = new TakeAwayOrder(600.0);
        takeAway.displayBill();
    }
}
