abstract class Shape
{
    String name;

    Shape(String name)
    {
        this.name = name;
    }

    abstract double calculateArea();

    void display()
    {
        System.out.println(name + " Area = " + calculateArea());
    }
}

class Circle extends Shape
{
    double radius;

    Circle(double radius)
    {
        super("Circle");
        this.radius = radius;
    }

    double calculateArea()
    {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape
{
    double length;
    double width;

    Rectangle(double length, double width)
    {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    double calculateArea()
    {
        return length * width;
    }
}

public class ShapeTest
{
    public static void main(String[] args)
    {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        circle.display();
        rectangle.display();
    }
}