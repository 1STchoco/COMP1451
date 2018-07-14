/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_5a;

/**
 *
 * @author wangmengjun
 */
public class Instructor extends Person{
    private double wageHourly;
    
    public Instructor(){}
    
    public Instructor(String fNmae, String lName, String email, String id, double wage){
        super(fNmae, lName, email, id);
        setWageHourly(wage);
    }

    public double getWageHourly() {
        return wageHourly;
    }

    public void setWageHourly(double wageHourly) {
        this.wageHourly = wageHourly;
    }
}
