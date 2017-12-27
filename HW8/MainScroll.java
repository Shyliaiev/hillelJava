public class MainScroll {
    public MainScroll() {
    }

    public static void main(String[] args) {
        LinkedScroll test = new LinkedScroll();
        test.add(1);
        test.add(2);
        test.add("Hello");
        test.add(3);
        System.out.println(test.contains("Hello"));
        test.remove(2);
        LinkedScroll compare = new LinkedScroll();
        compare.add("Hello");
        compare.add(3);
        System.out.println(test.containsAll(compare));
        test.addAll(compare);
        System.out.println(test.toString());
        test.removeAll(compare);
        System.out.println(test.toString());
        test.retainAll(compare);
        System.out.println(test.toString());
    }
}