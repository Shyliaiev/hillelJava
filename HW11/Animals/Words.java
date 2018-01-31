package Animals;

public class Words {

    public void giveMeWord(boolean bool, String type) {
        switch (type) {
            case "ill":
                if (bool) {
                    System.out.print("ill");
                } else {
                    System.out.print("healthy");
                }
                System.out.println(".");
                break;
            case "hungry":
                if (bool) {
                    System.out.print("hungry");
                } else {
                    System.out.print("full");
                }
                System.out.println(".");
                break;
            case "combed":
                if (bool) {
                    System.out.print("combed");
                } else {
                    System.out.print("tousled");
                }
                System.out.println(".");
                break;
        }
    }
}
