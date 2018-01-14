import java.util.ArrayList;
import java.util.Comparator;

public class ArrayStudentTestDrive {
    public static void main(String[] args) {
        ArrayList<SomeStudent> students = new ArrayList<>(0);
        SomeStudent ivanov = new SomeStudent("Valeriy","Ivanov");
        SomeStudent petrov = new SomeStudent("Kozma", "Petrov");
        SomeStudent sidorov = new SomeStudent("Roman", "Sidorov");
        students.add(sidorov);
        students.add(petrov);
        students.add(ivanov);

    }
}
