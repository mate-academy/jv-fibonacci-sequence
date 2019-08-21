package core.basesyntax;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     */
    public int[] getFibonacciSequence(int n) {
        int[] res = new int[n];
        if (n == 0) {
            return res;
        } else if (n == 1) {
            res[0] = 0;
        } else if (n == 2) {
            res[0] = 0;
            res[1] = 1;
        } else {
            res[0] = 0;
            res[1] = 1;
            for (int i = 2; i < n; i++) {
                res[i] = res[i - 1] + res[i - 2];
            }
        }
        return res;
    }
}
