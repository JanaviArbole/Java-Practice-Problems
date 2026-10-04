package assignment12;

import assignment12.faculty.Faculty;
import assignment12.student.Student;

public class CollegeInfo
{
    public static void main(String[] args)
    {
        Student s = new Student();
        Faculty f = new Faculty();

        s.display();

        System.out.println();

        f.display();
    }
}