package core.basesyntax;

public class FibonacciSequence {

    public int getFibonacciNumber(int index) {
        return index == 1 ? 1
            : index == 0 ? 0
            : getFibonacciNumber(index - 1) + getFibonacciNumber(index - 2);
    }
}
