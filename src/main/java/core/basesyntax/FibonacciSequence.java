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
    public static int getFibonacciNumber(int index) {
        if (index == 0) {
            return 0;
        }
        return index < 3 ? 1 : getFibonacciNumber(index - 1) + getFibonacciNumber(index - 2);
    }
}

