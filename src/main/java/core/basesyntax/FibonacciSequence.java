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
        int result = 1;
        return (index == 0) ? result - 1 :
                (index == 1 || index == 2) ? result :
                        getFibonacciNumber(index - 2) + getFibonacciNumber(index - 1);
    }
}
