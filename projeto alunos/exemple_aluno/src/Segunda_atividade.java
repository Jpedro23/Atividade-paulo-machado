import java.util.Scanner;

public class Segunda_atividade {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-------------- Sistema de conversão de temperatura do Paulo Machado --------------\n");
        System.out.println("Esses sistema vai converter os valores em (Cº) para (Fº) e para (K)  \n");

        System.out.println("Digite aqui uma temperatura em (Cº) ");
        double temperatura = input.nextDouble();

        double resultado_temperatura_Fahrenheit = (temperatura * (9.0/5.0)) + 32;
        double resultado_temperatura_Kelvin = temperatura + 273.15 ;
        System.out.println("-------------------------------------------");
        System.out.printf("O resultado da temperatura que voce digitou Fahrenheit (Fº) %.1f \n", resultado_temperatura_Fahrenheit);
        System.out.printf("\nO resultado da temperatura que voce digitou Kelvin (K)  %.0f", resultado_temperatura_Kelvin);
        System.out.println("\n-------------------------------------------");
    }
}
