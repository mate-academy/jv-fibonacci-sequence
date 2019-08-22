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
            return new int[1];
        }
        int[] res = new int[n];
        res[0] = 0;
        res[1] = 1;
        if (n > 2) {
            for (int i = 2; i < n; i++) {
                res[i] = res[i - 1] + res[i - 2];
            }
        }
        return res;
    }
}
