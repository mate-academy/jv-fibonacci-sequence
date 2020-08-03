package core.basesyntax;

public class FibonacciSequence {

    public int getFibonacciNumber(int index) {
        int result;
        if (index <= 1) {
            return index;
        }
        return getFibonacciNumber(index - 1) + getFibonacciNumber(index - 2);
    }
}
