package core.basesyntax;

public class FibonacciSequence {
    /**
     * Реализуйте метод `getFibonacciSequence(int n)` который вовзращает массив состоящий
     * из `n`чисел  последовательности Фибоначчи.
     */
    public int[] getFibonacciSequence(int n) {
        int[] nums = new int[n];
        int nextNum = 1;
        if (n == 1) {
            nums[0] = 0;
            return nums;
        } else {
            for (int i = 1; i < n; i++) {
                nums[i] = nextNum;
                nextNum += nums[i - 1];
            }
        }
        return nums;
    }
}
