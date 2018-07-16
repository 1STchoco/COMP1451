package Lab_10;

import java.util.Scanner;

/**
 *
 * @author wangmengjun
 */
public class InputReader {
    private Scanner scanner;
    
    public InputReader(){
        scanner = new Scanner(System.in);
    }
    
    public int getNumber() throws NotAnIntegerException{
        
        int number = 0;
        
        try {
            number = scanner.nextInt();
            
        } catch (java.util.InputMismatchException e) {
            //catch any non-integer input
            scanner.nextLine(); //clear the buffer
            throw new NotAnIntegerException("not a valid number!");
        }
        
        return number;
    }
}
