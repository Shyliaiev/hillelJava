package Animals;

public class Caretaker implements Observer {
    @Override
    public void handleEvent(int id, boolean bool, String type, String date) {
        System.out.print("I'm a Caretaker. Animal " + id + " told " + date + " that he is ");
        Words word = new Words();
        word.giveMeWord(bool, type);
    }
}