package Lab_9ab;

import java.awt.Color;

/**
 *
 * @author wangmengjun
 */
public class Driver {
    public static void main(String[] args) {
		
		MyArrayList myList = new MyArrayList(new String());
		myList.add("Darby");
		myList.add(new Color(1,2,3));
		myList.add("Myia");
		myList.add("Freckle");
		myList.add("Bullwinkle");	
		myList.displayArray();
		
		System.out.println(myList.isEmpty());
		System.out.println(myList.size());
		System.out.println(myList.get(0));
		
		myList.remove(0);
		System.out.println(myList.get(0));
		System.out.println(myList.size());
		myList.displayArray();

	}
}
