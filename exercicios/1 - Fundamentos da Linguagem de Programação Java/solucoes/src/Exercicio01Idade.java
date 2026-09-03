import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio01Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, informe o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Informe o seu ano de nascimento:");
        int anoNascimento = scanner.nextInt();

        int idade = LocalDate.now().getYear() - anoNascimento;
        System.out.printf("Olá, %s! Você tem ou completará %d anos neste ano.%n", nome, idade);

        scanner.close();
    }
}

