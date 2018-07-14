
package Lab_6ab;

/**
 *
 * @author wangmengjun
 */
public class Animal {
    private String breed;
    private double weight;//in kilos
    
    public Animal(){}
    
    public Animal(String breed, double weight){
        this.breed = breed;
        this.weight = weight;
    }

    protected String getBreed() {
        
        return breed;
    }

    protected void setBreed(String breed) {
        this.breed = breed;
    }

    protected double getWeight() {
        return weight;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }
    
    protected void display(){
        System.out.println("This is a " + breed + 
                " weighting " + weight + " kilos.");
    }
    
    @Override
    public String toString() {
        return "breed=" + breed + ", weight=" + weight;
    }
    
}
