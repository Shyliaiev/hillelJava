package Animals;

public abstract class Wild extends Animal {

    @Override
    public void setHungry(boolean hungry) {
        super.setHungry(hungry);
        setDate();
        new WildHungryNotifier().notifyObservers(getId(), getHungry(), getDate());
    }
}
