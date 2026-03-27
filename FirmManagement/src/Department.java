import java.util.ArrayList;

public class Department {
    private String departmentName;
    private Employee departmentHead;
    private ArrayList<Employee> employees;

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setDepartmentHead(Employee departmentHead) {
        this.departmentHead = departmentHead;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) throws ManagerSalaryViolationException {
        if (departmentHead == null) throw new NullPointerException("Department head is NOT SET!");

        if (employee.getSalary() > departmentHead.getSalary()) {
            throw new ManagerSalaryViolationException();
        }

        this.employees.add(employee);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public Employee getDepartmentHead() {
        return departmentHead;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
