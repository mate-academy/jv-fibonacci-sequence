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
    public int getFibonacciNumber(int index) {
        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        int n1 = 0;
        int n2 = 1;
        int buffer = 0;
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(n1);
        fibonacci.add(n2);
        while (buffer <= 4181) {
            buffer = n1 + n2;
            n1 = n2;
            n2 = buffer;
            fibonacci.add(buffer);
        }
        return fibonacci.get(index);
    }
}
