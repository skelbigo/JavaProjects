import java.util.ArrayList;
import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        Firm firm = initFirm("Tech solutions", "Oleksandra", "Osiievska", 10000);

        Department IT = initDep("IT Department", "Alexei", "Smichick", 5000);
        ArrayList<Department> departments = new ArrayList<>();
        departments.add(IT);
        firm.setDepartments(departments);

        Employee emp1 = initEmp("Andrii", "Armlet", 2000);
        tryAdd(IT, emp1);
        Employee richEmployee = initEmp("Roman", "Voloshyn", 99999);
        tryAdd(IT, richEmployee);
        Department emptyDep = new Department();
        Employee someEmp = initEmp("Someone", "Someone", 1000);
        tryAdd(emptyDep, someEmp);

        printAnalytics(firm);
    }

    public static Firm initFirm(String companyName, String directorFirstname, String directorLastname, int directorSalary) {
        Firm firm = new Firm();
        firm.setCompanyName(companyName);

        Employee director = new Employee();
        director.setFirstname(directorFirstname);
        director.setLastname(directorLastname);
        director.setSalary(directorSalary);
        firm.setDirector(director);
        return firm;
    }

    private static Department initDep(String departmentName, String bossFirstname, String bossLastname, int bossSalary) {
        Department IT = new Department();
        IT.setDepartmentName(departmentName);
        IT.setEmployees(new ArrayList<>());

        Employee manager = new Employee();
        manager.setFirstname(bossFirstname);
        manager.setLastname(bossLastname);
        manager.setSalary(bossSalary);
        IT.setDepartmentHead(manager);
        return IT;
    }

    private static Employee initEmp(String firstname, String lastname, int salary) {
        Employee emp = new Employee();
        emp.setFirstname(firstname);
        emp.setLastname(lastname);
        emp.setSalary(salary);
        return emp;
    }

    private static void tryAdd(Department dept, Employee emp) {
        try {
            dept.addEmployee(emp);
        } catch (ManagerSalaryViolationException e) {
            System.out.println("BUSINESS LOGIC ERROR" + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("SYSTEM ERROR: Attempt to add an employee to a department without a manager!" + e.getMessage());
        } finally {
            System.out.println("The verification of the employee's addition has been completed.");
        }
    }

    private static void printAnalytics(Firm firm) {
        System.out.println("Найбагатший працівник: " + new MaxSalaryAnalysisStrategy().execute(firm));

        Department problemDepart = new SalaryViolationAnalysisStrategy().execute(firm);
        if (problemDepart != null) {
            System.out.println("A department where an employee earns more than their boss: " + problemDepart.getDepartmentName());
        } else {
            System.out.println("There is no department where an employee earns more than the boss");
        }

        ArrayList<Employee> allStaff = new FullStaffListStrategy().execute(firm);
        System.out.println("Total number of employees at the company: " + allStaff);
    }
}
