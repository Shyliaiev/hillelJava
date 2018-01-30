package Animals;

public abstract class Animals implements Observed{
    private int id;
    private boolean isIll;
    private boolean isHungry;

    Animals(){
        id++;
    }

    public int getId(){
        return id;
    }

    public boolean isIll() {
        return isIll;
    }

    public void setIll(boolean ill) {
        isIll = ill;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }
}
