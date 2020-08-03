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
        int numbrer0 = 1;
        int numbrer1 = 1;
        int numbrer2 = 0;
        if (index == 0) {
            return 0;
        }
        for (int i = 3; i <= index; i++) {
            numbrer2 = numbrer0 + numbrer1;
            numbrer0 = numbrer1;
            numbrer1 = numbrer2;
        }
        return numbrer1;
    }
}
