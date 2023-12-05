public class Main {
    /**
     * Questo è il main dell'applicazione, ecc ecc....
     * @param args - parametri in ingresso da riga di comando
     */
    public static void main(String[] args) {
        // simple comment
        /*
            Simple multiline comment
         */

        System.out.println(args[0]);

        computeSumCosAndSin(1, 4);
    }

    /**
     * Questo metodo si chiama <em>Foo<em/>
     * <p>
     * Questo metodo stampa una semplice stringa, che è <code>Test</code>
     * </p>
     *
     * @param x il primo numero
     * @param y il secondo numero
     * @return la somma tra <code>x</code> e <code>y</code>
     * @author Nicolò Buganza
     * @author Roberto Rossi
     * @throws IllegalArgumentException se x o y non sono positivi
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#cos-double-">
     *     Math.cos Doc</a>
     * @see #main(String[])
     * 
     */
    private static double computeSumCosAndSin(int x, int y)  {
        System.out.println("Test");
        return Math.cos(x) + Math.sin(y);
    }
}