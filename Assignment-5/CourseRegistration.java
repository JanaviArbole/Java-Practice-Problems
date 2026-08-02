import java.util.ArrayList;

public class CourseRegistration
{
    String studentName;
    ArrayList<String> courses;

    CourseRegistration()
    {
        studentName = "Abhishek Deshmukh";
        courses = new ArrayList<String>();
        courses.add("Object-Oriented Programming");
        courses.add("Data Structures and Algorithms");
    }

    CourseRegistration(String name)
    {
        studentName = name;
        courses = new ArrayList<String>();
    }

    void addCourse(String courseName)
    {
        courses.add(courseName);
    }

    void removeCourse(String courseName)
    {
        courses.remove(courseName);
    }

    void viewCourses()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("STUDENT NAME: " + studentName + "\n");
        sb.append("REGISTERED COURSES:\n");
        for(int i = 0; i < courses.size(); i++)
        {
            sb.append((i + 1) + ". " + courses.get(i) + "\n");
        }
        System.out.print(sb.toString());
    }

    public static void main(String[] arg)
    {
        CourseRegistration cr1 = new CourseRegistration();
        System.out.println("-----------------------------------------------");
        System.out.println("Default Course Registration Data:");
        cr1.viewCourses();
        System.out.println("-----------------------------------------------");

        CourseRegistration cr2 = new CourseRegistration("Rahul Sharma");
        cr2.addCourse("Cloud Computing");
        cr2.addCourse("Database Management Systems");
        cr2.addCourse("Web Development");
        cr2.removeCourse("Database Management Systems");

        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("Modified Course Registration Data:");
        cr2.viewCourses();
        System.out.println("-----------------------------------------------");
    }
}