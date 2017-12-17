public class TestAll {
    public static void main(String[] args) {
        int[] i = {1,2,3,4};
        int[] j;

        j=i;
        System.out.println(i[2]);
        j[2]=7;
        System.out.println("j2 "+j[2]);
        System.out.println("I2 "+i[2]);
    }
}
