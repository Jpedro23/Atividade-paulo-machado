import java.util.Scanner;

public class exemplo02 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu primeiro numero");
        int numero3 = input.nextInt();

        System.out.println("Digite o seu primeiro numero");
        int numero4 = input.nextInt();

        int resultado_1 = numero3 + numero4;

        System.out.println("------------------------------------------------------------------------");
        System.out.println("O resultado Do primeiro conjunto de numeros é " + resultado_1);
        System.out.println("------------------------------------------------------------------------\n");

        System.out.println("Digite o seu primeiro numero");
        int numero5 = input.nextInt();

        System.out.println("Digite o seu primeiro numero");
        int numero6 = input.nextInt();

        int resultado_2 = numero3 + numero4;

        System.out.println("------------------------------------------------------------------------");
        System.out.println("O resultado Do primeiro conjunto de numeros é " + resultado_2);
        System.out.println("------------------------------------------------------------------------\n");
    }
}
