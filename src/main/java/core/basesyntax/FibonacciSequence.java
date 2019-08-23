package core.basesyntax;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     */
    public static int[] getFibonacciSequence(int n) {
        int[] fibonacciNumber = new int[n];
        for (int k = 0; k < fibonacciNumber.length; ++k) {
            if (k == 0) {
                fibonacciNumber[k] = 0;
            } else if (k == 1) {
                fibonacciNumber[k] = 1;
            } else {
                fibonacciNumber[k] = fibonacciNumber[k - 1] + fibonacciNumber[k - 2];
            }
        }
        return fibonacciNumber;
    }
}



