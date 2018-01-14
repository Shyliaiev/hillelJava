import java.util.ArrayList;

public class SomeStudent {
    private String firstName;
    private String lastName;
    private int[] marks;
    private int[] visits;

    public SomeStudent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int[] getVisits() {
        return visits;
    }

    public void setVisits(int[] visits) {
        this.visits = visits;
    }
}
