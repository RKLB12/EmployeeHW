public abstract class Employees {
    public String name;
    public int hireYear;

    public Employees(String name, int hireYear){}
    public Employees(){}

    public String getName(){
        return null;
    }
    public int getHireYear(){
        return 0;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", hireYear=" + hireYear +
                '}';
    }
    public abstract double annualSalary();

    public abstract double monthlySalary();
}
