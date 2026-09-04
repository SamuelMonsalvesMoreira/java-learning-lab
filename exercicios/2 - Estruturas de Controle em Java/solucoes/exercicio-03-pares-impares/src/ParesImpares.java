import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro positivo: ");
        int num1 = scanner.nextInt();

        System.out.print("Informe um segundo número maior que o primeiro: ");
        int num2 = scanner.nextInt();

        if (num2 <= num1) {
            System.out.println("O segundo número deve ser maior que o primeiro.");
            scanner.close();
            return;
        }

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Números pares");
        System.out.println("2 - Números ímpares");
        int opcao = scanner.nextInt();

        if (opcao != 1 && opcao != 2) {
            System.out.println("Opção inválida.");
            scanner.close();
            return;
        }

        for (int numero = num2; numero >= num1; numero--) {
            boolean numeroPar = numero % 2 == 0;

            if (opcao == 1 && numeroPar) {
                System.out.println(numero);
            } else if (opcao == 2 && !numeroPar) {
                System.out.println(numero);
            }
        }

        scanner.close();
    }
}