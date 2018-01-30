package Animals;

public class Director implements Observer {
    @Override
    public void handleEvent(int id, String date, boolean isIll, boolean isHungry, boolean isCombed) {
        System.out.println("Hello! I'm director. The animal number " + id + " told me " + date + ", that he is " +
                (isIll ? "ill" : "healthy") + ", " + (isHungry ? "hungry" : "full") + " and " + (isCombed ? "combed." :
                "not combed."));
    }

    @Override
    public void handleEvent(int id, String date, boolean isIll, boolean isHungry) {
        System.out.println("Hello! I'm director. The animal number " + id + " told me " + date + ", that he is " +
                (isIll ? "ill" : "healthy") + " and " + (isHungry ? "hungry." : "full."));
    }
}
