package Animals;

import java.util.Collection;

public interface Observed {
    void addObservers(Observer o);
    void removeObservers(Observer o);
    void notifyObservers();
}