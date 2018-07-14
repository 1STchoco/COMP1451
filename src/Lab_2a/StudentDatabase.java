
package Lab_2a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author wangmengjun
 */
public class StudentDatabase {
    //key: student name
    //value: an array of int containing quiz marks
    private final HashMap<String, int[]> quizMarks;
    
    //constants
    public static final int NUM_QUIZZES = 10;
    public static final int MIN_GRADE = 0;
    public static final int MAX_GRADE = 100;
    
    public StudentDatabase(){
        quizMarks = new HashMap<>();
    }
    
    private String formatName(String name){
       String formatted = "";
        
       if(name != null && name.length() > 0){
           String[] parts = name.toUpperCase().split(" ");
           
           for (String part : parts) {
               formatted +=  part.substring(0, 1) + 
                       part.substring(1).toLowerCase() + " ";
           }
       }
       
       return formatted.trim();
    }
    
    public void addStudent(String studentName){
        int[] marks = new int[NUM_QUIZZES];
        
        for(int i = 0; i < NUM_QUIZZES; i++){
            marks[i] = MIN_GRADE;
        }
        
        quizMarks.put(formatName(studentName), marks);
        
    }
    
    public int[] getQuizzes(String student){
        student = formatName(student);
        return quizMarks.get(student);
    }
    
    public void changeQuizMark(String studentName, int whichQuiz, int newMark){
        
        studentName = formatName(studentName);
        
        if(quizMarks.containsKey(studentName)){
            if(whichQuiz <= NUM_QUIZZES && whichQuiz >= 1){
                if(newMark >= MIN_GRADE && newMark <= MAX_GRADE){
                    quizMarks.get(studentName)[whichQuiz] = newMark;
                }
                else{
                    System.out.println(newMark + " is not a valid mark.");
                }
            }
            else{
                System.out.println(whichQuiz + " quiz not exist");
            }
        }
        else{
            System.out.println("student not exist!");
        }
    }
    
    public void showQuizMarks(){
        Map.Entry<String, int[]> pair;
        
        Iterator it = quizMarks.entrySet().iterator();
        
        while(it.hasNext()){
            pair = (Map.Entry<String, int[]>)it.next();
            System.out.println("Quiz marks for: " + pair.getKey());
            
            for(int m:pair.getValue()){
                System.out.print(m + " ");
            }
            System.out.println("");
        } 
    }
}
