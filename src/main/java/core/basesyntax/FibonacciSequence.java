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
        int counterIndex = 0;
        return computeNextNumber(0, 1, counterIndex, index);
    }

    private int computeNextNumber(int lastNumber, int thisNumber, int counterIndex, int index) {
        if (counterIndex == index) {
            return lastNumber;
        }
        return computeNextNumber(thisNumber, lastNumber + thisNumber,
                ++counterIndex, index);
    }
}
