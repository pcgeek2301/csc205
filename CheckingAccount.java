/*
CSC 205: <Class #37533> <Meeting days: Monday 5:00pm - 8:30pm>
Program: <Program #2>
Author: <Katy Hochstetler> <36473082>
Description: <>
*/
public class CheckingAccount extends BankAccount{
    protected int overdraftFee;

    public boolean debit(int amount) {
        balance -= amount;

        if (balance < 0) {
            balance -= overdraftFee;
        }

        return true;
    }

    public int getOverdraftFee() {
        return this.overdraftFee;
    }

    public void setOverdraftFee(int overdraftFee) {
        this.overdraftFee = overdraftFee;
    }
    
    public void applyInterest() {
        double interestAmount;
        if (balance > 0) {
            interestAmount = interestRate * balance;
            balance += interestAmount;
        }
        
    }

    public String getAccountInfo() {
        return "Account type\t: Checking\nAccount #\t: " + this.accountNumber 
        + "\nBalance\t\t: $" + String.format("%.2f", ((double)this.balance / 100)) 
        + "\nInterest rate\t: " + String.format("%.2f", (this.interestRate * 100)) + "%\n" 
        + "Overdraft fee\t: $"  + String.format("%.2f", (double)this.overdraftFee / 100);
    }
    
}
