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

    public static void main(String[] args) {
        System.out.println(getFibonacciNumber(7));
    }

    public static int getFibonacciNumber(int index) {
        if (index == 0) {
            return 0;
        }
        if (index < 2) {
            return 1;
        }
        return getFibonacciNumber(--index) + getFibonacciNumber(index - 1);
    }
}
