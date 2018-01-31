package Animals;

public class MyApplication {
    public static void main(String[] args) {

        IllNotifier illNotifier = new IllNotifier();
        HungryNotifier hungryNotifier = new HungryNotifier();
        CombedNotifier combedNotifier = new CombedNotifier();

        Director Valera = new Director();

        illNotifier.addObservers(Valera);
        hungryNotifier.addObservers(Valera);
        combedNotifier.addObservers(Valera);

        Cat cat1 = new Cat();
        Elephant elephant = new Elephant();
        cat1.setIll(false);
        cat1.setHungry(false);
        cat1.setCombed(true);
        elephant.setIll(false);

    }
}
