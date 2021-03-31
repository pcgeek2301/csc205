package Program_1;
/*
CSC 205: <Class #37533> <Meeting days: Monday 5:00pm - 8:30pm>
Program: <Program #1>
Author: <Katy Hochstetler> <36473082>
Description: <In this program I have created 5 java files. The software engineer extends the employee
abstract class. The software engineer has a parameterized constructor and defines the give raise method.
*/

public class SoftwareEngineer extends Employee {

    // parameterized constructor 
    public SoftwareEngineer(String employeeName, double employeeSalary) {
        this.name = employeeName;
        this.salary = employeeSalary;
        this.cash = 0;
    }

    // gives a raise based off their salary and percentage given from user
    public void giveRaise(double percentage) {
        double raise = salary * (.01 * percentage); // turns the user input into a percentage 

        salary += raise;
    }
}
