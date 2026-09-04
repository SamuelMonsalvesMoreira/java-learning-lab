import java.util.Scanner;

public class Imc {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu peso (em kg):");
        double peso = scanner.nextDouble();

        System.out.println("Informe sua altura (em metros):");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc <= 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Classificação: Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Classificação: Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Classificação: Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Classificação: Obesidade Grau II (Severa)");
        } else {
            System.out.println("Classificação: Obesidade Grau III (Mórbida)");
        }
    }
}
