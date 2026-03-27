import java.util.ArrayList;

public class FullStaffListStrategy implements FirmAnalysisStrategy{
    @Override
    public ArrayList<Employee> execute(Firm firm) {
        ArrayList<Employee> allEmployee = new ArrayList<>();
        allEmployee.add(firm.getDirector());
        for (Department department : firm.getDepartments()) {
            allEmployee.add(department.getDepartmentHead());
            allEmployee.addAll(department.getEmployees());
        }
        return allEmployee;
    }
}
