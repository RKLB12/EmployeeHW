public class FullTime extends HourlyEmployee{
    public boolean hasBenefits;
    FullTime(String HourlyEmployee, int HourlyEmployees, double hourlyWage, double hoursPerWeek) {
        super(HourlyEmployee, HourlyEmployees, hourlyWage, hoursPerWeek);
    }

    @Override
    public boolean isHasBenefits() {
        return false;
    }

    @Override
    public double annualSalary() {
        return 0;
    }

    @Override
    public double monthlySalary() {
        return 0;
    }
}
