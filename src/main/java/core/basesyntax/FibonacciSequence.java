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
        int n0 = 0;
        int n1 = 1;
        int n2 = 0;
        for (int i = 2; i <= index; i++) {
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;

        }
        if (index == 0) {
            return 0;
        }

        if (index == 1 || index == 2) {
            return 1;
        }

        return n2;
    }
}
