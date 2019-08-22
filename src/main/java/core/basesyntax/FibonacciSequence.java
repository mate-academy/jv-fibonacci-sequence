package core.basesyntax;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     */
    public static int[] getFibonacciSequence(int n) {
        int[] fibonacciNumbers = new int[n];

        for (int k = 0; k < fibonacciNumbers.length; ++k) {
            if (k == 0) {
                fibonacciNumbers[k] = 0;
            } else if (k == 1) {
                fibonacciNumbers[k] = 1;
            } else {

                fibonacciNumbers[k] = fibonacciNumbers[k - 1] + fibonacciNumbers[k - 2];
            }
        }
        return fibonacciNumbers;
    }
}



