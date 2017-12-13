public class Test {
    public static void main(String[] args) {
        int[] i = {1, 2, 3, 4};
        int[] j = {87, 88, 89, 90};
        int[] m = {1, 2, 3, 4};

        Massive k = new Massive();
        Massive l = new Massive();
        k.setData(i);
        l.setData(j);

//        for (int m:k.getData()) {
//            System.out.println(m);
//        }
//        k.add(1);
//        for (int m:k.getData()) {
//            System.out.println(m);
//        }

//        System.out.println(k.contains(3));

//        System.out.println(l.get(4));

//        k.clear();
//        System.out.println(k.getData().length);

//        System.out.println(l.findIndexOf(89));

//        System.out.println(k.getSize());

//        k.addAll(j);
//        for (int qqq:k.getData()) {
//            System.out.println(qqq);
//        }

//        System.out.println(k.equal(m));


        String a = "Privet, ";
        String b = "kak dela";
        String c = "?";

//        String d = a+b+c;
        String d = Massive.concat(a,b,c);

        System.out.println(d);
    }
}
