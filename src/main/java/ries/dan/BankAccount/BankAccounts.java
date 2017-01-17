package ries.dan.BankAccount;

/**
 * Created by danries on 1/17/17.
 */
public class BankAccounts {

    static int accountNumber = 0;

    protected void newBankAccount(String accountType, String accountHolderName){
    }

    protected static int setAccountNumber(){
        accountNumber += 1;
        return accountNumber;
    }

    protected static String setAccountType(String accountType, String accountHolderName){
        if (!accountType.equals("Checking") ||
                !accountType.equals("Savings") || !accountType.equals("Investment")){
            System.out.println("Error: Wrong account type");
            return null;
        }
        else{
            return accountType;
        }

    }

    protected static void setInterestRate(){}

    protected static void setStatus(){}

    protected static void setOverdraftProtection(){}

}
