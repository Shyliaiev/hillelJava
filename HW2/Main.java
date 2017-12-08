import java.math.BigDecimal;                            //Подгружаем функцию БигДецимал
import java.util.Scanner;                               //Подгружаем функцию чтения из командной строки

public class Main {

    public static void main(String[] args) {            //Раскомментировать ту функцию, которую хотим вызвать
        Calculator();                                 //Калькулятор
//        Average();                                    //Среднее из двух чисел
//        Bank();                                       //Вычисление сложного процента
//        Rectangle();                                  //Построение прямоугольника
//        AverageFew();                                 //Среднее арифметическое нескольких чисел
//        Envelope();                                     //Рисуем конверт
//        Even();                                       //Определяем четное или нет
//        Prime();                                      //Определяем простое ли число
//        Multiple();                                   //Находим кратные
//        Chess();                                      //Рисуем шахматку
    }

    public static void Average() {                      //Вызов функции
        double a, b;                                    //Объявляем переменные a, b типа дабл
        System.out.println("Please, enter first number:");  //Запрос на ввод номера
        a = DoubleInput();                              //Вызываем метод чтения дабл из строки
        System.out.println("Please, enter second number:");
        b = DoubleInput();
        System.out.println("The average of your numbers is " + (a+b)/2);
    }

    public static void AverageFew() {
        double a=0;
        int i=0;
        while (true){
            System.out.println("Please,enter number");
            a=a+DoubleInput();
            i++;
            System.out.println("Would you like to continue, y to continue, everything else to result.");
            if (!yesno()) {
                break;
            }
        }
        System.out.println("You've entered "+i+" numbers, with average value of " + (a/i));
    }

    public static void Bank() {
        BigDecimal deposit;
        BigDecimal percent;
        BigDecimal income;
        int years;
        System.out.println("Please enter your initial deposit");
        deposit = BigDecimalInput();
        System.out.println("Please enter your deposit interest");
        percent = BigDecimalInput();
        System.out.println("Please, enter number of years");
        while (true) {
            years=IntInput();
            if (years<0) {
                System.out.println("Please, enter the nonzero number of years.");
                years = IntInput();
            }
            break;
        }
        System.out.println("Here we show your money including capitalization");
        percent=percent.divide(new BigDecimal(100)).setScale(4,BigDecimal.ROUND_HALF_UP);
        for (int i = 1; i<=years; i++) {
            income= deposit.multiply(percent).setScale(2,BigDecimal.ROUND_HALF_UP);
            deposit=deposit.add(income).setScale(2,BigDecimal.ROUND_HALF_UP);
            System.out.println("Year number " + i);
            System.out.println("Your income is "+income);
            System.out.println("Your deposit amount is "+deposit);
        }
    }

    public static void Calculator() {
        double a, b;
        String Todo;
        System.out.println("Please, enter first number:");
        a = DoubleInput();
        System.out.println("Please, enter what do math operation (+ - * /):");
        Todo = OperationInput();
        System.out.println("Please, enter second number: ");
        b = DoubleInput();
        switch (Todo) {
            case "+":
                System.out.println("Your sum is " + (a+b));
                break;
            case "-":
                System.out.println("Your difference is " + (a-b));
                break;
            case "*":
                System.out.println("Your multiplication is " + (a*b));
                break;
            case "/":
                if (b==0){
                    System.out.println("It's bad idea to divide by zero");
                } else {
                    System.out.println("Your division is " + (a/b));
                }
                break;
        }
    }

    public static void Chess() {
        int width, height;
        System.out.println("Please, input width of rectangle");
        width=IntInput();
        System.out.println("Please, input height of rectangle");
        height=IntInput();
        for (int i=0; i<height; i++) {
            for (int j=0; j<width; j++) {
                if (i %2 != 0) {
                    if (j %2 != 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j %2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }

    public static void Envelope() {
        int width, height;
        double incline;
        System.out.println("Enter width: ");
        width = IntInput();
        System.out.println("Enter height: ");
        height = IntInput();
        for (int i=1; i<=height; i++) {
            for (int j=1; j<=width; j++){
                if (i==1 || j==width || j==1 || i==height || i==(height-1)*(j-1)/(width-1)+1 || i==(height-1)*(j-width)/(1-width)+1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Even() {
        int a;
        System.out.println("Please, enter a number");
        a = IntInput();
        if (a % 2 == 0 ) {
            System.out.println("Number "+a+" is even");
        } else {
            System.out.println("Number "+a+" is odd");
        }
    }

    public static void Prime() {
        int a;
        boolean result;
        System.out.println("Please, enter a number greater than 2");
        a=IntInput();
        while (true) {
            if (a<2) {
                System.out.println("Please, enter a number greater than 2");
                a=IntInput();
            } else {
                break;
            }
        }
        if (a==2 || a==3) {
            System.out.println("Number "+a+" is prime.");
            return;
        }
        for (int i=2; i < a; i++) {
            if (a %i == 0) {
                System.out.println("Number "+a+" is not prime");
                return;
            }
        }
        System.out.println("Number "+a+" is prime.");
    }

    public static void Multiple() {
      int a;
        System.out.println("Please enter number");
        a=IntInput();
        System.out.println("Here are multiple numbers for your number.");
        for (int i=1; i<=a; i++) {
            if (a %i == 0) {
                System.out.println("Multiple is " +i);
            }
        }
    }

    public static void Rectangle() {
        int a, b;
        System.out.println("Enter width: ");
        a = IntInput();
        System.out.println("Enter height: ");
        b = IntInput();
        for (int j=1; j<=b; j++) {
            for (int i=1; i<=a; i++){
                if (i==1 || i==a || j==1 || j==b) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static boolean yesno() {
        boolean value;
        Scanner input = new Scanner(System.in);
        if (input.nextLine().equals("y")) {
            value = true;
            return value;
        } else {
            value = false;
            return value;
        }
    }

    public static int IntInput() {
        int value;
        Scanner input = new Scanner(System.in);
        try {
            value = input.nextInt();
        } catch (Exception e) {
            System.out.println("Please, enter number in correct form.");
            return IntInput();
        }
        return value;
    }

    public static BigDecimal BigDecimalInput() {
        BigDecimal value;
        Scanner input = new Scanner(System.in);
        try {
            value = input.nextBigDecimal();
        } catch (Exception e) {
            System.out.println("Please, enter number in correct form, using comma separator.");
            return BigDecimalInput();
        }
        if (!value.equals(value.abs())) {
            System.out.println("This number could not be negative, please reenter it.");
            return BigDecimalInput();
        }
        return value;
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

    public static String OperationInput() {
        Scanner input = new Scanner(System.in);
        String value=input.nextLine();
        if (value.equals("+")||value.equals("-")||value.equals("*")||value.equals("/")) {
            return value;
        } else {
            System.out.print("Please, enter operation in correct form (+ - * /)");
            return OperationInput();
        }
    }
}
