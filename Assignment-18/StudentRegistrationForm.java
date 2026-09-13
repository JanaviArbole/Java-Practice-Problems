import javax.swing.*;
import java.awt.*;

public class StudentRegistrationForm extends JFrame {
    JTextField nameField, rollField, courseField;

    public StudentRegistrationForm() {
        setTitle("Student Registration Form");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 5, 5));

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Roll Number:"));
        rollField = new JTextField();
        add(rollField);

        add(new JLabel("Course:"));
        courseField = new JTextField();
        add(courseField);

        JButton submitButton = new JButton("Submit");
        add(submitButton);

        submitButton.addActionListener(e -> {
            String info = "Name: " + nameField.getText() +
                    "\nRoll Number: " + rollField.getText() +
                    "\nCourse: " + courseField.getText();
            JOptionPane.showMessageDialog(this, info, "Student Details", JOptionPane.INFORMATION_MESSAGE);
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}