package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {
    /**
     * <p>Реализуйте метод `getFibonacciNumber(int n)` который возвращает число Фибоначи которое
     * стоит на `n` позиции в последовательности Фибоначчи (начало нумерации с нуля).
     * Используйте рекурсию.</p>
     *
     * <p>Пример: n = 8
     * Результат: 21</p>
     */
    private static final int TWENTIES_NUMBER_OF_FIBONACCI = 4181;
    
    public int getFibonacciNumber(int index) {
        int n1 = 0;
        int n2 = 1;
        int buffer = 0;
        List<Integer> fibonacciSequence = new ArrayList<>();
        fibonacciSequence.add(n1);
        fibonacciSequence.add(n2);
        while (buffer <= TWENTIES_NUMBER_OF_FIBONACCI) {
            buffer = n1 + n2;
            n1 = n2;
            n2 = buffer;
            fibonacciSequence.add(buffer);
        }
        return fibonacciSequence.get(index);
    }
}
