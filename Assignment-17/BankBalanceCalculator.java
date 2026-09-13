import java.awt.*;
import javax.swing.*;

public class BankBalanceCalculator extends JFrame {
    JTextField initialBalanceField, transactionField, balanceField;
    double currentBalance = 0;

    public BankBalanceCalculator() {
        setTitle("Bank Balance Calculator");
        setSize(320, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 5, 5));

        add(new JLabel("Initial Balance:"));
        initialBalanceField = new JTextField();
        add(initialBalanceField);

        add(new JLabel("Transaction Amount:"));
        transactionField = new JTextField();
        add(transactionField);

        JButton depositButton = new JButton("Deposit (+)");
        JButton withdrawButton = new JButton("Withdraw (-)");
        add(depositButton);
        add(withdrawButton);

        add(new JLabel("Updated Balance:"));
        balanceField = new JTextField();
        balanceField.setEditable(false);
        add(balanceField);

        JButton setButton = new JButton("Set Initial Balance");
        add(setButton);

        setButton.addActionListener(e -> {
            try {
                currentBalance = Double.parseDouble(initialBalanceField.getText());
                balanceField.setText(String.valueOf(currentBalance));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter valid initial balance");
            }
        });

        depositButton.addActionListener(e -> updateBalance(1));
        withdrawButton.addActionListener(e -> updateBalance(-1));

        setVisible(true);
    }

    void updateBalance(int sign) {
        try {
            double amount = Double.parseDouble(transactionField.getText());
            currentBalance += sign * amount;
            balanceField.setText(String.valueOf(currentBalance));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter valid transaction amount");
        }
    }

    public static void main(String[] args) {
        new BankBalanceCalculator();
    }
}