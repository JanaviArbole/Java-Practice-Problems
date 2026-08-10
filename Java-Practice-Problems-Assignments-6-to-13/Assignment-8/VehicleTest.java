class Vehicle
{
    String name;
    String brand;
    int speed;

    Vehicle(String name, String brand, int speed)
    {
        this.name = name;
        this.brand = brand;
        this.speed = speed;
    }

    // Inner class - displays vehicle details
    class VehicleDetails
    {
        void showDetails()
        {
            System.out.println("Vehicle Name : " + name);
            System.out.println("Brand : " + brand);
            System.out.println("Top Speed : " + speed + " km/h");
        }
    }

    // Interface for anonymous class
    interface Action
    {
        void performAction();
    }

    void doAction(Action action)
    {
        action.performAction();
    }

    public static void main(String[] args)
    {
        Vehicle car = new Vehicle("Model X", "Tesla", 250);

        Vehicle.VehicleDetails details = car.new VehicleDetails();
        details.showDetails();

        System.out.println("--------------------------");

        car.doAction(new Vehicle.Action()
        {
            @Override
            public void performAction()
            {
                System.out.println(car.name + " is starting the engine... Vroom!");
            }
        });
    }
}
