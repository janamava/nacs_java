package evaluations.week7;


public class BankApplication {

    public static void main(String[] args) {

        Bank bank = new Bank();
        TotalSalaryCalculator calculator = new TotalSalaryCalculator();
        DepartmentCalculator department = new DepartmentCalculator();
        SalaryCalculator salary = new SalaryCalculator();

        bank.transfer();
        calculator.calculateTotalSalaries();
        department.calculateDepartment();
        salary.calculateHighestSalary();
    }
}
