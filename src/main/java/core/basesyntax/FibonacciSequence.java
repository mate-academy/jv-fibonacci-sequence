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

        int[] ar = new int[n];
        ar[0] = 0;
        ar[1] = 1;
        for (int i = 2; i < n; i++) {
            ar[i] = ar[i - 2] + ar[i - 1];
        }
        return ar;
    }
}
