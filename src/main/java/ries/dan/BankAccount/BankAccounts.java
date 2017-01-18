package ries.dan.BankAccount;

import java.util.ArrayList;

/**
 * Created by danries on 1/17/17.
 */
public class BankAccounts {

    protected static int accountNumber = 0;
    protected double accountBalance ;
    protected String accountHolderName;
    protected double intRate = 0;
    protected String status = "";
    protected String overdraftProtection;



    protected void newBankAccount(String accountType, String HolderName, double intRate, String type, String status){

        setAccountNumber();
        this.accountBalance = 0;
        setAccountHolderName(HolderName);
        setInterestRate(intRate);
        setStatus(status);
        setOverdraftProtection(type);
        this.accountBalance = 0;

    }

    protected void setAccountNumber(){
        accountNumber += 1;
        this.accountNumber = accountNumber;
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

    protected static double setInterestRate(double intRate){
        return intRate;
    }


    protected void setOverdraftProtection(String type){
        if (!type.equals("Enabled")||!type.equals("Disabled")||!type.equals("Automatic Transfer")){
            System.out.print("Error: Wrong Overdraft Protection Type");
        }
        else {
             this.overdraftProtection = type;
        }
    }

    public String getOverdraftProtection(String accountHolderName) {
        return overdraftProtection;
    }

    public String getOverdraftProtection() {
        return overdraftProtection;
    }


    protected ArrayList transactionRecord = new ArrayList();

    public static int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getIntRate() {
        return intRate;
    }

    public void setIntRate(double intRate) {
        this.intRate = intRate;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus() {
        return status;
    }






}
