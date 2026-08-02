public class EmployeePayroll
{
    String employeeId;
    String basicSalaryStr;
    String bonusStr;

    EmployeePayroll()
    {
        employeeId = "EMP-1001";
        basicSalaryStr = "45000";
        bonusStr = "5000";
    }

    EmployeePayroll(String id, String salary, String bonus)
    {
        employeeId = id;
        basicSalaryStr = salary;
        bonusStr = bonus;
    }

    void processPayroll()
    {
        Integer empId = Integer.valueOf(employeeId.replaceAll("[^0-9]", ""));
        Double basicSalary = Double.valueOf(basicSalaryStr);
        Double bonus = Double.valueOf(bonusStr);

        if(basicSalary >= 0 && bonus >= 0)
        {
            Double netSalary = basicSalary + bonus;
            System.out.println("EMPLOYEE ID: EMP-" + empId);
            System.out.println("BASIC SALARY: " + basicSalary);
            System.out.println("BONUS AMOUNT: " + bonus);
            System.out.println("NET SALARY: " + netSalary);
        }
        else
        {
            System.out.println("ERROR: Salary and bonus values cannot be negative.");
        }
    }

    public static void main(String[] arg)
    {
        EmployeePayroll ep1 = new EmployeePayroll();
        System.out.println("-----------------------------------------------");
        System.out.println("Payroll Data from Default Constructor:");
        ep1.processPayroll();
        System.out.println("-----------------------------------------------");

        EmployeePayroll ep2 = new EmployeePayroll("EMP-2002", "60000.50", "7500.25");
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("Payroll Data from Parameterized Constructor:");
        ep2.processPayroll();
        System.out.println("-----------------------------------------------");
    }
}