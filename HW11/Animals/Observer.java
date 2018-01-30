package Animals;

public interface Observer {
    void handleEvent(int id, String date, boolean isIll, boolean isHungry, boolean isCombed);
    void handleEvent(int id, String date, boolean isIll, boolean isHungry);
}
