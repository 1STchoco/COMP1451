/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_8ab;

/**
 *
 * @author wangmengjun
 */
public class CommissionEmployee extends Employee {
    private double commissionRate;
    private int totalSalesMonthly;

  
    
    public CommissionEmployee(){};
    
    public CommissionEmployee(String name, double commissionRate){
        super(name);
        setCommissionRate(commissionRate);
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public int getTotalSalesMonthly() {
        return totalSalesMonthly;
    }

    public void setTotalSalesMonthly(int totalSalesMonthly) {
        this.totalSalesMonthly = totalSalesMonthly;
    }
    
    @Override
    public double calculateMonthlyEarnings() {
        return getTotalSalesMonthly()*getCommissionRate();
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" + "name=" + super.getName() + 
                "commissionRate=" + commissionRate + ", totalSalesMonthly=" + totalSalesMonthly + '}';
    }
    
}
