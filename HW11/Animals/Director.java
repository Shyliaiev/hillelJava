package Animals;

public class Director implements Observer {
    private String name;

    Director(String name){
        this.name = name;
    }

    @Override
    public void handleEvent(int id, boolean bool, String type, String date) {
        System.out.print("I'm a Director. My name is " + name + ". Animal " + id + " told " + date + " that he is ");
        Words word = new Words();
        word.giveMeWord(bool, type);
    }
}
