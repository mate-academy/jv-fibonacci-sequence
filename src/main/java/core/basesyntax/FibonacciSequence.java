package core.basesyntax;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     */
    public int[] getFibonacciSequence(int n) {
        //simplify to return new int[] {0}....
        if (n == 1) {
            return new int[]{0};
        }
        int[] sequence = new int[n];
        if (n != 0) {
            sequence[0] = 0;
            sequence[1] = 1;
            for (int i = 0; i < n - 2; i++) {
                sequence[i + 2] = sequence[i] + sequence[i + 1];
            }
        }
        return sequence;
    }
}
