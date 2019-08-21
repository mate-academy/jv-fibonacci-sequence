package core.basesyntax;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     */
    public int[] getFibonacciSequence(int n) {
        if (n == 1) {
            return new int[] {0};
        }
        int[] fibonacciSequence = new int[n];
        if (n > 1) {
            fibonacciSequence[0] = 0;
            fibonacciSequence[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacciSequence[i] = fibonacciSequence[i - 2 ] + fibonacciSequence[i - 1];
        }
        return fibonacciSequence;
    }
}
