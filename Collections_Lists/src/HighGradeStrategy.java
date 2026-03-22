public class HighGradeStrategy implements StudentFilterStrategy {
    public boolean matchesStudents(Student s) {
        return s.getAverageScore() >= 95 && s.getAverageScore() <= 100;
    }
}
