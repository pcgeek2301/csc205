import java.util.Scanner;

public class Company {
    final int MAX = 5; // max amount of employees at a time 

    Employee[] employees = new Employee[MAX];
    AdministrativeAssistant[] hourEmployees = new AdministrativeAssistant[MAX];

    int empCount = 0;
    int hourEmpcount = 0;

    public static void main(String[] args) {
        Company theCompany = new Company();
        Scanner scnr = new Scanner(System.in);
        String userChoice;
        boolean endOfProgram = false;

        while (!endOfProgram) {
            PrintMenu();
            userChoice = scnr.nextLine();
            userChoice.toLowerCase();
            switch (userChoice) {
                case "a":
                    PromptUserForNewEmployee(theCompany, scnr);
                    break;
                case "b":
                    ListEmployees(theCompany);
                    break;
                case "c":
                    GiveRaiseToEmployee(theCompany, scnr);
                    break;
                case "d":
                    PayDay(theCompany);
                    break;
                case "e":
                    ChangeEmployeeHours(theCompany, scnr);
                    break;
                case "f":
                    System.out.println("Bye!");
                    endOfProgram = true;
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }

        scnr.close();
    }

    public static void PrintMenu() {
        System.out.println("What do you want to do?");
        System.out.println("A. Add an Employee");
        System.out.println("B. List all Employees");
        System.out.println("C. Give an Employee a Raise");
        System.out.println("D. Give Paychecks");
        System.out.println("E. Change someones hours");
        System.out.println("F. Quit");
    }

    public static void PromptUserForNewEmployee(Company comp, Scanner scnr) {

        String userInput = "";
        String name = "";
        double salary = 0;
        int hours = 0;
    
        System.out.println("What is their name?");
        name = scnr.nextLine();

        System.out.println("What is their salary (yearly or hourly)?");
        salary = Double.parseDouble(scnr.nextLine());

        System.out.println("Are they an hourly worker? (Y/N)");
        userInput = scnr.nextLine();

        userInput.toLowerCase();

        if (userInput.equals("y")) {
            System.out.println("How many hours per week do they work?");
            hours = Integer.parseInt(scnr.nextLine());
            AdministrativeAssistant newEmployee = new AdministrativeAssistant(name, salary, hours);
            AddEmployee(newEmployee, true, comp);
        } else {
            SoftwareEngineer newEmployee = new SoftwareEngineer(name, salary);
            AddEmployee(newEmployee, false, comp);
        }

        System.out.println(name + " was hired!");
    }

    public static void AddEmployee(Employee newEmployee, boolean isHourly, Company comp) {
        comp.employees[comp.empCount] = newEmployee;
        comp.empCount++;
        if (isHourly) {
            comp.hourEmployees[comp.hourEmpcount] = (AdministrativeAssistant)newEmployee;
            comp.hourEmpcount++;
        } 
    }
    
    public static void ListEmployees(Company comp) {
        if (comp.employees[0] == null) {
            System.out.println("Nobody works here!");
        } else {
            for (int i = 0; i < comp.MAX; i++) {
                if (comp.employees[i] == null) {
                    break;
                } else {
                    System.out.print(comp.employees[i].getName() + ": " + comp.employees[i].salary + " Cash: " + comp.employees[i].getCash());
                    if (comp.employees[i] instanceof Hourly) {
                        System.out.println(" Administrative Assistant");
                    } else {
                        System.out.println(" Software Engineer");
                    }
                }
            }
        }
    }

    public static void GiveRaiseToEmployee(Company comp, Scanner scnr) {
        String employeeName = "";
        double raise = 0;

        System.out.println("Who do you want to give a raise to?");
        employeeName = scnr.nextLine();

        System.out.println("What raise do you want to give them?");
        raise = Double.parseDouble(scnr.nextLine());

        for (int i = 0; i < comp.MAX; i++) {
            Employee currEmployee = comp.employees[i];
            if (currEmployee != null && employeeName.equals(currEmployee.getName())) {
                if (comp.employees[i] instanceof Hourly) {
                    for (int j = 0; j < comp.MAX; j++) {
                        if (employeeName == comp.hourEmployees[j].getName()) {
                            comp.hourEmployees[j].giveRaise(raise);
                        } 
                    }
                } else {
                    comp.employees[i].giveRaise(raise);
                }
               
            }
        }

        System.out.println(employeeName + " is happy!");
    }

    public static void PayDay(Company comp) {
        for (int i = 0; i < comp.MAX; i++) {
            if (comp.employees[i] != null) {
                comp.employees[i].getPaid();
            }
        }

        System.out.println("Hooray for money!");
    }

    public static void ChangeEmployeeHours(Company comp, Scanner scnr) {
        String employeeName = "";
        int newHours = 0;

        System.out.println("Change hours for who?");
        employeeName = scnr.nextLine();

        for (int i = 0; i < comp.MAX; i++) {
            if (comp.hourEmployees[i] != null && employeeName.equals(comp.hourEmployees[i].getName())) {
                System.out.print(employeeName + " currently works " + comp.hourEmployees[i].getHours());
                System.out.println(" per week. What would you like to change it to?");
                newHours = Integer.parseInt(scnr.nextLine());
                comp.hourEmployees[i].setHours(newHours);
                System.out.println(employeeName + "will now work " + newHours + " hours per week");
            }
        }
    }

}
