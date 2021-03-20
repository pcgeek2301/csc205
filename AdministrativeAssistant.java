public class AdministrativeAssistant extends Employee implements Hourly {
    protected int hours;

    public AdministrativeAssistant(String employeeName, double employeeSalary, int employeeHours) {
        this.name = employeeName;
        this.salary = employeeSalary;
        this.hours = employeeHours;
    } 

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void giveRaise(double raise) {
       salary += raise;
    }

    public int getHours() {
        return this.hours;
    }

    public void changeHours(int newHours) {
        hours = newHours;
    }

    public void getPaid()  {
        double paycheck = salary * (2 * hours);

        cash += paycheck;
    }
    
}
