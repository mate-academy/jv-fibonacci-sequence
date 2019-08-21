package core.basesyntax;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     */
    public int[] getFibonacciSequence(int n) {
        int [] result = new int[n];
        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                result[i] = i;
            } else {
                result[i] = result[i - 1] + result[i - 2];
            }
        }
        return result;
    }
}
