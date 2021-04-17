public class CreditcardAccount extends BankAccount {
    protected int creditLimit;

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
