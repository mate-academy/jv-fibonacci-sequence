package core.basesyntax;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     */
    public int[] getFibonacciSequence(int n) {
        int[] fibonacci = new int[n];
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            fibonacci[i] = a;
            a = b;
            b = fibonacci[i] + b;
        }

        return fibonacci;
    }
}
