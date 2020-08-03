package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {

    public int getFibonacciNumber(int index) {
        List<Integer> fibonacciNumbers = new ArrayList();
        int j = 0;
        int k = 0;
        for (int i = 0; i <= index; i++) {
            if (i == 2) {
                j += (i - 2);
            } else if (i > 2) {
                j = fibonacciNumbers.get(i - 1) + fibonacciNumbers.get(k - 2);
            } else {
                j += i;
            }
            fibonacciNumbers.add(j);
            k++;
        }
        return fibonacciNumbers.get(fibonacciNumbers.size() - 1);
    }
}

