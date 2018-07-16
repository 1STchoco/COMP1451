package Lab_10;

/**
 *
 * @author wangmengjun
 */
class NotAnIntegerException extends Exception {
    private String message;
    
    public NotAnIntegerException(){}
    
    public NotAnIntegerException(String message){
        super(message);
        this.message = message;
    }

    @Override
    public String toString() {
        return "Throwing NotAnIntegerException: " + message;
    }
    
    
}
