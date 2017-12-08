import java.util.Scanner;
import java.lang.*;

//двумерный массив, нулевой индекс - номер группы, первый - фамилия, 2-51 - оценки, 52-101 - посещение
//по умолчанию, студента не было ни на одном занятии, оценок не получал.
//по умолчанию 50 занятий. можно написать функцию, чтобы изменять заданное количество.

public class Students {
    public static void main(String[] args) {
        int number;
        String[][] Group;
        Group = new String [0][101];
        while (true){
            System.out.print("What do you want to do:\n 1. Add new student.\n 2. Remove student." +
                    "\n 3. Exit \n~");
            number=intInput();
            switch (number) {
                case 1:
                    System.out.println("You have "+Group.length+" students in "+numberOfGroups(Group)+" groups.");
                    Group = newStudent(Group);
                    System.out.println("Operation successful.");
                    break;
                case 2:
                    System.out.print("You have "+Group.length+" group(s). To which one do you want to add student?\n~ ");
                    //Group = removeStudent(Group);
                    System.out.println("Operation successful.");
                    break;
                case 3:
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

    private static String[][] newStudent(String data[][]) {
        int number;

        while (true) {
            String[][] temp = new String[data.length + 1][101];
            for (int i = 0; i < data.length; i++) {
                System.arraycopy(data[i], 0, temp[i], 0, 101);
            }
            data=temp;
            System.out.print("Please, input the number of group.\n ~");
            data[data.length - 1][1] = stringInput();
            System.out.print("Please, input the surname of student.\n ~");
            data[data.length - 1][2] = stringInput();
            for (int i = 2; i <= 51; i++) {
                System.out.print("Do you want to add student's mark, y/n?\n ~");
                if (stringInput().equals("y")) {
                    System.out.print("Please type a number of lesson (1-50)\n ~");
                    number = intInput();
                    System.out.print("Please, type a mark.\n ~");
                    data[data.length - 1][1 + number] = stringInput();
                } else {
                    break;
                }
            }
            for (int i = 52; i <= 101; i++) {
                System.out.print("Do you want to add student's visits, y/n?\n ~");
                if (stringInput().equals("y")) {
                    System.out.print("Please type a number of lesson (1-50)\n ~");
                    number = intInput();
                    System.out.print("Please, type if he was present.\n ~");
                    data[data.length - 1][51 + number] = stringInput();
                } else {
                    break;
                }
            }
            System.out.print("Would you like to add another student, y/n?\n ~");
            if (stringInput().equals("n")){
                break;
            }
        }
        return data;
    }

    private static int numberOfGroups(String data[][]) {
        int quantity=0;
        for (int i =1;i<data.length+1;i++){
            for (String[] j : data) {
                if (j[1].equals(Integer.toString(i))) {
                    quantity++;
                    break;
                }
            }
        }
        return quantity;
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

    private static String stringInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}