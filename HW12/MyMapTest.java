public class MyMapTest {
    public static void main(String[] args) {
        MyMap<Integer, String> myMap = new MyMap<>();
        //Testing isEmpty
        System.out.println(myMap.isEmpty());
        myMap.put(20,"Hello");
        System.out.println(myMap.isEmpty());
        System.out.println("///////////////////");

        //Testing add
        myMap.put(20,"Hello");
        myMap.put(98,"See you");
        myMap.put(234,"See you");
        myMap.put(67894,"See you");
        myMap.put(9785613,"See you");
        System.out.println(myMap.size());
        System.out.println("///////////////////");

        //Testing get
        System.out.println(myMap.get(20));
        System.out.println(myMap.get(778));
        System.out.println("///////////////////");

        //Testing containsKey
        System.out.println(myMap.containsKey(98));
        System.out.println(myMap.containsKey(555));
        System.out.println("///////////////////");

        //Testing containsValue
        System.out.println(myMap.containsValue("Hello"));
        System.out.println(myMap.containsValue("HSd"));
        System.out.println("///////////////////");
    }
}
