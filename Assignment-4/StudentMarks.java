public class StudentMarks
{
    String studentName;
    String subject1Marks;
    String subject2Marks;
    String subject3Marks;

    StudentMarks()
    {
        studentName = "Janavi Arbole";
        subject1Marks = "85";
        subject2Marks = "90";
        subject3Marks = "88";
    }

    StudentMarks(String name, String m1, String m2, String m3)
    {
        studentName = name;
        subject1Marks = m1;
        subject2Marks = m2;
        subject3Marks = m3;
    }

    void calculateAndPrint()
    {
        int mark1 = Integer.parseInt(subject1Marks);
        int mark2 = Integer.parseInt(subject2Marks);
        int mark3 = Integer.parseInt(subject3Marks);
        int totalMarks = mark1 + mark2 + mark3;
        double averageMarks = totalMarks / 3.0;

        System.out.println("STUDENT NAME: " + studentName);
        System.out.println("SUBJECT 1 MARKS: " + mark1);
        System.out.println("SUBJECT 2 MARKS: " + mark2);
        System.out.println("SUBJECT 3 MARKS: " + mark3);
        System.out.println("TOTAL MARKS: " + totalMarks);
        System.out.println("AVERAGE MARKS: " + averageMarks);
    }

    public static void main(String[] arg)
    {
        StudentMarks sm1 = new StudentMarks();
        System.out.println("-----------------------------------------------");
        System.out.println("This data is from the default constructor.");
        sm1.calculateAndPrint();
        System.out.println("-----------------------------------------------");

        StudentMarks sm2 = new StudentMarks("Priya Patil", "92", "88", "95");
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("This data is from the parameterized constructor.");
        sm2.calculateAndPrint();
        System.out.println("-----------------------------------------------");
    }
}