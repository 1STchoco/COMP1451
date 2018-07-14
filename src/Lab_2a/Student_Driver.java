package Lab_2a;


public class Student_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                
                StudentDatabase std = new StudentDatabase();
                std.addStudent("tai wang");
                std.addStudent("en li");
                std.addStudent("ivan wang");
                std.addStudent("rocky smith");
                
                std.showQuizMarks();
                
                std.changeQuizMark("ivan wang", 4, 55);
                
                std.showQuizMarks();
	}

}
