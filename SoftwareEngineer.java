public class SoftwareEngineer extends Employee {

    public SoftwareEngineer(String employeeName, double employeeSalary) {
        this.name = employeeName;
        this.salary = employeeSalary;
        this.cash = 0;
    }

    public void giveRaise(double percentage) {
        double raise = salary * (.01 * percentage);

        salary += raise;
    }
}
