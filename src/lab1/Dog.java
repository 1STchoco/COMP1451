
package lab1;

/**
 * Dog has instance variables for name, breed, and age in years. 
 * This class has a default constructor and an overloaded constructor. 
 * The default constructor sets both name and breed to default values. 
 * The overloaded constructor expects all three values to be passed
 * as parameters and calls the "setters" to assign.
 * The set methods validate their parameters. 
 * If a null or "" is passed to setName or setBreed the field is not changed. 
 * If a negative number is passed to setAgeInYears the field is not changed.
 * This class also has appropriately-named accessors.
 * @author wangmengjun
 */
class Dog {
    private String name;
    private String breed;
    private int age;
    
    private static final String DEFAULT_NAME = "Pango";
    private static final String DEFAULT_BREED = "B";
    private static final int DEFAULT_AGE = 3;
    
    public Dog(){
         this(DEFAULT_NAME, DEFAULT_BREED, DEFAULT_AGE);
    }
    
    public Dog(String name, String breed, int age){
        setName(name);
        setBreed(breed);
        setAgeInYears(age);
    }
    
    //set method
    public final void setName(String name){
        if(name != null && name.trim().length() > 0){
            this.name = name;
        }
    }
    
    public final void setBreed(String breed){
        if(breed != null && breed.trim().length() > 0){
            this.breed = breed;
        }
    }
    
    public final void setAgeInYears(int age){
        if(age > 0){
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Breed: " + breed + ", Age: " + age;
    }
    
    
}
