package Animals;

import java.util.ArrayList;
import java.util.Date;

public abstract class Pet extends Animals {
    private boolean isCombed;
    private ArrayList<Observer> observers = new ArrayList<>();

    public boolean isCombed() {
        return isCombed;
    }

    public void setCombed(boolean combed) {
        isCombed = combed;
        notifyObservers();
    }

    @Override
    public void setIll(boolean ill) {
        super.setIll(ill);
        notifyObservers();
    }

    @Override
    public void setHungry(boolean hungry) {
        super.setHungry(hungry);
        notifyObservers();
    }

    @Override
    public void addObservers(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObservers(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        Date date = new Date();
        for (Observer i : observers
                ) {
            i.handleEvent(super.getId(), date.toString(), super.isIll(), super.isHungry(), isCombed);
        }
    }
}
