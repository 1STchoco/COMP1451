
package Lab_5a;

/**
 *
 * @author wangmengjun
 */
public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String id;
    
    public Person(){}
    
    public Person(String fNmae, String lName, String email, String id){
        
        setFirstName(fNmae);
        setLastName(lName);
        setEmail(email);
        setId(id);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        
        if(firstName != null){
            this.firstName = firstName;
        }else{
            firstName = "unknow";
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        
        if(lastName != null){
            
            this.lastName = lastName;
        }else{
            lastName = "unknown";
        }
       
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        
        if(email != null){
            
            this.email = email;
        }else{
            email = "unknown";
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        
        if(id != null){
            this.id = id;
        }else{
            this.id = "unknown";
        }
        
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + 
                ",\nEmail: " + email + 
                "\n-------------------------";
    }
    
    
}
