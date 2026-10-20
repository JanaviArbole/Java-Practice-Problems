class Bank
{
    int balance = 1000;

    synchronized void deposit(int amount)
    {
        balance += amount;
        System.out.println("Deposited: " + amount
                           + ", Balance: " + balance);
    }

    synchronized void withdraw(int amount)
    {
        if (balance >= amount)
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount
                               + ", Balance: " + balance);
        }
        else
        {
            System.out.println("Insufficient balance!");
        }
    }
}

class DepositThread implements Runnable
{
    Bank b;

    DepositThread(Bank b)
    {
        this.b = b;
    }

    public void run()
    {
        for (int i = 1; i <= 3; i++)
            b.deposit(500);
    }
}

class WithdrawThread implements Runnable
{
    Bank b;

    WithdrawThread(Bank b)
    {
        this.b = b;
    }

    public void run()
    {
        for (int i = 1; i <= 3; i++)
            b.withdraw(300);
    }
}

public class BankThread
{
    public static void main(String[] args)
    {
        Bank b = new Bank();

        Thread t1 = new Thread(new DepositThread(b));
        Thread t2 = new Thread(new WithdrawThread(b));

        t1.start();
        t2.start();
    }
}