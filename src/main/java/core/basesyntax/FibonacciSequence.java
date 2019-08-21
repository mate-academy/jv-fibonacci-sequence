package core.basesyntax;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     */
    public static int[] getFibonacciSequence(int n) {
        int[] f = new int[n];

        for (int i = 0; i < f.length; ++i) {
            if (i == 0) {
                f[i] = 0;
            } else if (i == 1) {
                f[i] = 1;
            } else {

                f[i] = f[i - 1] + f[i - 2];
            }
        }
        return f;
    }
}



