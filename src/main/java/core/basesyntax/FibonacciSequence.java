package core.basesyntax;

public class FibonacciSequence {

    public int[] getFibonacciSequence(int n) {
        int[] numbers;
        if (n == 0) {
            numbers = new int[0];
            return numbers;
        } else if (n == 1) {
            numbers = new int[1];
            numbers[0] = 0;
            return numbers;
        }
        numbers = new int[n];
        numbers[0] = 0;
        numbers[1] = 1;
        for (int i = 2; i < n; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        return numbers;
    }

}
