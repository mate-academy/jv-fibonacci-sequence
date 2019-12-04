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
        if (index < 2) {
            return index;
        }
        int a = 0;
        int b = 1;
        int result = 0;
        for (int i = 2; i <= index; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }
}
