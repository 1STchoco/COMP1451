package Lab_9ab;

/**
 *
 * @author wangmengjun
 */
public class MyArrayList implements MyList{
    
    private Object[] theList;
    private int counter;
    private int length = 2;
    private Object type;
    
    public MyArrayList(){
        theList = new Object[length];
        counter = -1;
    }
    
    public MyArrayList(Object type){
        this();
        this.type = type;
        
    }
    /**
     * add a element to the list
     * @param toAdd element to be added
     * @return true, if element is added successful
     *  false, if element is added unsuccessful
     */
    @Override
    public boolean add(Object toAdd) {
        Class<?> clazz = toAdd.getClass();
        
        if(toAdd != null && clazz.isInstance(type)){
            
            if (counter == length - 1) {
                allocateMoreSpace();
            }
            
            theList[++counter] = toAdd;
            return true;
        }
        System.out.println(clazz.getName() + " is not a compatible type of " + type.getClass().getName());
        return false;
    }
    
    /**
     * get the element at specified index
     * @param index the index of required element
     * @return the element at index, or throw IllegalArguementException if index is out of range
     */
    @Override
    public Object get(int index) {
        
        
        if(index <= counter && index >= 0){
            
            return theList[index];
        }
        
        throw new IllegalArgumentException("index is out of range");
    }

    
    /**
     * remove the element at specified index, and shift the subsequence to the left
     * @param index index of element to be removed
     * @return removed object, if being successfully removed.  false, if fails (index out of range)
     */
    @Override
    public Object remove(int index) {
        
        if(index <= counter && index >= 0){
            
           Object temp = theList[index];
           for(int i = index; i <= counter; i++){
                theList[i] = theList[i + 1];   
           }
           counter--;
           
           return temp;
        }
        
        return false;
    }

    @Override
    public int size() {
        return counter + 1;
    }

    @Override
    public boolean isEmpty() {
        return counter == -1;
    }
    
   
    //add 10 more space to the array every time more space is needed
    private void allocateMoreSpace(){
        int oldLength = length;
        
        length = length + 10;
        Object[] newList = new Object[length];
        
        for (int i = 0; i < oldLength; i++) {
            newList[i] = theList[i];
        }
        theList = newList;
    }

    void displayArray() {
        System.out.println("------");
        for (int i = 0; i <= counter; i++) {
            System.out.println(theList[i].toString());
        }
        System.out.println("-------");
    }
}
