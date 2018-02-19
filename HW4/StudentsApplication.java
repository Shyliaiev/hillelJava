import java.util.Scanner;

public class StudentsApplication {
    public static void main(String[] args) {
        Group[] group = new Group[0];
        Group[] temp;
        int number;
        while (true) {
            System.out.print("What do you want to do?\n  +1.  Add new group.\n  +2.  Add new student.\n  +3.  Delete student\n  " +
                    "+4.  Find in group.\n  +5.  Clear all data.\n  6.  Groups concatenation.\n  7.  Sort group.\n  8.  " +
                    "Look if one group is in another.\n  9.  Look if groups are equal.\n  +10. Print.\n  +11. " +
                    "Exit.\n  12. Save to file\n  13. Load from file\n~");
            number = intInput();
            switch (number) {
                case 1:
                    while (true) {
                        System.out.print("Please enter the group name.\n~");
                        temp = new Group[group.length + 1];
                        System.arraycopy(group, 0, temp, 0, group.length);
                        group = temp;
                        group[group.length - 1] = new Group();
                        group[group.length - 1].name = stringInput();
                        System.out.println("Would you like to enter another group, y/n?");
                        if (stringInput().equals("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    int groupNumberInt=0;
                    String temporary;
                    print(group);
                    System.out.print("Please, enter the name of group, to what you want to add student.\n~");
                    temporary=stringInput();
                    for (int i=0;i<group.length;i++) {
                        if (group[i].name.equals(temporary)){
                            groupNumberInt=i;
                            break;
                        }
                    }
                    group[groupNumberInt].addStudents();
                    break;
                case 3:
                    int j = 0;
                    print(group);
                    System.out.print("Please, enter the name of group, from which you want to delete student.\n~");
                    temporary=stringInput();
                    for (Group i : group) {
                        if (i.name.equals(temporary)) {
                            group[j].students = group[j].deleteStudents(group[j].students);
                            break;
                        }
                        j++;
                    }
                    break;
                case 4:
                    print(group);
                    String groupNumber;
                    String surname;
                    boolean existence = false;
                    System.out.print("Please, enter the name of group, where you want to look out.\n~");
                    groupNumber = stringInput();
                    System.out.print("Please, enter the surname of student, you are looking for.\n~");
                    surname = stringInput();
                    for (Group i : group) {
                        if (i.name.equals(groupNumber)) {
                            for (Student k : i.students) {
                                if (k.name.equals(surname)){
                                    existence = true;
                                }
                            }
                        }
                    }
                    if (existence) {
                        System.out.println("Student " + surname + " is in group " + groupNumber);
                    } else {
                        System.out.println("There are no " + surname + " in group " + groupNumber);
                    }
                    break;
                case 5:
                    group = new Group[0];
                    System.out.println("Operation successful");
                    break;
                case 6:
                    System.out.println("Functionality is temporarily unavailable.");
                    break;
                case 7:
                    System.out.println("Functionality is temporarily unavailable.");
                    break;
                case 8:
                    System.out.println("Functionality is temporarily unavailable.");
                    break;
                case 9:
                    System.out.println("Functionality is temporarily unavailable.");
                    break;
                case 10:
                    print(group);
                    break;
                case 11:
                    System.out.println("Program stopped by user.");
                    System.exit(1);                         //выход из программы
                    break;
                case 12:
                    new Save().Save(group);
                    System.out.println("Saved successfully.");
                    break;
                default:
                    System.out.println("You've entered not listed number.");
                    System.out.println("");
                    break;
            }
        }
    }

    private static String stringInput() {       //менял private на public, чтобы стучаться из класса Group. Программа плужила.
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private static int intInput() {
        int value;
        Scanner input = new Scanner(System.in);
        try {
            value = input.nextInt();
        } catch (Exception e) {
            System.out.print("Please, enter number in correct form.\n ~");
            return intInput();
        }
        return value;
    }

    private static void print(Group data[]) {
        System.out.println("There are " + data.length + " groups:");
        for (Group i : data) {
            System.out.println(i.name);
            for (Student j:i.students) {
                System.out.println("  "+j.name);
            }
        }
    }
}
