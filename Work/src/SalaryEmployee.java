public class SalaryEmployee extends Employees{
    public int annualSalary;
    public boolean hasBenefits;

    public SalaryEmployee(String Salary, int annualSalary, int annually){}

    @Override
    public double annualSalary() {
        return 0;
    }

    @Override
    public double monthlySalary() {
        return 0;
    }
}
