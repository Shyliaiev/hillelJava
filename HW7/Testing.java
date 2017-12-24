public class Testing {
    public static void main(String[] args) {

//      Testing size and add together (output should be 0  1)
        MyCollection arr = new MyCollection();
        System.out.println(arr.size());
        arr.add("jsakjas");
        System.out.println(arr.size());
        System.out.println("/////////////////////////");

//      Testing isEmpty (output should be true)
        arr = new MyCollection();
        System.out.println(arr.isEmpty());
        System.out.println("/////////////////////////");

//      Testing contains (output should be true)
        arr.add("jsakjas");
        System.out.println(arr.contains("jsakjas"));
        System.out.println("/////////////////////////");

//      Testing remove (output should be 0)
        arr.remove("jsakjas");
        System.out.println(arr.size());
        System.out.println("/////////////////////////");

//      Testing addAll (output should be Three)
        arr.add(1);
        arr.add(2);
        arr.add(3);
        MyCollection newArr = new MyCollection();
        newArr.add("One");
        newArr.add("Two");
        newArr.add("Three");
        arr.addAll(newArr);
        System.out.println(arr.getData(5));
        System.out.println("/////////////////////////");

//      Testing removeAll (output should be 6  3)
        System.out.println(arr.size());
        arr.removeAll(newArr);
        System.out.println(arr.size());
        System.out.println("/////////////////////////");

//      Testing remainAll (output should be 3 Two)
        arr.addAll(newArr);
        MyCollection del = new MyCollection();
        del.add(3);
        del.add("Two");
        arr.retainAll(del);
        for (int i=0;i<arr.size();i++){
            System.out.println(arr.getData(i));
        }
        System.out.println("/////////////////////////");

//      Testing containsAll (output should be True False)
        arr.addAll(newArr);
        System.out.println(arr.containsAll(del));
        del.add(9029);
        System.out.println(arr.containsAll(del));
    }
}
