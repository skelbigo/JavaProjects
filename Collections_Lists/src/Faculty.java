import java.util.ArrayList;
import java.util.List;

public class Faculty {
    String nameFaculty;
    List<Student> students;

    public Faculty(String nameFaculty, List<Student> students) {
        this.nameFaculty = nameFaculty;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }
}
