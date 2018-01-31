package Animals;

public class Caretaker implements Observer {
    private String name;

    Caretaker(String name){
        this.name = name;
    }

    @Override
    public void handleEvent(int id, boolean bool, String type, String date) {
        System.out.print("I'm a Caretaker. My name is " + name + ". Animal " + id + " told " + date + " that he is ");
        Words word = new Words();
        word.giveMeWord(bool, type);
    }
}