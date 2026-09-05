public class PetMachine {

    private int quantidadeAgua;
    private int quantidadeShampoo;
    private Pet pet;
    private boolean maquinaSuja;

    public PetMachine() {
        this.quantidadeAgua = 30;
        this.quantidadeShampoo = 10;
        this.pet = null;
        this.maquinaSuja = false;
    }

    public void colocarPet(Pet novoPet) {
        if (this.pet != null) {
            System.out.println(
                    "Já existe um pet na máquina."
            );
            return;
        }

        if (this.maquinaSuja) {
            System.out.println(
                    "A máquina está suja e precisa ser limpa."
            );
            return;
        }

        this.pet = novoPet;

        System.out.println(
                "Pet " + this.pet.getNomePet() +
                        " colocado na máquina."
        );
    }

    public void retirarPet() {
        if (this.pet == null) {
            System.out.println("Não há um pet na máquina para retirar.");
            return;
        }

        if (this.pet.isSujo()) {
            this.maquinaSuja = true;
            System.out.println(
                    "O Pet está sujo. A máquina precisará ser limpa."
            );
        }

        System.out.println(
                "Retirando o pet " + this.pet.getNomePet() + " da máquina."
        );

        this.pet = null;
    }

    public void darBanho() {
        if (this.pet == null) {
            System.out.println("Não há um pet na máquina para dar banho.");
            return;
        }

        if (!this.pet.isSujo()) {
            System.out.println("O pet já está limpo.");
            return;
        }

        if (this.quantidadeAgua < 10) {
            System.out.println("Não há água suficiente para o banho.");
            return;
        }

        if (this.quantidadeShampoo < 2) {
            System.out.println("Não há shampoo suficiente para o banho.");
            return;
        }

        this.quantidadeAgua -= 10;
        this.quantidadeShampoo -= 2;
        this.pet.ficarLimpo();

        System.out.println(
                "Banho do pet " + this.pet.getNomePet() +
                        " concluído."
        );
    }

    public void limparMaquina() {
        if (this.pet != null) {
            System.out.println(
                    "Não é possível limpar a máquina com um pet dentro."
            );
            return;
        }

        if (!this.maquinaSuja) {
            System.out.println("A máquina já está limpa.");
            return;
        }

        if (this.quantidadeAgua < 3 ||
                this.quantidadeShampoo < 1) {
            System.out.println(
                    "Não há água ou shampoo suficiente para limpar a máquina."
            );
            return;
        }

        System.out.println("Limpando a máquina...");

        this.quantidadeAgua -= 3;
        this.quantidadeShampoo -= 1;
        this.maquinaSuja = false;

        System.out.println("Máquina limpa com sucesso.");
    }

    public void abastecerAgua(){
        if (this.quantidadeAgua + 2 <= 30) {
            this.quantidadeAgua += 2;
            System.out.println("Máquina abastecida com água.");
        } else {
            System.out.println("O reservatório de água já está cheio.");
        }
    }

    public void abastecerShampoo(){
        if(this.quantidadeShampoo + 2 <= 10) {
            this.quantidadeShampoo += 2;

            System.out.println("Máquina abastecida com shampoo.");
        }else {
            System.out.println("O reservatório de shampoo já está cheio.");
        }
    }

    public void verificaNivelAgua(){
        if (this.quantidadeAgua == 30) {
            System.out.println("Nível de água está no máximo: ");
        } else if (this.quantidadeAgua > 0) {
            System.out.println("Nível de água: " + this.quantidadeAgua);
        } else {
            System.out.println("A máquina está sem água.");
        }
    }
    public void verificaNivelShampoo(){
        if (this.quantidadeShampoo == 10) {
            System.out.println("Nível de shampoo está no máximo ");
        } else if (this.quantidadeShampoo > 0) {
            System.out.println("Nível de shampoo: " + this.quantidadeShampoo);
        } else {
            System.out.println("A máquina está sem shampoo.");
        }
    }

    public void verificaPetNaMaquina(){
        if(this.pet != null) {
            System.out.println("Sim, o pet " + this.pet.getNomePet() + " está na máquina.");
        } else {
            System.out.println("Não há um pet na máquina.");
        }
    }
}