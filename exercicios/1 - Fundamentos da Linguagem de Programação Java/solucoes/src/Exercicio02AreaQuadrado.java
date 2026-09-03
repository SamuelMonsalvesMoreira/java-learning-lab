import java.util.Scanner;

public class Exercicio02AreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho do lado do quadrado:");
        double lado = scanner.nextDouble();

        double area = lado * lado;
        System.out.printf("A área do quadrado é %.2f.%n", area);

        scanner.close();
    }
}

