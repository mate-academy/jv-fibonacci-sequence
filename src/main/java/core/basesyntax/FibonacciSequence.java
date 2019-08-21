package core.basesyntax;

public class FibonacciSequence {
    /**
     * <p>Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.</p>
     */
    public int[] getFibonacciSequence(int n) {
        int[] fibonacci = new int[n];
        if (n == 0) {
            return fibonacci;
        }
        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                fibonacci[i] = i;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        return fibonacci;
    }
}
