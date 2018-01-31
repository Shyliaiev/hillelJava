package Animals;

public abstract class Pet extends Animal {
    private boolean combed;
    
    public boolean getCombed() {
        return combed;
    }

    public void setCombed(boolean combed) {
        combed = true;
        this.combed = combed;
        setDate();
        new CombedNotifier().notifyObservers(getId(), getCombed(), getDate());
    }
}
