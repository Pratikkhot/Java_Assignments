import java.util.Scanner;

// Base class Employee
class Employee {
    protected String name;
    protected double earnings;

    public Employee(String name) {
        this.name = name;
    }

    public double getEarnings() {
        return earnings;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Earnings: $" + earnings);
    }
}

// Salaried Employee
class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String name, double weeklySalary) {
        super(name);
        this.weeklySalary = weeklySalary;
        calculateEarnings();
    }

    private void calculateEarnings() {
        earnings = weeklySalary;
    }
}

// Hourly Employee
class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        calculateEarnings();
    }

    private void calculateEarnings() {
        if (hoursWorked <= 40) {
            earnings = hourlyRate * hoursWorked;
        } else {
            earnings = (hourlyRate * 40) + (hourlyRate * 1.5 * (hoursWorked - 40));
        }
    }
}

// Commission Employee
class CommissionEmployee extends Employee {
    protected double sales;
    protected double commissionRate;

    public CommissionEmployee(String name, double sales, double commissionRate) {
        super(name);
        this.sales = sales;
        this.commissionRate = commissionRate;
        calculateEarnings();
    }

    private void calculateEarnings() {
        earnings = sales * commissionRate;
    }
}

// Base-Salaried Commission Employee
class BaseSalariedCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BaseSalariedCommissionEmployee(String name, double sales, double commissionRate, double baseSalary) {
        super(name, sales, commissionRate);
        this.baseSalary = baseSalary;
        calculateEarnings();
    }

    protected void calculateEarnings() {
        earnings = baseSalary + (sales * commissionRate);
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        Employee[] employees = new Employee[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Type\n 1-Salaried \n 2-Hourly \n 3-Commission \n 4-Base-Salaried Commission ");
            int type = scanner.nextInt();

            switch (type) {
                case 1:
                    System.out.print("Weekly Salary: ");
                    double weeklySalary = scanner.nextDouble();
                    employees[i] = new SalariedEmployee(name, weeklySalary);
                    break;
                case 2:
                    System.out.print("Hourly Rate: ");
                    double hourlyRate = scanner.nextDouble();
                    System.out.print("Hours Worked: ");
                    double hoursWorked = scanner.nextDouble();
                    employees[i] = new HourlyEmployee(name, hourlyRate, hoursWorked);
                    break;
                case 3:
                    System.out.print("Sales: ");
                    double sales = scanner.nextDouble();
                    System.out.print("Commission Rate: ");
                    double commissionRate = scanner.nextDouble();
                    employees[i] = new CommissionEmployee(name, sales, commissionRate);
                    break;
                case 4:
                    System.out.print("Base Salary: ");
                    double baseSalary = scanner.nextDouble();
                    System.out.print("Sales: ");
                    double baseSales = scanner.nextDouble();
                    System.out.print("Commission Rate: ");
                    double baseCommissionRate = scanner.nextDouble();
                    employees[i] = new BaseSalariedCommissionEmployee(name, baseSales, baseCommissionRate, baseSalary);
                    break;
                default:
                    System.out.println("Invalid employee type.");
            }
        }

        System.out.println("\nEmployee Details:");
        double totalEarnings = 0;

        for (Employee employee : employees) {
            if (employee instanceof BaseSalariedCommissionEmployee) {
                BaseSalariedCommissionEmployee baseSalariedCommissionEmployee = (BaseSalariedCommissionEmployee) employee;
                System.out.println("\nBase-Salaried Commission Employee Details:");
                baseSalariedCommissionEmployee.printDetails();
                System.out.println("Base Salary Increase: 10%");
                double baseSalaryIncrease = baseSalariedCommissionEmployee.getBaseSalary() * 0.10;
                System.out.println("Base Salary Increased Amount: $" + baseSalaryIncrease);
                totalEarnings += (employee.getEarnings() + baseSalaryIncrease);
            } else {
                employee.printDetails();
                totalEarnings += employee.getEarnings();
            }
        }

        System.out.println("\nTotal Earnings for all employees: $" + totalEarnings);
    }
}
