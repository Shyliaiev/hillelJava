import java.util.ArrayList;
//import java.util.Comparator;

public class ArrayListTestDrive {
    public static void main(String[] args) {
        ArrayList<Integer> myArr = new ArrayList<>(6);
        myArr.add(5);
        myArr.add(8);
        myArr.add(3);
        myArr.add(4);
        myArr.add(2);
        myArr.add(9);
        System.out.println(myArr);

        Context context;
        context = new Context(new Ascending());
        myArr = context.sorting(myArr);
        System.out.println(myArr);

        context = new Context(new Descending());
        myArr = context.sorting(myArr);
        System.out.println(myArr);

        context = new Context(new EvenOdd());
        myArr = context.sorting(myArr);
        System.out.println(myArr);


//
//        //Восходящая сортировка
//        myArr.sort(Comparator.naturalOrder());
//        System.out.println(myArr);
//
//        //Нисходящая сортировка
//        myArr.sort(Comparator.reverseOrder());
//        System.out.println(myArr);
//
//        //Восходящая сортировка сначала четных, затем нечетных значений
//        myArr.sort(Comparator.naturalOrder());
//        myArr.sort(((o1, o2) -> (o1 % 2 == 0 && o2 % 2 != 0) ? -1 : ((o1.equals(o2)) ? 0 : 1)));
//        System.out.println(myArr);
    }
}
