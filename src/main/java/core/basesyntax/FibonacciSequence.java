package core.basesyntax;

import java.util.stream.Stream;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     *
     * @return
     */
    public int [] getFibonacciSequence(int n) {
        if (n == 0) {
            return new int[]{};
        }
        if (n == 1) {
            return new int[]{0};
        }
        int[] array = new int[n];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }
}
