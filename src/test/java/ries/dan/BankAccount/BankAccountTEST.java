package ries.dan.BankAccount;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by danries on 1/17/17.
 */
public class BankAccountTEST {


    @Test
    public void setAccountNumberTEST(){
        int actual = BankAccounts.setAccountNumber();
        int expected = 1;
        assertEquals("We expect to get 1", expected,actual);
    }

}
