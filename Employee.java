public abstract class Employee {
    protected String name;
    protected double salary;
    protected double cash;

    public String getName() {
        return this.name;
    }

    public double getCash() {
        return this.cash;
    }

    public void getPaid() {
        double paycheck = salary / 26; // employees are paid bi-weekly (Each year has 26 bi-weekly)

        cash += paycheck;
    }

    public abstract void giveRaise(double percentage);
}
