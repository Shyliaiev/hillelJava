public class MainScroll {
    public static void main(String[] args) {
        //Testing size(), add(), size()
        LinkedScroll test = new LinkedScroll();
        System.out.println(test.size());//0
        test.add("Hello");
        System.out.println(test.size());//1

        //Testing isEmpty(), clear(), isEmpty()
        System.out.println(test.isEmpty());//false
        test.clear();
        System.out.println(test.isEmpty());//true

        //Testing contains()
        test.add(1);
        test.add(2);
        test.add("Hello");
        test.add(3);
        System.out.println(test.contains("Hello"));//true

        //Testing toArray()
        Object[] array = test.toArray();
        System.out.println(array[0]);//1
        System.out.println(array[1]);//2
        System.out.println(array[2]);//Hello
        System.out.println(array[3]);//3

        //Testing toArray(Object a)
        Object[] valera = new Object[15];
        valera = test.toArray(valera);
        System.out.println(valera.length);//4

        //Testing remove()
        test.remove(2);
        System.out.println(test.toString());//[1, Hello, 3]

        //Testing containsAll()
        LinkedScroll compare = new LinkedScroll();
        compare.add("Hello");
        compare.add(3);
        System.out.println(test.containsAll(compare));//true

        //Testing addAll()
        test.addAll(compare);
        System.out.println(test.toString());//[1, Hello, 3, Hello, 2]

        //Testing removeAll()
        test.removeAll(compare);
        System.out.println(compare.toString());
        System.out.println(test.toString());
    }
}
