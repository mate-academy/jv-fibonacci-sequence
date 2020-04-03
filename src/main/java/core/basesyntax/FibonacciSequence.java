package core.basesyntax;

public class FibonacciSequence {

    public int getFibonacciNumber(int index) {
        int [] abc = new int [index];
        if (index <= 2) {
            if (index == 0) {
                return 0;
            }
            return 1;
        }
        abc[0] = 1;
        abc[1] = 1;
        for (int i = 2; i < abc.length; i++) {
            abc[i] = abc[i - 1] + abc[i - 2];
        }
        return abc[abc.length - 1];
    }
}
