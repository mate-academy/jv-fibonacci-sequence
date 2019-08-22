package core.basesyntax;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     */
    public static void main(String[] args) {

    }

    public int[] getFibonacciSequence(int n) {
        if (n == 0) {
            return new int[0];
        }
        if (n == 1) {
            return new int[]{0};
        }
        int[] arrFibonacciNum = new int[n];
        arrFibonacciNum[0] = 0;
        arrFibonacciNum[1] = 1;
        for (int i = 2; i < n; i++) {
            arrFibonacciNum[i] = arrFibonacciNum[i - 2] + arrFibonacciNum[i - 1];
        }
        return arrFibonacciNum;
    }
}
