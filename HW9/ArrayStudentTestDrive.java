import java.util.ArrayList;
import java.util.Comparator;

class ArrayStudentTestDrive {
    public static void main(String[] args) {
        SomeStudent one = new SomeStudent(1, "Ivanov");
        SomeStudent two = new SomeStudent(2, "Sidorov");
        SomeStudent three = new SomeStudent(3, "Petrov");
        SomeStudent four = new SomeStudent(4, "Semenov");
        ArrayList<SomeStudent> students = new ArrayList<>(4);

        System.out.println(students);
        System.out.println("Unsorted");
        students.add(two);
        students.add(one);
        students.add(three);
        students.add(four);
        System.out.println(students);

        System.out.println("Sorted by Id");
        students.sort(Comparator.comparing(SomeStudent::getId));
        System.out.println(students);

        System.out.println("Sorted by Name");
        students.sort(Comparator.comparing(SomeStudent::getName));
        System.out.println(students);

//        First attempt
//        students.sort(new IdComparator());
//        students.sort(new NameComparator());
    }
}