import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListTestDrive {
    public static void main(String[] args) {
        ArrayList<Integer> myArr = new ArrayList<>(6);
        myArr.add(2);
        myArr.add(4);
        myArr.add(8);
        myArr.add(3);
        myArr.add(5);
        myArr.add(9);
        System.out.println(myArr);
        //Восходящая сортировка
        myArr.sort(Integer::compareTo);
        System.out.println(myArr);
        //Нисходящая сортировка
        myArr.sort(((o1, o2) -> (o1 < o2) ? 1 : ((o1 == o2) ? 0 : -1)));
        System.out.println(myArr);
        //Восходящая сортировка сначала четных, затем нечетных значений
        ArrayList<Integer> evenArr = new ArrayList<>(3);
        ArrayList<Integer> oddArr = new ArrayList<>(3);
        myArr.sort(Integer::compareTo);
        for (int i : myArr) {
            if (i % 2 == 0) {
                evenArr.add(i);
            } else {
                oddArr.add(i);
            }
        }
        evenArr.addAll(oddArr);
        myArr=evenArr;
        System.out.println(myArr);
    }
}
