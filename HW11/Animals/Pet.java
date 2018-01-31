package Animals;

public abstract class Pet extends Animal {
    private boolean combed;
    
    private boolean getCombed() {
        return combed;
    }

    public void setCombed(boolean combed) {
        this.combed = combed;
        setDate();
        new CombedNotifier().notifyObservers(getId(), getCombed(), getDate());
    }

    @Override
    public void setHungry(boolean hungry) {
        super.setHungry(hungry);
        setDate();
        new PetHungryNotifier().notifyObservers(getId(), getHungry(), getDate());
    }
}
