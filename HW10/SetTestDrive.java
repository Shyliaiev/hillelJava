public class SetTestDrive {


    public static void main(String[] args) {
        MySet myTreeSet = new MySet();
        for (int i = 0; i<100; i++){
            myTreeSet.add((int) (Math.random()*20));
        }

        System.out.println(myTreeSet);
        System.out.println(myTreeSet.contains(18));

    }
}
