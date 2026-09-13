import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame {
    JTextField num1Field, num2Field, resultField;

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 5, 5));

        add(new JLabel("Number 1:"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("Number 2:"));
        num2Field = new JTextField();
        add(num2Field);

        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        add(addButton);
        add(subButton);

        add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        addButton.addActionListener(e -> calculate('+'));
        subButton.addActionListener(e -> calculate('-'));

        setVisible(true);
    }

    void calculate(char op) {
        try {
            double a = Double.parseDouble(num1Field.getText());
            double b = Double.parseDouble(num2Field.getText());
            double result = (op == '+') ? a + b : a - b;
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter valid numbers");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}