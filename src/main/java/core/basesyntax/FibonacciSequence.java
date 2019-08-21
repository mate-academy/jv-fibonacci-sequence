package core.basesyntax;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     */
    public int[] getFibonacciSequence(int n) {
        int [] arrayOfNumbersFibonacci = new int[n];
        if (n >= 1) {
            arrayOfNumbersFibonacci[0] = 0;
        }
        if (n >= 2) {
            arrayOfNumbersFibonacci[1] = 1;
        }

        if (n > 2) {
            for (int i = 2; i < n; i++) {
                arrayOfNumbersFibonacci[i] = arrayOfNumbersFibonacci[i - 1]
                        + arrayOfNumbersFibonacci[i - 2];
            }
        }

        return arrayOfNumbersFibonacci;
    }
}
