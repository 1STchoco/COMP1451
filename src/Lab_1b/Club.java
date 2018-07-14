package Lab_1b;

import java.util.Arrays;

/**
 * Class Club maintains a Array of Member
 *
 * @author wangmengjun
 * @version 1.0
 */
public class Club {

    private static final int CLUB_SIZE = 10;
    private final Member[] members;
    private int count;

    /**
     * default constructor
     */
    public Club() {
        members = new Member[CLUB_SIZE];
        count = 0;
    }

    /**
     * add a member to the club, if full, print warning
     *
     * @param member to be added
     */
    public void join(Member member) {
        if(member != null){
            if (count < CLUB_SIZE) {
                for (int i = 0; i < CLUB_SIZE; i++) {
                    if (members[i] == null) {
                        members[i] = member;
                        count++;
                        break;
                    }
                }
            } else {
                System.out.println("Club is full!");
            }
        }
        else{
            System.out.println("null member");
        }
    }

    /**
     * find the # of members in the club
     *
     * @return
     */
    public int numberOfMembers() {
        return this.count;
    }

    /**
     * display details of all members in the club
     */
    public void showMembers() {
        System.out.println("--------Display All Members----");
        Arrays.stream(members)
                .filter(m -> m != null)
                .forEach(m -> {
                    System.out.println(m.toString());
                });
        System.out.println("------------    END   ---------");
    }

    /**
     * displays the details of only those members who joined in the specified year
     *
     * @param year
     */
    public void showMemberByYear(int year) {
        if(year >= Member.FIRST_MONTH && year <= Member.LAST_MONTH)
        {
            System.out.println("-----Display Members of " + year + "----");
            Arrays.stream(members)
                    .filter(m -> (m != null && m.getYear() == year))
                    .forEach(m -> {
                        System.out.println(m.toString());
                    });
            System.out.println("------------    END   ---------");
        }
        else{
            System.out.println("not valid year");
        }
    }

    /**
     * remove all member joined in the specified year
     *
     * @param year year
     */
    public void removeMemberByYear(int year) {
        if (year >= Member.FIRST_MONTH && year <= Member.LAST_MONTH) {
                if (count > 0) {
                    int numberOfRemoved = 0;
                    for (int i = 0; i < CLUB_SIZE; i++) {
                        if (members[i] != null && members[i].getYear() == year) {
                            members[i] = null;
                            count--;
                            numberOfRemoved++;
                        }
                    }
                    System.out.println(numberOfRemoved + " members removed!");
                } else {
                    System.out.println("Empty club");
            }
        }
        else{
            System.out.println("Not valid year");
        }
    }//end of remove
}
