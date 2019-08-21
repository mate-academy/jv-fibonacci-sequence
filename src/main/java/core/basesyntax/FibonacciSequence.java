package core.basesyntax;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)`
     * который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     */
    public int[] getFibonacciSequence(int n) {
        int[] result = new int[n];
        if (n == 0) {
            return new int[]{};
        }
        if (n == 1) {
            return new int[]{0};
        }
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }
}
