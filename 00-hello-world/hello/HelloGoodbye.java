import edu.princeton.cs.algs4.StdOut;

public class HelloGoodbye {

    /**
     * Prints hello and goodbye to the two names
     *
     * @param args sequence of names
     */
    public static void main(String[] args) {
        String firstName = args[0];
        String secondName = args[1];

        StdOut.println("Hello " + firstName + " and " + secondName + ".");
        StdOut.println("Goodbye " + secondName + " and " + firstName + ".");

    }
}
