package core.basesyntax;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     */
    public int[] getFibonacciSequence(int n) {
        if (n == 0) {
            return new int[0];
        } else  if (n == 1) {
            int[] arrayFib = {0};
            return arrayFib;
        } else {
            int[] arrayFib = new int[n];
            arrayFib[0] = 0;
            arrayFib[1] = 1;
            for (int i = 2; i < n; i++) {
                arrayFib[i] = arrayFib[i - 2] + arrayFib[i - 1];
            }
            return arrayFib;
        }
    }
}
