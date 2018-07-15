package Lab_8ab;

/**
 *
 * @author wangmengjun
 */
public class HourlyEmployee extends Employee{
    
    private int hours;
    private final double hourlyWage;
    
    public HourlyEmployee(double hourlyWage){
        this.hourlyWage = hourlyWage;
    }
    
    public HourlyEmployee(String name, double hourlyWage){
        super(name);
        this.hourlyWage = hourlyWage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    
    @Override
    public double calculateMonthlyEarnings() {
        return hourlyWage * hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +"name=" + super.toString() + "hours=" + hours + ", hourlyWage=" + hourlyWage + '}';
    }
    
    
}
