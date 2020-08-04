package core.basesyntax;

public class FibonacciSequence {

    public int getFibonacciNumber(int index) {
        return (index == 0) ? 0 :
                (index == 1) ? 1 :
                        getFibonacciNumber(index - 1) + getFibonacciNumber(index - 2);
    }
}

