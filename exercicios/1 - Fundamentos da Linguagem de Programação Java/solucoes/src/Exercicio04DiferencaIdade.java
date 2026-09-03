import java.util.Scanner;

public class Exercicio04DiferencaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o nome da primeira pessoa?");
        String primeiroNome = scanner.nextLine();

        System.out.println("Qual é a idade da primeira pessoa?");
        int primeiraIdade = Integer.parseInt(scanner.nextLine());

        System.out.println("Qual é o nome da segunda pessoa?");
        String segundoNome = scanner.nextLine();

        System.out.println("Qual é a idade da segunda pessoa?");
        int segundaIdade = Integer.parseInt(scanner.nextLine());

        int diferencaDeIdade = Math.abs(primeiraIdade - segundaIdade);
        System.out.printf(
                "A diferença de idade entre %s e %s é de %d anos.%n",
                primeiroNome,
                segundoNome,
                diferencaDeIdade
        );

        scanner.close();
    }
}

