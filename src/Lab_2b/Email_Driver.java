package Lab_2b;

public class Email_Driver {

	public static void main(String[] args) {
		
		EmailInfo email = new EmailInfo();
		
		email.addFriend("bullwinkle wang", "moose@woods.ca");
		email.addFriend("rocky song", "squirrel@tree.ca");
		email.addFriend("boris yang", "spy@jail.com");
		
		System.out.println("GET A FRIEND'S EMAIL...........");
		System.out.println(email.getAddress("Rocky"));
		
		System.out.println("FIND A FRIEND BY EMAIL..........");
		email.findFriends("moose@woods.ca");
		
		System.out.println("REMOVE A FRIEND BY NAME (Boris)..........");
		email.removeFriend("Boris Yang");
		
		email.listAll();
		
		
		

	}

}
