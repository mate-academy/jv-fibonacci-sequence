package core.basesyntax;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     */
    public int[] getFibonacciSequence(int n) {
        int [] mass = new int[n];
        for (int i = 0; i < mass.length; i++) {
            mass [i] = fibonacciRec(i);
        }
        return mass;
    }

    private int fibonacciRec(int s) {
        if (s == 0) {
            return 0;
        } else if (s == 1) {
            return 1;
        } else {
            return fibonacciRec(s - 1) + fibonacciRec(s - 2);
        }
    }
}
