
package Lab_5a;

import java.util.ArrayList;

/**
 * ApplianceStore class maintain a list a appliances
 * @author wangmengjun
 */
public class ApplianceStore {
    private ArrayList<Appliance> appliances;
    
    public ApplianceStore(){
        appliances = new ArrayList<>();
    }
    
    public void addAppliance(Appliance app){
        appliances.add(app);
    }
    
    public int countAppliances(){
        return this.appliances.size();
    }
    
    public void displayInfo(){
        for (Appliance app : appliances) {
            System.out.println(app.toString());
        }
    }
    
    public static void main(String[] args) {
        ApplianceStore store = new ApplianceStore();

        store.addAppliance(new Stove("E-Z Bake", "R0234", 36, 48, 36, 4));
        store.addAppliance(new Stove("Gas Light", "G-45001", 36, 48, 36, 4));
        store.addAppliance(new Refrigerator("Arctic Cool", "F01-123", 72, 36, 36, -10));

        System.out.println("The number of appliances in the store is: " + store.countAppliances());
        store.displayInfo();
    }
}
