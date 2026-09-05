import java.util.Scanner;

public  class Main{
    public static void main(String[] argumentos) {

        Scanner leitor = new Scanner(System.in);
        PetMachine maquina = new PetMachine();



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
         opcao = leitor.nextInt();

         switch (opcao) {
                case  1:
                    maquina.darBanho();
                    break;
                case 2:
                    maquina.abastecerAgua();
                    break;
                case 3:
                    maquina.abastecerShampoo();
                    break;
                case 4:
                    maquina.verificarNivelAgua();
                    break;
                case 5:
                    maquina.verificarNivelShampoo();
                    break;
                case 6:

                    maquina.verificarPetNaMaquina();

                    break;
                case 7:
                    leitor.nextLine();

                    System.out.println("Digite o nome do pet: ");
                    String nomePet = leitor.nextLine();

                    Pet novoPet = new Pet(nomePet);
                    maquina.colocarPet(novoPet);
                    break;
                case 8:
                    maquina.retirarPet();
                    break;
                case 9:
                    maquina.limparMaquina();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
         }
     }while (opcao !=0);

     leitor.close();

    }
}
