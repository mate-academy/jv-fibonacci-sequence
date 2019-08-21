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
        } else {
            int[] sequence = new int[n];
            sequence[0] = 0;
            sequence[1] = 1;
            for (int i = 2; i < n; i++) {
                sequence[i] = sequence[i - 2] + sequence[i - 1];
            }
            return sequence;
        }

    }

}
