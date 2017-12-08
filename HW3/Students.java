import java.util.Scanner;
import java.lang.*;

//двумерный массив, нулевой индекс - номер группы, первый - фамилия, 2-51 - оценки, 52-101 - посещение
//по умолчанию, студента не было ни на одном занятии, оценок не получал.
//по умолчанию 50 занятий. можно написать функцию, чтобы изменять заданное количество.

public class Students {
    public static void main(String[] args) {
        int number;
        String[][] Group = new String [0][101];
        while (true){
            System.out.print("What do you want to do:\n 1. Add new group.\n 2. Add new student.\n 3. Remove student." +
                    "\n 4. Exit \n~");
            number=intInput();
            switch (number) {
                case 1:
                    System.out.println("You currently have " + Group.length + " group(s).");
                    Group = newGroup(Group);
                    System.out.println("Operation successful.");
                    break;
                case 2:
                    System.out.print("You have "+Group.length+" group(s). To which one do you want to add student?\n~ ");
                    //Group = newStudent(Group);
                    System.out.println("Operation successful.");
                    break;
                case 3:
                    System.out.print("You have "+Group.length+" group(s). To which one do you want to add student?\n~ ");
                    //Group = removeStudent(Group);
                    System.out.println("Operation successful.");
                    break;


                case 4:
                    System.out.println("Program stopped by user.");
                    System.exit(1);                         //выход из программы
                    break;
                default:
                    System.out.println("You've entered not listed number.");
                    System.out.println("");
                    break;
            }
        }
    }

    private static String[][] newGroup(String data[][]) {
        int number;
        System.out.println("Please, input, how many groups you want to add:");
        while (true){
            number = intInput();
            if (number<0) {
                System.out.println("Please enter positive number.");
                continue;
            }
            break;
        }

        return data;
    }

    private static int intInput() {
        int value;
        Scanner input = new Scanner(System.in);
        try {
            value = input.nextInt();
        } catch (Exception e) {
            System.out.print("Please, enter number in correct form.\n~ ");
            return intInput();
        }
        return value;
    }

    private static String stringInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}