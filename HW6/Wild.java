public abstract class Wild extends Animal {
    private boolean isPredator;

    Wild(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }
}
