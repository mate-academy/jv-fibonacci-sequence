package core.basesyntax;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     */
    public int[] getFibonacciSequence(int n) {
        if (n == 0) {
            return new int[]{};
        }
        if (n == 1) {
            return new int[]{0};
        }
        int[] returnArray = new int[n];
        returnArray[0] = 0;
        returnArray[1] = 1;
        for (int i = 2; i < n; i++) {
            returnArray[i] = returnArray[i - 1] + returnArray[i - 2];
        }
        return returnArray;
    }
}
