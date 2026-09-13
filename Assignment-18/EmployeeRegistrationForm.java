import javax.swing.*;
import java.awt.*;

public class EmployeeRegistrationForm extends JFrame {
    JTextField idField, nameField, deptField, salaryField;

    public EmployeeRegistrationForm() {
        setTitle("Employee Registration Form");
        setSize(350, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 5, 5));

        add(new JLabel("Employee ID:"));
        idField = new JTextField();
        add(idField);

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Department:"));
        deptField = new JTextField();
        add(deptField);

        add(new JLabel("Salary:"));
        salaryField = new JTextField();
        add(salaryField);

        JButton submitButton = new JButton("Submit");
        add(submitButton);

        submitButton.addActionListener(e -> {
            String info = "Employee ID: " + idField.getText() +
                    "\nName: " + nameField.getText() +
                    "\nDepartment: " + deptField.getText() +
                    "\nSalary: " + salaryField.getText();
            JOptionPane.showMessageDialog(this, info, "Employee Details", JOptionPane.INFORMATION_MESSAGE);
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new EmployeeRegistrationForm();
    }
}