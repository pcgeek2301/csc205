/*
CSC 205: <Class #37533> <Meeting days: Monday 5:00pm - 8:30pm>
Program: <Program #2>
Author: <Katy Hochstetler> <36473082>
Description: <In this program 2, I have created 4 classes. In the bank account abstract class I have several methods including a 
default constructor that sets the account number, interest rate, and balance. I have methods for updating the accounts balance, a 
method to get the balance, get/set the account number, get/set interest rate, and 2 abstract methods.>
*/
public abstract class BankAccount {
    protected String accountNumber; 
    protected double interestRate;
    protected int balance; 

    public BankAccount() {
        this.accountNumber = "0000-0000-0000-0000";
        this.interestRate = 0; 
        this.balance = 0;
    }

    public boolean credit(int amount) {
        this.balance += amount; 
        return true;
    }

    public boolean debit(int amount) {
        this.balance -= amount;

        if (balance < 0) {
            return false;
        }

        return true;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public abstract void applyInterest();

    public abstract String getAccountInfo();
}
