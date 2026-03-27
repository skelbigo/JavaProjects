import java.util.Iterator;

public class SalaryViolationAnalysisStrategy implements FirmAnalysisStrategy<Department>{
    @Override
    public Department execute(Firm firm) {
        Iterator<Department> i = firm.getDepartments().iterator();
        while (i.hasNext()) {
            Department department = i.next();
            for(Employee e : department.getEmployees()) {
                if (e.getSalary() > department.getDepartmentHead().getSalary()) {
                    return department;
                }
            }
        }
        return null;
    }
}
