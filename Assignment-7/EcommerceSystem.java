interface Product
{
    void display();
}

class Item
{
    int id;
    String name;
    double price;

    Item(int id, String name, double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class Electronic extends Item implements Product
{
    Electronic(int id, String name, double price)
    {
        super(id, name, price);
    }

    public void display()
    {
        System.out.println("Electronic Product");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Clothing extends Item implements Product
{
    Clothing(int id, String name, double price)
    {
        super(id, name, price);
    }

    public void display()
    {
        System.out.println("Clothing Product");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Grocery extends Item implements Product
{
    Grocery(int id, String name, double price)
    {
        super(id, name, price);
    }

    public void display()
    {
        System.out.println("Grocery Product");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

public class EcommerceSystem
{
    public static void main(String[] args)
    {
        Product p1 = new Electronic(101, "Laptop", 55000);
        Product p2 = new Clothing(102, "T-Shirt", 799);
        Product p3 = new Grocery(103, "Rice", 1200);

        p1.display();

        System.out.println();

        p2.display();

        System.out.println();

        p3.display();
    }
}