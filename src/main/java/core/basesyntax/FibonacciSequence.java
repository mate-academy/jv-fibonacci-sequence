package core.basesyntax;

public class FibonacciSequence {
    /**
     * <p>Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.</p>
     */
    public int[] getFibonacciSequence(int n) {
        if (n <= 0) {
            return new int[]{};
        }
        if (n == 1) {
            return new int[]{0};
        }
        if (n == 2) {
            return new int[]{0, 1};
        }
        int[] sequence = new int[n];
        int[] prvSequence = getFibonacciSequence(n - 1);
        for (int i = 0; i < prvSequence.length; i++) {
            sequence[i] = prvSequence[i];
        }
        sequence[n - 1] = sequence[n - 2] + sequence[n - 3];
        return sequence;
    }
}
