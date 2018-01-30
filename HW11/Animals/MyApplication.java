package Animals;

public class MyApplication {
    private static int id;

    public void setId() {
        id++;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.addObservers(new Director());
        cat2.addObservers(new Director());

        cat1.setHungry(true);
        cat2.setCombed(true);
        cat1.setIll(true);
        cat1.setIll(false);
    }
}
