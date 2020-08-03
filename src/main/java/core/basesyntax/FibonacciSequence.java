package core.basesyntax;

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

        int result = 1;

        for (int i = 3; i <= index; i++) {
            result = getFibonacciNumber(i - 1) + getFibonacciNumber(i - 2);
        }
        return result;
    }
}
