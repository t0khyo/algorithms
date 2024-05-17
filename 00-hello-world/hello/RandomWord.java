import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = null;
        int index = 0;

        while (!StdIn.isEmpty()) {
            String currentWord = StdIn.readString();
            index++;
            if (StdRandom.bernoulli(1.0 / index)) {
                champion = currentWord;
            }
        }

        if (champion != null) {
            StdOut.println(champion);
        }
    }
}
