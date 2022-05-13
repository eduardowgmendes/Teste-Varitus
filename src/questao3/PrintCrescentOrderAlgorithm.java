package questao3;

import java.util.Collections;
import java.util.List;

public class PrintCrescentOrderAlgorithm {

    public static List<Integer> sort(List<Integer> values, boolean decOrder) {
        if (decOrder) {
            values.sort((o1, o2) -> {
                if (o1.equals(o2)) {
                    return 0;
                } else if (o1 > o2) {
                    return -1;
                } else {
                    return 1;
                }
            });
        } else {
            Collections.sort(values);
        }
        return values;
    }

}
