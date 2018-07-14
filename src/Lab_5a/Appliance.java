
package Lab_5a;

/**
 * Appliance description the basic information of an appliance
 * aim for extended for a specified appliance
 * @author wangmengjun
 */
public class Appliance {
    private String brand;
    private String serialNumber;
    private double height; // interior height in centimeters
    private double depth;
    private double width;
    
    /**
     * Constructor with no parameter, initialize the 
     * fields to default value
     */
    public Appliance(){}
    
    /**
     * Constructor with parameters
     * @param brand set the brand
     * @param serialNumber serial number is a string
     * @param height height in centimeters
     * @param depth  depth in centimeters
     * @param width  width in centimeters
     */
    public Appliance(String brand, 
                     String serialNumber,
                     double height,
                     double depth,
                     double width){
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.height = height;
        this.depth = depth;
        this.width = width;
    }
    
    /**
     * get brand
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    @Override
    public String toString(){
        return "Brand: " + brand + "\nSerial Number: " + serialNumber;
    }
    
}
