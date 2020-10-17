public class PartTime extends HourlyEmployee {

    public boolean hasBenefits;

    public PartTime(String HourlyEmployee, int HourlyEmployees, int hourlyWage, int hoursPerWeek) {
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
