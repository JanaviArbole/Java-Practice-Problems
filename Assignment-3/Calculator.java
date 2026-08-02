public class Calculator
{
    static int count = 0;

    int add(int a, int b)
    {
        count++;
        return a + b;
    }

    double add(double a, double b)
    {
        count++;
        return a + b;
    }

    int add(int a, int b, int c)
    {
        count++;
        return a + b + c;
    }

    void printResult()
    {
        System.out.println("TOTAL CALCULATIONS PERFORMED: " + count);
    }

    public static void main(String[] arg)
    {
        Calculator calc = new Calculator();

        System.out.println("-----------------------------------------------");
        System.out.println("Addition of two integers (5 and 10): " + calc.add(5, 10));
        System.out.println("-----------------------------------------------");

        System.out.println("-----------------------------------------------");
        System.out.println("Addition of two decimals (5.5 and 10.2): " + calc.add(5.5, 10.2));
        System.out.println("-----------------------------------------------");

        System.out.println("-----------------------------------------------");
        System.out.println("Addition of three integers (1, 2 and 3): " + calc.add(1, 2, 3));
        System.out.println("-----------------------------------------------");

        System.out.println("-----------------------------------------------");
        calc.printResult();
        System.out.println("-----------------------------------------------");
    }
}