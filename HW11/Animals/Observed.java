package Animals;

public interface Observed {
    void addObservers(Observer o);
    void removeObservers(Observer o);
    void notifyObservers(int id, boolean bool, String date);
}