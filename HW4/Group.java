import java.util.Scanner;

public class Group {
    String name;
    Student[] students;

    Group() {
        name = "";
        students = new Student[0];
    }

    public Student[] addStudents() {
        Student[] temp;
        while (true) {
            temp = new Student[students.length + 1];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
            students[students.length - 1] = new Student();
            System.out.print("Please, enter the surname of new student.\n~");
//            students[students.length-1].name = StudentsApplication.stringInput(); //с этим программа плужит
            students[students.length - 1].name = stringInput();
            System.out.print("Would you like to add another student, y/n?\n~");
//            if (StudentsApplication.stringInput().equals("n")) {                  //с этим программа плужит
            if (stringInput().equals("n")) {
                break;
            }
        }
        return students;
    }

    public Student[] deleteStudents(Student data[]) {
        Student[] temp;
        String tempName;
        temp = new Student[data.length - 1];
        int j = 0;
        System.out.println("This group contains listed below students:");
        for (Student i : data) {
            System.out.println(i.name);
        }
        System.out.println("Please input, who do you want to delete.");
        tempName=stringInput();
        for (int i = 0; i < data.length; i++) {
            if (data[i].name.equals(tempName)) {
                j++;
                continue;
            }
            temp[i] = data[j];
            j++;
        }
        data=temp;
        return data;
    }

    private static String stringInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
