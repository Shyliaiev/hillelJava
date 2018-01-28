import java.util.*;

public class DotComBust {

    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInpit) {
        String result = "Miss";
        int index = locationCells.indexOf(userInpit);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "On the bottom";
                System.out.println("You get to bottom " + name + " :(");
            } else {
                result = "Got it";
            }
        }
        return result;
    }
}
