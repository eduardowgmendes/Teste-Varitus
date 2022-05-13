package questao2;

public class ClassroomAlumniEvaluator {

    public static void evaluate(Alumni alumni) {
        if (alumni.media() >= 7) {
            System.out.printf("Parabéns %s\nVocê está APROVADO!\nMédia: %f\n", alumni.getName(), alumni.media());
        } else if (alumni.media() <= 5) {
            System.out.printf("Opa, não foi dessa vez! %s\nVocê está REPROVADO!\nMédia: %f\n", alumni.getName(), alumni.media());
        } else if (alumni.media() >= 5.1 && alumni.media() <= 6.9) {
            System.out.printf("Opa, não foi dessa vez! %s\nVocê está RECUPERAÇÃO!\nMédia: %f\n", alumni.getName(), alumni.media());
        }
    }

}
