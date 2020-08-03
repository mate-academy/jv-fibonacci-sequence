package core.basesyntax;

public class FibonacciSequence {
    public int getFibonacciNumber(int index) {
        return index <= 1 ? index : getFibonacciNumber(index - 2) + getFibonacciNumber(index - 1);
    }
}
