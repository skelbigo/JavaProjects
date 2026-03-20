import java.util.Objects;

public class Student extends Person {
    private final int studentCardId;
    private final int course;
    private final String faculty;
    private final String specialty;
    private final double averageGrade;
    private final String groupName;
    private final boolean hasScholarship;

    public Student(String lastName, String firstName, int age, int studentCardId, int course, String faculty, String specialty, double averageGrade, String groupName,
                   boolean hasScholarship) {
        super(lastName, firstName, age);
        this.studentCardId = studentCardId;
        this.course = course;
        this.faculty = faculty;
        this.specialty = specialty;
        this.averageGrade = averageGrade;
        this.groupName = groupName;
        this.hasScholarship = hasScholarship;
    }

    public Student(String lastName, String firstName, int age, int studentCardId, int course, String faculty, String specialty, String groupName,
                    boolean hasScholarship) {
        this(lastName, firstName, age, studentCardId, course, faculty, specialty, 80.6, groupName, hasScholarship);
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "studentCardId=" + studentCardId +
                ", course=" + course +
                ", faculty='" + faculty + '\'' +
                ", specialty='" + specialty + '\'' +
                ", averageGrade=" + averageGrade +
                ", groupName='" + groupName + '\'' +
                ", hasScholarship=" + hasScholarship +
                '}';
    }

    public int study() {
        return 0;
    }

    public int study(int hours) {
        return hours;
    }

    public Student transferToNextCourse() {
        if (this.course == 4) {
            System.out.println("this student has already graduated");
            return new Student(
                    this.getLastName(),
                    this.getFirstName(),
                    this.getAge(),
                    this.studentCardId,
                    this.course,
                    this.faculty,
                    this.specialty,
                    this.averageGrade,
                    this.groupName,
                    this.hasScholarship
            );
        }
        return new Student(
                this.getLastName(),
                this.getFirstName(),
                this.getAge(),
                this.studentCardId,
                this.course + 1,
                this.faculty,
                this.specialty,
                this.averageGrade,
                this.groupName,
                this.hasScholarship
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass() || !super.equals(o)) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(studentCardId, student.studentCardId) && course == student.course && Objects.equals(
                faculty, student.faculty) && Objects.equals(specialty, student.specialty) &&
                Double.compare(student.averageGrade, averageGrade) == 0 && Objects.equals(groupName, student.groupName) &&
                hasScholarship == student.hasScholarship;
    }
}
