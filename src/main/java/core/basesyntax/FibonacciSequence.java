package core.basesyntax;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     */
    public static int[] getFibonacciSequence(int n) {
        int[] arrayOfNumbersFibonacci = new int[n];
        if (n == 1) {
            arrayOfNumbersFibonacci[0] = 0;
        }
        if (n == 2) {
            arrayOfNumbersFibonacci[0] = 0;
            arrayOfNumbersFibonacci[1] = 1;
        }
        if (n >= 3) {
            int[] tempArray = getFibonacciSequence(n - 1);
            for (int i = 0; i < n - 1; i++) {
                arrayOfNumbersFibonacci[i] = tempArray[i];
            }
            arrayOfNumbersFibonacci[n - 1] = arrayOfNumbersFibonacci[n - 3]
                    + arrayOfNumbersFibonacci[n - 2];
        }
        return arrayOfNumbersFibonacci;
    }
}
