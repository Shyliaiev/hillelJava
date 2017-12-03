import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        NumberSum();
        IsInRectangle();
    }

    public static void NumberSum() {
        String value;
        int number, res=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number.");
        value=input.nextLine();
        number = value.length();
        for (int i=0; i<number; i++) {
            res=res+ (int) value.charAt(i)-48;          //Это магия)))) Связана с нумерацией символов
        }
        System.out.println("You've inputted "+value+". Sum of its digits is "+res);
    }

    public static void IsInRectangle() {
        double x1, y1, x2, y2, x, y;
        System.out.println("Enter X coordinate of upper left corner");
        x1 = DoubleInput();
        System.out.println("Enter Y coordinate of upper left corner");
        y1 = DoubleInput();
        System.out.println("Enter X coordinate of lower right corner");
        x2 = DoubleInput();
        System.out.println("Enter Y coordinate of lower right corner");
        y2 = DoubleInput();
        System.out.println("Enter X coordinate of arbitrary point.");
        x = DoubleInput();
        System.out.println("Enter Y coordinate of arbitrary point.");
        y = DoubleInput();
        if (x >= x1 & x <= x2 & y <= y1 & y >= y2) {
            System.out.println("Your point " + "(" + x + "; " + y + ") belongs to previously entered rectangle.");
        } else {
            System.out.println("Your point " + "(" + x + "; " + y + ") is out of rectangle");
        }
    }

    public static double DoubleInput() {
        double value;
        Scanner input = new Scanner(System.in);
        try {
            value = input.nextDouble();
        } catch (Exception e) {
            System.out.println("Please, enter number in correct form, using comma separator.");
            return DoubleInput();
        }
        return value;
    }
}
