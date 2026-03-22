import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Student student = new Student("Олександра", "Осієвська", 12345, 99.9);
        Student student1 = new Student("Олексій", "Смічик", 67890, 100);
        Student student2 = new Student("Тетяна", "Мартинюк", 13579, 92);
        Student student3 = new Student("Раман", "Валошин", 22800, 2.6);
        Student student4 = new Student("Ангеліна", "Ващенко", 66666, 60.3);
        Student student5 = new Student("Андрій", "Армлет", 88888, 83.9);
        Student student6 = new Student("Катерина", "Глеба", 11111, 87.3);

        Faculty faculty = new Faculty("ФІОТ", new ArrayList<>(Arrays.asList(student, student1, student2, student5)));
        Faculty faculty1 = new Faculty("ІПСА", new ArrayList<>(Arrays.asList(student3, student4)));
        Faculty faculty2 = new Faculty("ФММ", new ArrayList<>(Arrays.asList(student6)));

        Institute institute = new Institute("КПІ", new ArrayList<>(Arrays.asList(faculty, faculty1, faculty2)));

        InstituteService instituteService = new InstituteService();
        System.out.println("Знайти загальну кількість студентів, що навчається в інституті");
        int countStudents = instituteService.countTotalStudents(institute);
        System.out.println("Загальна кількість студентів, що навчається в інституті: " + countStudents + "\n");

        System.out.println("Знайти факультет, на якому навчається найбільша кількість студентів");
        String biggestFaculty = instituteService.findBiggestFaculty(institute);
        System.out.println("Факультет, на якому навчається найбільша кількість студентів: " + biggestFaculty + "\n");

        System.out.println("Скласти список студентів, у яких середній бал в діапазоні 95..100");
        List<Student> honorStudents = instituteService.filterStudents(institute, new HighGradeStrategy());
        System.out.println("Відмінники: " + honorStudents);
    }
}
