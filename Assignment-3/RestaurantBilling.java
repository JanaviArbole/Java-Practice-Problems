public class RestaurantBilling
{
    static int totalOrders = 0;

    double calculateBill(double baseAmount)
    {
        totalOrders++;
        double tax = baseAmount * 0.05;
        return baseAmount + tax;
    }

    double calculateBill(double baseAmount, double packagingFee)
    {
        totalOrders++;
        double tax = baseAmount * 0.05;
        return baseAmount + tax + packagingFee;
    }

    double calculateBill(double baseAmount, double deliveryFee, double tip)
    {
        totalOrders++;
        double tax = baseAmount * 0.05;
        return baseAmount + tax + deliveryFee + tip;
    }

    void printStats()
    {
        System.out.println("TOTAL ORDERS PROCESSED: " + totalOrders);
    }

    public static void main(String[] arg)
    {
        RestaurantBilling rb = new RestaurantBilling();

        System.out.println("-----------------------------------------------");
        System.out.println("Dine-in Order Bill: " + rb.calculateBill(1500.0));
        System.out.println("-----------------------------------------------");

        System.out.println("-----------------------------------------------");
        System.out.println("Takeaway Order Bill: " + rb.calculateBill(800.0, 30.0));
        System.out.println("-----------------------------------------------");

        System.out.println("-----------------------------------------------");
        System.out.println("Delivery Order Bill: " + rb.calculateBill(2000.0, 100.0, 150.0));
        System.out.println("-----------------------------------------------");

        System.out.println("-----------------------------------------------");
        rb.printStats();
        System.out.println("-----------------------------------------------");
    }
}