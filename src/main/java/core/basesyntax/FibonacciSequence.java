package core.basesyntax;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     */
    public int[] getFibonacciSequence(int n) {
        if (n == 0) {
            return new int[0];
        } else if (n == 1) {
            return new int[]{0};
        } else {
            int[] fibonacciArray = new int[n];
            fibonacciArray[1] = 1;
            for (int i = 2; i < n; i++) {
                fibonacciArray[i] =
                        fibonacciArray[i - 2] + fibonacciArray[i - 1];
            }
            return fibonacciArray;
        }
    }
}
