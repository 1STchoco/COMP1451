
package Lab_6ab;

/**
 *
 * @author wangmengjun
 */
public class Dog extends Animal{
    private boolean likeToWalk;
    
    public Dog(){}
    
    public Dog(String breed, double weight, boolean likeToWalk){
        super(breed, weight);
        this.likeToWalk = likeToWalk;
    }

     @Override
    public void display() {
        if(likeToWalk){
            System.out.println("This dog likes to wals!");
        }
        else{
            System.out.println("This is one lazy dog!");
        }
        super.display();
    }
    
    @Override
    public String toString() {
        return super.toString() + ", likeToWalk=" + likeToWalk;
    }
    
}
