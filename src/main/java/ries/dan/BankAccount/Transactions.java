package ries.dan.BankAccount;

/**
 * Created by danries on 1/17/17.
 */
public class Transactions extends BankAccounts {

    protected void transactionList() {


    }

    protected void withdraw(double amount, String accountHolder) {
        if (getAccountHolderName().equals(accountHolder) && getAccountBalance() > 0) {
            this.accountBalance -= amount;
            setAccountBalance(accountBalance);
        } else {
            System.out.println("Denied");
        }
    }

    protected void deposit(double amount, String accountHolder) {
        if (getAccountHolderName().equals(accountHolder)) {
            this.accountBalance += amount;
            setAccountBalance(accountBalance);
        }
    }

    protected void transfer(double amount, String accountHolder, int accountFrom, int accountTo) {
        if (this.getAccountHolderName().equals(accountHolder)) {
            if ((this.getAccountBalance() - amount) > 0) {
                this.setAccountBalance(getAccountBalance() - amount);
                this.setAccountBalance(getAccountBalance() + amount);
                System.out.println("Approved");
            }
        } else {
            System.out.println("Denied");
        }
    }

    protected void debit(double amount, String accountHolder) {
        if (getAccountHolderName().equals(accountHolder)) {
            if ((this.getAccountBalance() - amount) > 0 || this.getOverdraftProtection().equals("Enabled")) {
                this.setAccountBalance(this.getAccountBalance() - amount);
            }
            else if ((this.getAccountBalance() - amount) < 0 && this.getOverdraftProtection(accountHolder).equals("Automatic Transfer")) {
                this.setAccountBalance(getAccountBalance() - amount);
                transfer(-(this.getAccountBalance()), accountHolder, this.getAccountNumber(), this.getAccountNumber());
            }
            else if ((this.getAccountBalance() - amount) < 0 && this.getOverdraftProtection().equals("Disabled")) {
                this.setAccountBalance(getAccountBalance() - amount);
            }


        }
    }


    protected void credit(double amount, String accountHolder){
        if (getAccountHolderName().equals(accountHolder)){
            if ((this.getAccountBalance() - amount) > 0){
                this.setAccountBalance(this.getAccountBalance() - amount);
            }
            else {
                System.out.println("Denied");
            }
        }
    }
}