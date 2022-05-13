package questao3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        PrintCrescentOrderAlgorithm printCrescentOrderAlgorithm = new PrintCrescentOrderAlgorithm(Arrays.asList(1, 1, 1));
        System.out.printf("%s", printCrescentOrderAlgorithm.sort(false));
    }
}
