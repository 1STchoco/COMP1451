package Lab_4a;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


class BankAccountTest{

    public BankAccountTest(){}
    
    @Before
    public void setUp(){
        
    }
    
    @Test
    public void test1(){
        
    }
    
     /**
     * test constructor with 2 parameter
     */
    @Test
    public void testConstructor_2(){
        BankAccount bank = new BankAccount("Ivan", -1);
        assertEquals(0, bank.getBalance(), 0.0);
    }

    /**
     * Test of deposit method, of class BankAccount.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        BankAccount bank = new BankAccount("Ivan", 400);
        
        bank.deposit(400);
        assertEquals(800, bank.getBalance(), 0.0);
        
        bank.deposit(-1);
        assertEquals(800, bank.getBalance(), 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

}