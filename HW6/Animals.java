public class Animals {

    /*
    Animal
    Fish
    Dog
    Cat
    Wolf
    Lion
    Giraffe
    Pet
    Crocodile
    Wild
    Hamster
    Guide-dog
     */

    public static void main(String[] args) {
        Animal repa = new Lion(1,2,3,"blue",true);
        System.out.println(repa.speak());

        Animal vasya = new Cat(1,2,3,"blue", "Valera",false);
        Animal vasya1 = new Cat(1,2,3,"blue", "Semen",false);
        System.out.println(vasya.speak());
        System.out.println(vasya1.speak());
    }

}
