import java.util.Scanner;

public class Divisao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número inicial: ");
        int numeroInicial = scanner.nextInt();

        if (numeroInicial == 0) {
            System.out.println("O número inicial não pode ser zero.");
            scanner.close();
            return;
        }

        while (true) {
            System.out.print("Informe outro número: ");
            int numero = scanner.nextInt();

            if (numero < numeroInicial) {
                System.out.println("Número menor que o inicial. Ignorado.");
                continue;
            }

            if (numero % numeroInicial != 0) {
                System.out.println(
                        numero + " dividido por " + numeroInicial +
                                " possui resto diferente de zero."
                );
                break;
            }

            System.out.println(numero + " é divisível por " + numeroInicial);
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}