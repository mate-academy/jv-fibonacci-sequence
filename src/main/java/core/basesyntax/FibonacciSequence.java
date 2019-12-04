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
        int n0 = 1;
        int n1 = 1;
        int n = 0;
        if (index > 2) {
            for (int i = 0; i < index - 2; i++) {
                n = n0 + n1;
                n0 = n1;
                n1 = n;
            }
            return n;
        } else if (index == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
