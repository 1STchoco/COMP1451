package Lab_8ab;

/**
 *
 * @author wangmengjun
 */
public class SalariedEmployee extends Employee{
    private double salary;
    private int workingWeeksPerYear;
    
    public SalariedEmployee(){}
    
    public SalariedEmployee(String name, double salary, int workingWeeksPerYear){
        super(name);
        setSalary(salary);
        setWorkingWeeksPerYear(workingWeeksPerYear);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkingWeeksPerYear() {
        return workingWeeksPerYear;
    }

    public void setWorkingWeeksPerYear(int workingWeeksPerYear) {
        this.workingWeeksPerYear = workingWeeksPerYear;
    }

    @Override
    public double calculateMonthlyEarnings() {
        return salary / workingWeeksPerYear * (52/14);
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "name=" + super.getName() + 
                "salary=" + salary + ", workingWeeksPerYear=" + workingWeeksPerYear + '}';
    }
    
    
}
