package Program_2;
/*
CSC 205: <Class #37533> <Meeting days: Monday 5:00pm - 8:30pm>
Program: <Program #2>
Author: <Katy Hochstetler> <36473082>
Description: <In this program 2, I have created 4 classes. In the creditcard account class that extends bank account 
I have several methods including methods for updating the accounts balance, get/set creditlimit, applying interest, and 
displaying account information.>
*/
public class CreditcardAccount extends BankAccount {
    protected int creditLimit;

    public CreditcardAccount() {
        super();
    }
    
    public boolean debit(int amount) {
        if (amount > creditLimit) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    public int getCreditLimit() {
        return this.creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void applyInterest() {
        double interestAmount;
        if (balance <= 0) {
            interestAmount = balance * interestRate;
            balance += interestAmount;
        }
        
    }

    public String getAccountInfo() {
        return "Account type\t: Creditcard\nAccount #\t: " + this.accountNumber 
        + "\nBalance\t\t: $" + String.format("%.2f", ((double)this.balance / 100)) 
        + "\nInterest rate\t: " + String.format("%.2f", (this.interestRate * 100)) + "%\n" 
        + "Credit limit\t: $"  + String.format("%.2f", (double)this.creditLimit / 100);
    }
    
}
