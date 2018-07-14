
package lab1;

import java.util.ArrayList;
import java.util.Random;

/**
 * Kennel has one instance variable, an ArrayList of Dog. It has these methods:
 * void addDog(Dog theDog) - adds a dog to the kennel.
 * void displayDogs() - displays name, breed and age of all dogs in the kennel.
 * Dog getRandomDog() - randomly selects a dog, returns it, and removes it from the kennel. 
 * Returns null if there are no dogs.
 * void adopt() - calls getRandomDog() to get a dog, and displays the dog's details on the screen. 
 * If there are no dogs it displays this information.
 * @author wangmengjun
 * @version 1.0
 */
class Kennel {
    private final ArrayList<Dog> dogs = new ArrayList<>();
    
    public void addDog(Dog theDog){
        if (theDog != null) {
            this.dogs.add(theDog);
        }
    } 
    
    public void displayDogs(){
        System.out.println("----------All Dogs--------");
        dogs.forEach((d) -> {
            System.out.println(d.toString());
        });
        System.out.println("----------  END  --------");
    }
    
    public Dog getRandomDog(){
        
        if(dogs.isEmpty()){
            return null;
        }else{
            Dog d = dogs.get(new Random().nextInt(dogs.size()));
            dogs.remove(d);
            return d;
        }
    }
    
    public void adopt(){
        Dog d = getRandomDog();
        
        if(d == null){
            System.out.println("No dogs, adoption failed");
        }else{
            System.out.println("Dog adopted! " + d.toString());
        }
    }
}
