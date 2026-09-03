import java.util.Scanner;

public class Exercicio03AreaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a base do retângulo:");
        double base = scanner.nextDouble();

        System.out.println("Informe a altura do retângulo:");
        double altura = scanner.nextDouble();

        double area = base * altura;
        System.out.printf("A área do retângulo é %.2f.%n", area);

        scanner.close();
    }
}

