package core.basesyntax;

public class FibonacciSequence {
    public int getFibonacciNumber(int index) {
        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        return getFibonacciNumber(index - 1) + getFibonacciNumber(index - 2);
    }
}
