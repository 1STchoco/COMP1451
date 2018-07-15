package Lab_8ab;

/**
 *
 * @author wangmengjun
 */
public abstract class Employee {
    
    private String name;
    
    public Employee(){};
    
    public Employee(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        
        if(name != null && name.trim() != ""){
            this.name = name;
        }
        
    }
    
    /**
     * this is a abstract method 
     * @return monthly earnings
     */
    public abstract double calculateMonthlyEarnings();

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + '}';
    }
    
    
}
