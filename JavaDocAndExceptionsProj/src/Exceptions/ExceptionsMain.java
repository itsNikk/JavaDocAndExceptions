package Exceptions;

public class ExceptionsMain {
    public static void main(String[] args) {
        /*
         * Padre di tutte = Throwable
         * Sottoclassi principali
         *   1) Error
         * !!! 2) Exception
         *       2.1) Eccezioni NON CONTROLLATE dal compilatore.
         *                  di tipo RunTimeException => il compilatore NON forza la loro gestione
         *       2.2) Eccezioni CONTROLLATE dal compilatore
         *                   Tutti gli altri sottotipi di Exception => ilcompilatore FORZA la gestione dell'eccezione
         */

        int[] array = null;
        int index = 0;
        try {
            index = array.length - 10;
            System.out.println(array[index]);
            /*
            asdasdas
            asdasd
            asdasdas

             */
        } catch (ArrayIndexOutOfBoundsException arrayExcpetion) {
            System.out.println(arrayExcpetion.getMessage());
            if (index < 0) System.out.println(array[0]);
            else if (index > array.length - 1) System.out.println(array[array.length - 1]);
        } catch (NullPointerException nullPointerException) {
            System.out.println(nullPointerException.getMessage());
            array = new int[5];
            for (int i = 0; i < array.length; i++) {
                array[i] = i + 1;
            }
            System.out.println(array[3]);
        }

        /*
         * Gestione:
         *   1) scrivere "Eccezione 'divisione per zero' identifica"
         *   2) scrivere -1 in console
         *
         * versione 2:
         *   2.1) dividere per 1
         * */

        int res = 0;
        try {
            res = 5 / 0;
            System.out.println(res);
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException.getMessage());
            res = 5 / 1;
            System.out.println(res);
        }


        
    }
}
