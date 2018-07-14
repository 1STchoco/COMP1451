
package Lab_5a;

import java.util.ArrayList;

/**
 *
 * @author wangmengjun
 */
public class Database {
    
    private ArrayList<Person> persons;
    
    public Database(){
        persons = new ArrayList<>();
    }
    
    public void addPerson(Person p){
        if(p != null){
            persons.add(p);
        }
    }
    
    public void showAll(){
        if(persons.size() > 0){
            for(Person p:persons){
                System.out.println(p.toString());
            }
        }
    }
    
    public static void main(String[] args) {
        Database db = new Database();

        db.addPerson(new Instructor("Bullwinkle", "Moose", "moose@woods.ca","A00123456", 25.00));
        db.addPerson(new Student("Rocky", "Suirrel","squirrel@upatree.ca", "A00789432"));
        db.addPerson(new Student("Darby", "Dog", "woof@you.ca", "A00456882"));
        db.addPerson(new Student("Myia", "Dog", "arf@arf.arf", "A00689177"));
        
        Student s = new Student("Rocky", "Suirrel","squirrel@upatree.ca", "A00789432");
        
        s.addCourse("COMP 111", 90);
        s.addCourse("BUSA1099", 90);
        s.addCourse(("de"), 100);
        
        System.out.format("Average: %.2f\n", s.getAverageGrade());
        db.showAll();
    }
}
