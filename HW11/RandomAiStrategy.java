import java.util.Random;

public class RandomAiStrategy implements AiGameStrategy {

    @Override
    public int aiMakeTurn(int[] field) {
        int i = 75;
        while (i == 75 || field[i] != 0) {
            Random random = new Random();
            i = random.nextInt(9);
        }
        return i;
    }
}
