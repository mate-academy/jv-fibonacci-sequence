package core.basesyntax;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     */
    public int[] getFibonacciSequence(int n) {
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = getNumber(i);
        }
        return sequence;
    }

    public int getNumber(int number) {
        return (number > 1)
                ? getNumber(number - 1) + getNumber(number - 2) : number;
    }
}
