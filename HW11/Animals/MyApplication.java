package Animals;

public class MyApplication {
    public static void main(String[] args) {

        IllNotifier illNotifier = new IllNotifier();
        HungryNotifier hungryNotifier = new HungryNotifier();
        CombedNotifier combedNotifier = new CombedNotifier();

        Director Valera = new Director();
        Vet Pasha = new Vet();
        Caretaker Ivan = new Caretaker();
        Barber Gennadiy = new Barber();

        illNotifier.addObservers(Valera);
        illNotifier.addObservers(Pasha);

        hungryNotifier.addObservers(Valera);
        hungryNotifier.addObservers(Pasha);
        hungryNotifier.addObservers(Ivan);

        combedNotifier.addObservers(Valera);
        combedNotifier.addObservers(Gennadiy);


        Cat cat1 = new Cat();
        Elephant elephant = new Elephant();
        cat1.setIll(false);
        cat1.setHungry(false);
        cat1.setCombed(true);
        elephant.setIll(false);

    }
}
