/*
CSC 205: <Class #37533> <Meeting days: Monday 5:00pm - 8:30pm>
Program: <Program #2>
Author: <Katy Hochstetler> <36473082>
Description: <>
*/
public class SavingsAccount extends BankAccount {


    public SavingsAccount() {
        super();
    }
    
    public boolean debit(int amount) {
        if (this.balance - amount < 0) {
            return false;
        } else {
            this.balance -= amount;
            return true;
        }
    }

    public void applyInterest() {
        double interestAmount;
        if (balance > 0) {
            interestAmount = interestRate * balance;
            balance += interestAmount;
        }
    }

    public String getAccountInfo() {
        return "Account type\t: Savings\nAccount #\t: " + this.accountNumber + 
                "\nBalance\t\t: $" + String.format("%.2f", ((double)this.balance / 100)) 
                + "\nInterest rate\t: " + String.format("%.2f", (this.interestRate * 100)) + "%";
    }
    
}
