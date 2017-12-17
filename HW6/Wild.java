public abstract class Wild extends Animal {
    private boolean isPredator;

    Wild(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    public String speak() {
        String res = super.speak() + "I am a wild animal.";
        if (this.isPredator()) {
            res = res + " And I am angry.";
        }
        return res;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }
}
