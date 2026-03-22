public class Student {
    String firstName;
    String lastName;
    int studentIDNumber;
    double averageScore;

    public Student(String firstName, String lastName, int studentIDNumber, double averageScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentIDNumber = studentIDNumber;
        this.averageScore = averageScore;
    }

    public double getAverageScore() {
        return averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentIDNumber=" + studentIDNumber +
                ", averageScore=" + averageScore +
                '}';
    }
}
