public class Test {
    public static void main(String[] args) {

        int[] i = {1, 2, 3, 4};
        int[] j = {87, 88, 89, 90};
        int[] m = {8,1,15,2};
        int[] o = {87, 88, 89, 90};

        Massive k = new Massive();
        Massive l = new Massive();
        Massive n = new Massive();
        k.setData(i);
        l.setData(j);
        n.setData(m);

        System.out.println("В скобках указан результат операции");
        System.out.println("Добавляем число 78 в конец массива i (1, 2, 3, 4, 78)");
        k.add(78);
        for (int a:k.getData()) {
            System.out.print(a+", ");
        }
        System.out.println();

        System.out.println("Проверяем, есть ли числа 546 и 3 в массиве i (false, true)");
        System.out.println(k.contains(546));
        System.out.println(k.contains(3));

        System.out.println("Получаем значение из массива i по индексу 2 (3)");
        System.out.println(k.get(2));

        System.out.println("Сливаем массивы і и j (1, 2, 3, 4, 78, 87, 88, 89, 90)");
        k.addAll(j);
        for (int a:k.getData()) {
            System.out.print(a+", ");
        }
        System.out.println();

        System.out.println("Проверяем, одинаковые ли массивы i и j (false)");
        System.out.println(k.equal(o));
        System.out.println("Проверяем, одинаковые ли массивы j и o (true)");
        System.out.println(l.equal(o));

        System.out.println("Получаем размер массива i (9)");
        System.out.println(k.getSize());

        System.out.println("Очищаем массив i. (размер 0)");
        k.clear();
        System.out.println(k.getSize());

        System.out.println("Находим индекс элемента 89 в массиве j (2)");
        System.out.println(l.findIndexOf(89));

        System.out.println("Сортируем массив m в порядке возрастания (1, 2, 8, 15)");
        n.sort(true);
        for (int a:n.getData()) {
            System.out.print(a+", ");
        }
        System.out.println();

        System.out.println("Сортируем массив m в порядке убывания (15, 8, 2, 1)");
        n.sort(false);
        for (int a:n.getData()) {
            System.out.print(a+", ");
        }
        System.out.println();
    }
}
