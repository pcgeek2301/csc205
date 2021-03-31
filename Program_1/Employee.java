package Program_1;
/*
CSC 205: <Class #37533> <Meeting days: Monday 5:00pm - 8:30pm>
Program: <Program #1>
Author: <Katy Hochstetler> <36473082>
Description: <In this program I have created 5 java files. The abstract employee class includes the basics for every
employee. A method to get the name of the employee, a method to get the amount of cash the employee has, and to pay the employee
*/

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
