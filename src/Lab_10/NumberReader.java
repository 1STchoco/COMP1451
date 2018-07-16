package Lab_10;

/**
 *
 * @author wangmengjun
 */
public class NumberReader {
    private InputReader inputReader;
    
    public NumberReader(){
        inputReader = new InputReader();
    }
    
    public void reads(){
        boolean userWantsToContinue = true;
        int sum = 0;
        
        do { 
            System.out.print("Type a whole number, 0 to stop: ");
            
            try {
                
                int input = inputReader.getNumber();
                
                if (input == 0) {
                    userWantsToContinue = false;
                }
                
                sum += input;
            } catch (NotAnIntegerException e) {
                System.out.println(e.getMessage());
                
            }
            
        } while (userWantsToContinue);
        
        System.out.println("The sum of numbers entered is " + sum);
    }
    
}
