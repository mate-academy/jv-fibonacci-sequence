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
    public static int getFibonacciNumber(int i) {
        return i <= 1 ? i
                : getFibonacciNumber(i - 1) + getFibonacciNumber(i - 2);
    }
}
