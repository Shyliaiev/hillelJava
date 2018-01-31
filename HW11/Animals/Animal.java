package Animals;

import java.util.Date;

public abstract class Animal {
    private static int id;
    private int number;
    private boolean ill;
    private boolean hungry;
    public String date;

    Animal() {
        id++;
        number = id;
    }

    void setDate() {
        Date date = new Date();
        this.date = date.toString();
    }

    public String getDate() {
        return date;
    }

    public int getId() {
        return number;
    }

    private boolean getIll() {
        return ill;
    }

    public void setIll(boolean ill) {
        this.ill = ill;
        setDate();
        new IllNotifier().notifyObservers(getId(), getIll(), getDate());
    }

    boolean getHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
//        setDate();
//        new HungryNotifier().notifyObservers(getId(), getHungry(), getDate());
    }
}
