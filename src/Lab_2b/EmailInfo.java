
package Lab_2b;

import java.util.HashMap;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author wangmengjun
 */
public class EmailInfo {
    private final HashMap<String, String> addressBook;
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    
    public EmailInfo(){
        addressBook = new HashMap<>();
    }
    
    private String formatName(String name){
        String formatted = "";
        
        if (isValidName(name)) {
            String[] parts = name.trim().toLowerCase().split(" ");
            
            for(String part:parts){
                formatted += part.substring(0, 1).toUpperCase() + part.substring(1) + " ";
            }
        }
        else{
            System.out.println("Not a valid name.");
        }
        
        return formatted.trim();
    }
    
    public void addFriend(String name, String email){
        if(isValidName(name)){
            if(isValidEmail(email)){
                
                addressBook.put(formatName(name), email);
            }
            else{
                System.out.println("Not a valid email.");
            }
        }
        else{
            System.out.println("Not a valid name.");
        }
    }
    
    public void removeFriend(String name){
        if (isValidName(name)) {
            
            name = formatName(name);
            if (addressBook.containsKey(name)) {
                
                addressBook.remove(name);
                System.out.println("\"" + name + "\""+ " has been removed");
            }
            else{
                System.out.println("\"" + name + "\""+ " not found");
            }
        }
        else{
            System.out.println("Not a valid name");
        }
    }
    
    public String getAddress(String name){
        if (isValidName(name)) {
            
            name = formatName(name);
            if(addressBook.containsKey(name)){
                return addressBook.get(name);
            }
            else{
                System.out.println("\"" + name + "\""+ " not found");
            }
        }
        else{
            System.out.println("Not a valid name");
        }
        return null;
    }
    
    public void findFriends(String email){
        
        if(isValidEmail(email)) {
            if (addressBook.containsValue(email)) {
                System.out.print("names with email \"" + email + "\" : ");
                Set<String> names = addressBook.keySet();
                
                names.stream()
                        .filter((nm) -> (addressBook.get(nm).equals(email)))
                        .forEachOrdered((nm) -> {
                            System.out.print(nm + " ");
                        });
                
                System.out.println("");
            }
            else{
                System.out.println("No such email");
            }
        }
        else{
            System.out.println("Not a valid email");
        }
        
    }
    
    public void listAll(){
        if(addressBook.size() > 0){
            
            Set<String> names = addressBook.keySet();
            names.forEach((nm) -> {
                System.out.println(nm + " : " + addressBook.get(nm));
            });
        }
        else{
            System.out.println("Empty address book");
        }
    }
  
    private boolean isValidEmail(String email){
        if(email != null && email.trim().length() > 0){
            Matcher match = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
            return match.matches();
        }
        return false;
    }
    
    private boolean isValidName(String name){
        return name != null && name.trim().length() > 0;
    }
}
