import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class InstituteService {
    public static int countTotalStudents(Institute institute) {
        int totalStudents = 0;
        Iterator i = institute.faculties.iterator();
        while (i.hasNext()) {
            Faculty faculty = (Faculty) i.next();
            totalStudents += faculty.getStudents().size();
        }
        return totalStudents;
    }

    public static String findBiggestFaculty(Institute institute) {
        int countLargestFaculty = 0;
        String theLargestFaculty = "kz";
        Iterator<Faculty> i = institute.faculties.iterator();

        while (i.hasNext()) {
            Faculty faculty = i.next();
            if (countLargestFaculty < faculty.getStudents().size()) {
                countLargestFaculty = faculty.getStudents().size();
                theLargestFaculty = faculty.getNameFaculty();
            }
        }
        return theLargestFaculty;
    }

    public static List<Student> filterStudents(Institute institute, StudentFilterStrategy studentFilter) {
        List<Student> honorStudents = new ArrayList<>();
        for (Faculty f : institute.getFaculties()) {
            for (Student s : f.getStudents()) {
                if (studentFilter.matchesStudents(s)) {
                    honorStudents.add(s);
                }
            }
        }
        return honorStudents;
    }
}
