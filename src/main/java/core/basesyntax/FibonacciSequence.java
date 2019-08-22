package core.basesyntax;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     */
    public int[] getFibonacciSequence(int n) {
        if (n == 0) {
            return new int[0];
        }
        if (n == 1) {
            return new int[] { 0 };
        }
        if (n == 2) {
            return new int[] { 0, 1 };
        }

        int[] intArrayFibonacci = new int[n];
        intArrayFibonacci[0] = 0;
        intArrayFibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            intArrayFibonacci[i] = intArrayFibonacci[i - 2] + intArrayFibonacci[i - 1];
        }
        return intArrayFibonacci;
    }
}
