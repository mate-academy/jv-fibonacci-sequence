package core.basesyntax;

public class FibonacciSequence {

    public int[] getFibonacciSequence(int n) {
        switch (n) {
            case 0:
                int[] numbersZero = new int[0];
                return numbersZero;
            case 1:
                int[] numbersOne = new int[1];
                return numbersOne;
            default:
                int[] numbers = new int[n];
                numbers[0] = 0;
                numbers[1] = 1;
                for (int i = 2; i < n; i++) {
                    numbers[i] = numbers[i - 1] + numbers[i - 2];
                }
                return numbers;
        }

    }
}
