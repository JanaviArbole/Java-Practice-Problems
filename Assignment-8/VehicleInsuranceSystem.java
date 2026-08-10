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

    void displayVehicle()
    {
        System.out.println("Vehicle Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Insurance extends Vehicle
{
    String insuranceCompany;

    Insurance(String name, String brand, int speed, String insuranceCompany)
    {
        super(name, brand, speed);
        this.insuranceCompany = insuranceCompany;
    }

    void displayInsurance()
    {
        super.displayVehicle();
        System.out.println("Insurance Company: " + insuranceCompany);
    }
}

class CarInsurance extends Insurance
{
    double premium;

    CarInsurance(String name, String brand, int speed,
                 String insuranceCompany, double premium)
    {
        super(name, brand, speed, insuranceCompany);
        this.premium = premium;
    }

    void display()
    {
        super.displayInsurance();
        System.out.println("Insurance Type: Car Insurance");
        System.out.println("Premium: " + premium);
    }
}

class BikeInsurance extends Insurance
{
    double premium;

    BikeInsurance(String name, String brand, int speed,
                  String insuranceCompany, double premium)
    {
        super(name, brand, speed, insuranceCompany);
        this.premium = premium;
    }

    void display()
    {
        super.displayInsurance();
        System.out.println("Insurance Type: Bike Insurance");
        System.out.println("Premium: " + premium);
    }
}

public class VehicleInsuranceSystem
{
    public static void main(String[] args)
    {
        CarInsurance car = new CarInsurance(
                "Model X",
                "Tesla",
                250,
                "ICICI Lombard",
                25000);

        car.display();

        System.out.println("--------------------------");

        BikeInsurance bike = new BikeInsurance(
                "Apache",
                "TVS",
                120,
                "HDFC Ergo",
                8000);

        bike.display();
    }
}