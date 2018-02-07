import java.util.LinkedList;

public class MyMapTest {
    public static void main(String[] args) {
//        MyMap<Integer, String> myMap = new MyMap<>();
//        System.out.println(myMap.size());
//        myMap.put(20,"Hello");
//        myMap.put(98,"See you");
//        System.out.println(myMap.size());
        @SuppressWarnings("unchecked") LinkedList[] opa = new LinkedList[10];
        LinkedList tr = new LinkedList();
        tr = null;
        tr.add(1);
        tr.add(2);
        tr.add(3);
        opa[5]=tr;
        System.out.println(opa[5].size());
    }
}
