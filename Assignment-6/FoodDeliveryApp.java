class Order
{
    String customerName;
    String foodItem;
    double price;

    Order(String customerName, String foodItem, double price)
    {
        this.customerName = customerName;
        this.foodItem = foodItem;
        this.price = price;
    }
    class OrderDetails
    {
        void showOrder()
        {
            System.out.println("--------------------------");
            System.out.println("Order Details:");
            System.out.println("Customer : " + customerName);
            System.out.println("Food : " + foodItem);
            System.out.println("Price : Rs. " + price);
        }
    }

    // Interface for delivery status updates
    interface DeliveryStatus
    {
        void updateStatus();
    }

    void trackDelivery(DeliveryStatus status)
    {
        status.updateStatus();
    }

    public static void main(String[] args)
    {
        Order order = new Order("Rahul", "Chicken Biryani", 250.0);

        Order.OrderDetails orderDetails = order.new OrderDetails();
        orderDetails.showOrder();

        System.out.println("--------------------------");
        System.out.println("");

        order.trackDelivery(new Order.DeliveryStatus()
        {
            @Override
            public void updateStatus()
            {
                System.out.println("Status: Order Confirmed! Restaurant is preparing your food.");
            }
        });

        order.trackDelivery(new Order.DeliveryStatus()
        {
            @Override
            public void updateStatus()
            {
                System.out.println("Status: Order is Out for Delivery. Rider is on the way!");
            }
        });

        order.trackDelivery(new Order.DeliveryStatus()
        {
            @Override
            public void updateStatus()
            {
                System.out.println("Status: Order Delivered. Enjoy your meal!");
            }
        });
    }
}
