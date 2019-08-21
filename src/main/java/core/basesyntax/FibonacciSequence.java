package core.basesyntax;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     */
    public int[] getFibonacciSequence(int n) {
        int num1 = 0;
        int num2 = 0;
        int[] fibonachiNum = new int[n];
        for (int i = 0; i < n ; i++) {
            if (i == 1){
               num1 = 1;
            }
            fibonachiNum[i] = num1 + num2;
            num1 = num2;
            num2 = fibonachiNum[i];
        }
        return fibonachiNum;
    }

}
