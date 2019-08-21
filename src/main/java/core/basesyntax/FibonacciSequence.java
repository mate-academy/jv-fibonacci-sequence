package core.basesyntax;

public class FibonacciSequence {

    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий из
     * `n`чисел  последовательности Фибоначчи.
     */
    public int[] getFibonacciSequence(int n) {
        int[] fibonacciSequence = new int[n];
        for (int i = 0; i < fibonacciSequence.length; i++) {
            if (i == 0) {
                fibonacciSequence[i] = 0;
            } else if (i == 1) {
                fibonacciSequence[i] = 1;
            } else {
                fibonacciSequence[i] = fibonacciSequence[i - 2] + fibonacciSequence[i - 1];
            }
        }
        return fibonacciSequence;
    }
}
