/*
CSC 205: <Class #37533> <Meeting days: Monday 5:00pm - 8:30pm>
Program: <Program #1>
Author: <Katy Hochstetler> <36473082>
Description: <In this program I have created 5 java files. The administrative assistant extends the employee
abstract class and hourly interface. The administrative assistant has a parameterized constructor, defines the give raise method,
defines a set and get hours method, defines the change hours method, and defines the get paid method
*/

public class AdministrativeAssistant extends Employee implements Hourly {
    protected int hours;

    // parameterized constructor 
    public AdministrativeAssistant(String employeeName, double employeeSalary, int employeeHours) {
        this.name = employeeName;
        this.salary = employeeSalary;
        this.hours = employeeHours;
    } 

    public int getHours() {
        return this.hours;
    }

    public void setHours(int newHours) {
        this.hours = newHours;
    }

    public void giveRaise(double raise) {
        salary += raise;
    }

    // pays the employee based on their salary and hours
    public void getPaid()  {
        double paycheck = salary * (2 * hours);

        cash += paycheck;
    }
    
}
