package Lab_8ab;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author wangmengjun
 */
public class Company {
    
    private final ArrayList<Employee> employees;
    
    public Company(){
        this.employees = new ArrayList<>();
    }
    
    public void addEmployee(Employee employee){
        if (employees != null && !employees.contains(employee)) {
            employees.add(employee);
        }
    }
    
    public void removeEmployee(String employee){
        if (employees != null && employees.size() > 0) {
            for (Iterator<Employee> iterator = employees.iterator(); iterator.hasNext();) {
                Employee next = iterator.next();
                if(next.getName().equals(employee)){
                    iterator.remove();
                }
                
            }
        }
    }
    
    public void listAllEmployees(){
        if (employees != null && employees.size() > 0) {
            for(Employee e : employees){
                System.out.println("name: " + e.getName() + ", Montly Earning: " +  e.calculateMonthlyEarnings());
            }
        }
    }
    
    public static void main(String[] args) {
        
        
        Company theCompany = new Company();
        theCompany.addEmployee(new CommissionEmployee("Herb Tarlek", 25000.00) );
        theCompany.addEmployee(new HourlyEmployee("Ralph Kramden", 120.00) );
        theCompany.addEmployee(new SalariedEmployee("George Costanza", 45000.00, 47));
        theCompany.addEmployee(new SalariedEmployee("Jim, Benning", 500000.00, 50));

        System.out.println("Current Employee list -----------------");
        theCompany.listAllEmployees();

        theCompany.removeEmployee("Herb Tarlek");

        System.out.println("Current Employee list after firing that lazy bum Tarlek -----------------");
        theCompany.listAllEmployees();
    }
}
