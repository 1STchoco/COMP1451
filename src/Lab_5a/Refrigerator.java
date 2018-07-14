
package Lab_5a;

/**
 * Class refrigerator extends Appliance
 * @author wangmengjun
 */
public class Refrigerator extends Appliance{
    private double maxColdDegree; //in centigrade
    
    public Refrigerator(){}
    
    /**
     * constructor with parameters
     * @param brand brand
     * @param serialNumber serial number
     * @param height height in centimeters
     * @param depth depth in centimeters
     * @param width width in centimeters
     * @param maxColdDegree max coldness degrees centigrade
     */
    public Refrigerator(String brand,
                        String serialNumber,
                        double height,
                        double depth,
                        double width,
                        double maxColdDegree){
        
        super(brand, serialNumber, height, depth, width);
        this.maxColdDegree = maxColdDegree;
    }

    public double getMaxColdDegree() {
        return maxColdDegree;
    }

    public void setMaxColdDegree(double maxColdDegree) {
        this.maxColdDegree = maxColdDegree;
    }
    
    /**
     * get the capacity of the refrigerator
     * @return capacity in cubic centimeters
     */
    public double getCapacity(){
        return getHeight() * getDepth() * getWidth();
    }
}
