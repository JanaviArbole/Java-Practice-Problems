//1. Create a Student class using default and parameterized constructors to initialize student name and roll number.  

public class Student 
{
    String name;
    int roll_num;

    Student()
    {
        name = "Janavi";
        roll_num = 514;
    }

    Student(String fname, int rollno)
    {
        name = fname;
        roll_num = rollno;
    }

    void display()
    {
        System.out.println("Name of the Student: "+name);
        System.out.println("Roll Number of the Student: "+roll_num);
    }
    public static void main(String[] args) 
    {
        Student stud = new Student();
        System.out.println("-----------------------------------------------");
        System.out.println("This is the statement from default constructor.");
        stud.display();
        System.out.println("-----------------------------------------------");
        System.out.println();

        Student stud1 = new Student("Riya", 122);
        System.out.println("-----------------------------------------------");
        System.out.println("This is cthe statement from parameterized constructor.");
        stud1.display();
        System.out.println("-----------------------------------------------");
    }
}
