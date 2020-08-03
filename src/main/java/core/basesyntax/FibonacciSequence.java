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
        int n2;
        for (int i = 3; i <= index; i++) {
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
            if (i == index) {
                return n2;
            }
        }
        return index > 0 ? 1 : 0;
    }
}
