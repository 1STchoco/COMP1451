
package Lab_6ab;

/**
 *
 * @author wangmengjun
 */
public class Cat extends Animal{
    private boolean hunts;
    
    public Cat(){}
    
    public Cat(String breed, double weight, boolean hunts){
        super(breed, weight);
        this.hunts = hunts;
    }

    @Override
    public void display() {
        if(hunts){
            System.out.println("This is a hunter!");
        }
        else{
            System.out.println("This is one lazy cat!");
        }
        super.display();
    }
    

    @Override
    public String toString(){
        return super.toString() + ", hunts=" + hunts;
    }
}
