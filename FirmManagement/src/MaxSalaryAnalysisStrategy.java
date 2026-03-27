import java.util.Iterator;

public class MaxSalaryAnalysisStrategy implements FirmAnalysisStrategy<Employee> {
    @Override
    public Employee execute(Firm firm) {
        Employee theRichestEmployee = firm.getDirector();
        int salary = firm.getDirector().getSalary();
        Iterator i = firm.getDepartments().iterator();
        while (i.hasNext()) {
            Department department = (Department) i.next();
            for(Employee e : department.getEmployees()) {
                if (salary < e.getSalary()) {
                    theRichestEmployee = e;
                    salary = e.getSalary();
                }
            }
        }
        return theRichestEmployee;
    }
}
