package Animals;

public class Barber implements Observer {
    private String name;

    Barber(String name){
        this.name = name;
    }

    @Override
    public void handleEvent(int id, boolean bool, String type, String date) {
        System.out.print("I'm a Barber. My name is " + name + ". Animal " + id + " told " + date + " that he is ");
        Words word = new Words();
        word.giveMeWord(bool, type);
    }
}