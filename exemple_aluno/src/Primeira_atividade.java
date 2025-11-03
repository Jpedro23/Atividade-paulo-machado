import java.util.Scanner;
public class Primeira_atividade {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-------------- Sistema de avaliação de notas do Paulo Machado --------------\n");

        System.out.println("Digite aqui a sua primiera nota do primeiro Bimestre ");
        double nota_1_bimestre = input.nextDouble();

        System.out.println("\nDigite aqui a sua segunda nota do primeiro Bimestre ");
        double nota_2_bimestre = input.nextDouble();

        double resultado_primeiro_bimestre = (nota_1_bimestre + nota_2_bimestre) / 2;
       System.out.println("-------------------------------------------");
        System.out.printf("A media do primeiro Semestre foi de %.1f", resultado_primeiro_bimestre);
       System.out.println("\n-------------------------------------------");

// -------------------------------------------------------

       System.out.println("Digite aqui a sua primiera nota do segundo Bimestre ");
       double nota_1_bimestre_2 = input.nextDouble();

       System.out.println("\nDigite aqui a sua segunda nota do segundo Bimestre ");
       double nota_2_bimestre_2 = input.nextDouble();

       double resultado_segundo_bimestre = (nota_1_bimestre_2 + nota_2_bimestre_2) / 2;
       System.out.println("-------------------------------------------");
       System.out.printf("A media do Segundo Semestre foi de %.1f", resultado_segundo_bimestre);
       System.out.println("\n-------------------------------------------");

       // ---------------------------------------------------------------------------

       double resultado_media_final = (resultado_primeiro_bimestre + resultado_segundo_bimestre) / 2;

       System.out.println("-------------------------------------------");
       System.out.printf("O resultado da sua media final foi de %.1f", resultado_media_final);
       System.out.println("\n-------------------------------------------");
    }
}
