
package lab1;

/**
 * FINALLY create a driver class that creates a few Dogs and places them in the Kennel. 
 * Then test the Kennel methods by calling them from the driver class.
 * @author wangmengjun
 */
class Driver {
    
    private final Kennel kennel;
    
    public Driver(Kennel kennel){
        
        this.kennel = kennel;
    }
    
    public Kennel getKennel(){
        return this.kennel;
    }
    
    public static void main(String[] args) {
        final Driver d = new Driver(new Kennel());
        final Dog dog1 = new Dog();
        final Dog dog2 = new Dog("Tom", "A", 2);
        final Dog dog3 = new Dog("Jery", "C", 3);
        
        d.getKennel().addDog(dog1);
        d.getKennel().addDog(dog2);
        d.getKennel().addDog(dog3);
        
        d.getKennel().displayDogs();
        d.getKennel().adopt();
        d.getKennel().displayDogs();
        d.getKennel().getRandomDog();
        d.getKennel().displayDogs();
        d.getKennel().adopt();
        d.getKennel().adopt();
    }
}
