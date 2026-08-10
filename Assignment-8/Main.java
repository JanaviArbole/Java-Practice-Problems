class Employee
{
    String name;
    int empId;
    double salary;

    Employee(String name, int empId, double salary)
    {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee
{
    String department;
    double bonus;

    Manager(String name, int empId, double salary, String department, double bonus)
    {
        super(name, empId, salary);
        this.department = department;
        this.bonus = bonus;
    }

    void display()
    {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (salary + bonus));
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Manager mgr = new Manager("Alice", 101, 60000, "Engineering", 5000);
        mgr.display();
    }
}
