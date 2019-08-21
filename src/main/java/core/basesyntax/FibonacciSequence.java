package core.basesyntax;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     */
    public int[] getFibonacciSequence(int n) {
        int[] fibonacci = new int[n];
        if (n < 2) {
            return fibonacci;
        }

        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 0; i < n - 1; i++) {
            int temp = fibonacci[i];
            fibonacci[i] = fibonacci[i + 1] + 1;
            fibonacci[i + 1] = temp + fibonacci[i + 1];
        }

        return fibonacci;

    }
}
