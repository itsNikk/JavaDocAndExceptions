package Exceptions.Intro;

/**
 *
 * test
 * @author Filippo Bruni
 * @version 1.0
 */
public class Main {

    /**
     * costruttore
     */
    public Main(){
        System.out.println("asdadag");
    }

    /**
     * Metodone gigantone che fa eseguire l'app.
     * @param args input da linea di comando
     */
    public static void main(String[] args) {
        // commento
        /*
         *   commento multilnea
         */


        Foo(1, 4);

    }

    /**
     * Commento <em>Javadoc<em/>
     * questo metodo esegue la somma di due numeri, <strong>solo</strong> di due numeri.
     *<p>
     *     Quesdto metodo si ispira alla soluzione creata da Pippo al link che vedete sotto
     *
     *</p>
     * @param a il primo numero
     * @param b il secondo numero
     * @return la somma tra a e b
     * @author Nicolò Buganza
     * @author Luca Rossi
     * @see <a href="https://ioflood.com/blog/math-class-java/">Link all'implementazione</a>
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#sin-double-">
     *     Math.sin official doc</a>
     * @see #main(String[])
     */
    private static double Foo(int a, int b) {
        return Math.sin(a + b);
    }
}