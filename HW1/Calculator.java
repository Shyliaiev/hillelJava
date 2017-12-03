import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        Double a = input.nextDouble();
        System.out.println("You inputted " +a);
        System.out.println("Enter the second number:");
        Double b = input.nextDouble();
        System.out.println("You inputted " + b);
        System.out.println("Your sum is " + (a+b));
        System.out.println("Your difference is " + (a-b));
        System.out.println("Your multiplication is " + (a*b));
        System.out.println("Your division is " + (a/b));
    }
}