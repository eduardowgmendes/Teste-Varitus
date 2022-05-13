package questao2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ClassroomAlumniEvaluator alumniEvaluator = new ClassroomAlumniEvaluator(new ClassroomAlumniEvaluator.Alumni("Eduardo Mendes", Arrays.asList(5.0, 1.0, 1.5)));
        alumniEvaluator.evaluate();
    }
}
