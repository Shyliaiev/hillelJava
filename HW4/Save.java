import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Save {
    public boolean Save(Group[] groups) {
        try (PrintWriter writer = new PrintWriter("hello.txt")) {
            for (Group o:groups) {
                writer.println(o.name);
                for (Student p:o.students) {
                    writer.print(p.name + " ");
                    writer.print("Marks "+ Arrays.toString(p.marks)+" ");
                    writer.println("Presence "+ Arrays.toString(p.presence));
                }
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
