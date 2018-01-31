package Animals;

import java.util.ArrayList;
import java.util.List;

public class CombedNotifier implements Observed {
    private static List<Observer> observers = new ArrayList<>();


    @Override
    public void addObservers(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObservers(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(int id, boolean bool, String date) {
        for (Observer o : observers) {
            o.handleEvent(id, bool, "combed", date);
        }
    }
}