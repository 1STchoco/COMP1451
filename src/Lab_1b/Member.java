
package Lab_1b;

/**
 * Class Member describes the detail of a club member
 * @author wangmengjun
 */
public class Member {
    private String firstName;
    private String lastName;
    private int month;
    private int year;
    
    //cosntants
    public static final int FIRST_MONTH = 1;
    public static final int LAST_MONTH = 12;
    private static final int CURRENT_YEAR = 2018;
    private static final String DEFAULT_NAME = "unkown";
    
    /**
     * default constructor maintain default value.
     */
    public Member(){}
    
    public Member(String firstName, String lastName, int month, int year){
        setFirstName(firstName);
        setLastName(lastName);
        setMonth(month);
        setYear(year);
    }
    
    /**
     * set first name, if null, set to default
     * @param fname first name
     */
    public final void setFirstName(String fname){
        if(fname != null){
            this.firstName = fname;
        }
        else{
            this.firstName = DEFAULT_NAME;
        }
    }
    
    /**
     * set last name, if null, set to default     
     * @param lname last name
     */
    public final void setLastName(String lname){
        if(lname != null){
            this.lastName = lname;
        }
        else{
            this.lastName = DEFAULT_NAME;
        }
    }
    
    /**
     * set the month, if input not between 1 and 12,set month to 1
     * @param month month of join club
     */
    public final void setMonth(int month){
        if(month >= FIRST_MONTH && month <= LAST_MONTH){
            this.month = month;
        }
        else{
            this.month = FIRST_MONTH;
        }
    }
    
    /**
     * set the year, if input not between 0 and current year, set month
     * to current year.
     * @param year year of join club
     */
    public final void setYear(int year){
        if(year >= 0 && year <= CURRENT_YEAR){
            this.year = year;
        }
        else{
            this.year = CURRENT_YEAR;
        }
    }
    
    /**
     * get first name
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * get last name
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * get month
     * @return month
     */
    public int getMonth() {
        return month;
    }

    /**
     * get year
     * @return year
     */
    public int getYear() {
        return year;
    }
    
    /**
     * override toString
     * @return the detail of the member, including: name, month, year
     */
    @Override
    public String toString(){
        
        return "Name: " + firstName + " " + lastName + 
                ", Month of join: " + month +
                ", Year of join: " + year;
    }
}
