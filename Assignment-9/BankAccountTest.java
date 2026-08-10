
class BankAccount
{
    final long accountNumber;
    String name;
    double balance;

    BankAccount(long accountNumber, String name, double balance)
    {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void display()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountTest
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount(1234567890, "Rahul", 50000);

        account.display();
    }
}