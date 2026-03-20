import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Student student1 = new Student("Осієвська", "Олександра", 19, 123456789, 2, "ФІОТ",
                "Інформаційні системи та технології", 92.5, "IA-42", true);
        Student student2 = student1.transferToNextCourse();
        System.out.println(student1);
        System.out.println(student2);
    }
}
