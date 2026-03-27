import java.util.ArrayList;

public class Firm {
    private String companyName;
    private Employee director;
    private ArrayList<Department> departments;

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setDirector(Employee director) {
        this.director = director;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public Employee getDirector() {
        return director;
    }

    public void addDepartment(Department department) throws ManagerSalaryViolationException {
        if (director == null) throw new NullPointerException();

        if (department.getDepartmentHead().getSalary() > director.getSalary()) {
            throw new ManagerSalaryViolationException();
        }

        this.departments.add(department);
    }
}
