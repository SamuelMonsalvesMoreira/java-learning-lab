import java.util.Scanner;

public  class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PetMachine machine = new PetMachine();



     var opcao = -1;
     do{
         System.out.println("===Escolha uma das opções===");
         System.out.println("1 - Dar banho no pet");
         System.out.println("2 - Abastecer a máquina com água ");
         System.out.println("3 - Abastecer a máquina com shampoo ");
         System.out.println("4 - Verifica água da máquina ");
         System.out.println("5 - Verifica shampoo da máquina ");
         System.out.println("6 - Verifica se tem pet da máquina ");
         System.out.println("7 - Colocar pet na máquina ");
         System.out.println("8 - Retirar pet da máquina ");
         System.out.println("9 - Limpar a máquina ");
         System.out.println("0 - Sair");
         opcao = scanner.nextInt();

         switch (opcao) {
                case  1:
                    machine.darBanho();
                    break;
                case 2:
                    machine.abastecerAgua();
                    break;
                case 3:
                    machine.abastecerShampoo();
                    break;
                case 4:
                    machine.verificaNivelAgua();
                    break;
                case 5:
                    machine.verificaNivelShampoo();
                    break;
                case 6:

                    machine.verificaPetNaMaquina();

                    break;
                case 7:
                    scanner.nextLine();

                    System.out.println("Digite o nome do pet: ");
                    String nomePet = scanner.nextLine();

                    Pet novoPet = new Pet(nomePet);
                    machine.colocarPet(novoPet);
                    break;
                case 8:
                    machine.retirarPet();
                    break;
                case 9:
                    machine.limparMaquina();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
         }
     }while (opcao !=0);

     scanner.close();

    }
}