
package Lab_1b;

/**
 *
 * @author wangmengjun
 */
class Driver {
    public static void test(){
        Member m1 = new Member("Tre", "Yang", 8, 2009);
        Member m2 = new Member("Te", "Wang", 9, 2008);
        Member m3 = new Member("Itm", "Li", 8, 2009);
        Member m4 = new Member("Jre", "Zahn", 8, 2009);
        Member m5 = new Member("Axe", "Gee", 8, 2009);
        
        Club c = new Club();
        c.join(m1);
        c.join(m2);
        c.join(m3);
        c.join(m4);
        c.join(m5);
        
        c.showMembers();
        System.out.println("Have " + c.numberOfMembers() + " Member");
        
        c.showMemberByYear(2009);
        c.showMemberByYear(2008);
        
        c.removeMemberByYear(2008);
        c.showMembers();
        
        System.out.println("Have " + c.numberOfMembers() + " Member");
        
        c.removeMemberByYear(2009);
        System.out.println("Have " + c.numberOfMembers() + " Member");
        
        c.showMembers();


        
    }
    
    public static void main(String[] args) {
        Driver.test();
    }
}
