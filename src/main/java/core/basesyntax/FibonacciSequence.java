package core.basesyntax;

public class FibonacciSequence {
    /**
     * 0 1 1 2 3 5 8 index = n[1] + n[0]
     */
    public int getFibonacciNumber(int index) {
        return (index < 2) ? index : getFibonacciNumber(index - 1)
                + getFibonacciNumber(index - 2);
    }
}
