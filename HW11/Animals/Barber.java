package Animals;

public class Barber implements Observer {
    @Override
    public void handleEvent(int id, boolean bool, String type, String date) {
        System.out.print("I'm a Barber. Animal " + id + " told " + date + " that he is ");
        Words word = new Words();
        word.giveMeWord(bool, type);
    }
}