
package Lab_6ab;

import java.util.ArrayList;

/**
 *
 * @author wangmengjun
 */
public class AnimalHotel {
    
    private ArrayList<Animal> guests;
    
    public AnimalHotel(){
        guests = new ArrayList<>();
    }
    
    public void addGuests(Animal animal){
        if(animal != null){
            guests.add(animal);
        }
    }
    
    public void display(){
        if(guests != null && guests.size() > 0){
            for (Animal guest : guests) {
                System.out.println(guest.toString());
            }
        }
    }
    
    public void display_2(){
        if(guests != null && guests.size() > 0){
            guests.forEach(guest -> {
                guest.display();
            });
        }
    }
    
    public static void main(String[] args) {
        AnimalHotel hotel = new AnimalHotel();
        hotel.addGuests(new Cat("Siamese", 2.4, true));
        hotel.addGuests((new Dog("Collie", 20.5, false)));
        
        hotel.display();
        hotel.display_2();
    }
}
