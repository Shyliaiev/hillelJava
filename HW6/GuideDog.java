public class GuideDog extends Dog {
    private boolean isTrained;

    public GuideDog(int id, int age, int weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    public String speak() {
        String res = super.speak();
        if (this.isTrained()) {
            res = res + "I can tske you home.";
        }
        return (super.speak() + " Woof!");
    }

    public String takeHome() {
        return "Let's go!";
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }
}
