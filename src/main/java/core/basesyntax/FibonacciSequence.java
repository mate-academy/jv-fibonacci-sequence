package core.basesyntax;

import java.util.ArrayList;

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
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < index; i++) {
            if (i > 1) {
                array.add(array.get(i - 1) + array.get(i - 2));
            } else {
                array.add(1);
            }
        }
        return array.size() > 0 ? array.get(index - 1) : 0;
    }
}
