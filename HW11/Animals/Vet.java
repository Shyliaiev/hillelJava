package Animals;

public class Vet implements Observer {
    @Override
    public void handleEvent(int id, boolean bool, String type, String date) {
        System.out.print("I'm a Vet. Animal " + id + " told " + date + " that he is ");
        Words word = new Words();
        word.giveMeWord(bool, type);
    }
}
