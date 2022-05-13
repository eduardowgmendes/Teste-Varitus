package questao1;

public class ChangeValueAlgorithm {

    public static void changeValueFrom(int a, int b) {
        int aux;

        if (a == b) {
            System.out.printf("Nothing Changed! %d == %d", a, b);
        }

        System.out.printf("Values was:\na: %d\nb: %d\n", a, b);

        aux = a;
        a = b;
        b = aux;

        System.out.printf("Changed Values:\na: %d\nb: %d\n", a, b);

    }

}
