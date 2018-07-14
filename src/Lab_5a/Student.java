
package Lab_5a;

import java.util.HashMap;

/**
 *
 * @author wangmengjun
 */
public class Student extends Person{
    private HashMap<String, Double> courses;
    
    public Student(){}
    
    public Student(String fNmae, String lName, String email, String id){
        super(fNmae, lName, email, id);
        this.courses = new HashMap<>();
    }

    public HashMap<String, Double> getCourses() {
        return courses;
    }

    public void setCourses(HashMap<String, Double> courses) {
        this.courses = courses;
    }
    
    public void addCourse(String courseName, double grade){
        
        if(courseName != null && grade >= 0){
            courses.put(courseName, grade);
        }
        else{
            System.out.println("invalid data");
        }
    }
    
    public double getAverageGrade(){
        
        double result = 0;
        
        int size = courses.size();
        if(size > 0){
            for(double g:courses.values()){
                result += g;
            }
            return result/size;
        }
        return result;
    }
}
