
package Lab_5a;

/**
 * Class Stove extends Appliance
 * @author wangmengjun
 */
public class Stove extends Appliance{
    private int numberOfHeating;
    
    public Stove(){}
    
    /**
     * constructor with parameters
     * @param brand brand
     * @param serialNumber
     * @param height in centimeters
     * @param depth in centimeters
     * @param width in centimeters
     * @param numberOfHeating number of heating elements
     */
    public Stove(String brand,
                 String serialNumber,
                 double height,
                 double depth,
                 double width,
                 int numberOfHeating){
        
        super(brand, serialNumber, height, depth, width);
        this.numberOfHeating = numberOfHeating;
    }

    public int getNumberOfHeating() {
        return numberOfHeating;
    }

    public void setNumberOfHeating(int numberOfHeating) {
        this.numberOfHeating = numberOfHeating;
    }
    
}
