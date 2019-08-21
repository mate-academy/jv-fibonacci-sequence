package core.basesyntax;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     */
    public static int[] getFibonacciSequence(int n) {
        int[] fibonacci = new int[n];
        int value = 0;
        int value1 = 1;
        for (int i = 0; i < n; i++) {
            fibonacci[i] = value;
            value = value1;
            value1 += fibonacci[i];
        }
        return fibonacci;
    }
}