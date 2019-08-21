package core.basesyntax;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     */
    public static int[] getFibonacciSequence(int n) {
        int[] f = new int[n];

        for (int k = 0; k < f.length; ++k) {
            if (k == 0) {
                f[k] = 0;
            } else if (k == 1) {
                f[k] = 1;
            } else {

                f[k] = f[k - 1] + f[k - 2];
            }
        }
        return f;
    }
}



