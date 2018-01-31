package Animals;

public class MyApplication {
    public static void main(String[] args) {

        IllNotifier illNotifier = new IllNotifier();
        WildHungryNotifier wildHungryNotifier = new WildHungryNotifier();
        PetHungryNotifier petHungryNotifier = new PetHungryNotifier();
        CombedNotifier combedNotifier = new CombedNotifier();

        Director director = new Director("Petro");
        Barber barber = new Barber("Sashko");
        Caretaker caretaker1 = new Caretaker("Vasylko");
        Caretaker caretaker2 = new Caretaker("Valerchik");
        Vet vet = new Vet("Kolyan");

        illNotifier.addObservers(director);
        illNotifier.addObservers(vet);

        wildHungryNotifier.addObservers(director);
        wildHungryNotifier.addObservers(caretaker1);
        wildHungryNotifier.addObservers(vet);

        petHungryNotifier.addObservers(director);
        petHungryNotifier.addObservers(caretaker1);
        petHungryNotifier.addObservers(vet);

        combedNotifier.addObservers(director);
        combedNotifier.addObservers(barber);

        Cat cat = new Cat();
        Dog dog = new Dog();
        Lion lion = new Lion();
        Elephant elephant = new Elephant();

        System.out.println("Кот заболел");
        cat.setIll(true);
        System.out.println("Кота расчесали");
        cat.setCombed(true);
        System.out.println("Пёс проголодался");
        dog.setHungry(true);
        System.out.println("Лев заболел");
        lion.setIll(true);
        System.out.println("Слон проголодался");
        elephant.setHungry(true);
        System.out.println("На работу вышел второй смотритель");
        wildHungryNotifier.removeObservers(caretaker1);
        wildHungryNotifier.addObservers(caretaker2);
        System.out.println("Проголодался кот");
        cat.setHungry(true);
        System.out.println("Лев проголодался");
        elephant.setHungry(true);
    }
}
