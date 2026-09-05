
public class Pet  {

    private String nomePet;
    private boolean estaSujo;

    public Pet(String nome) {
        this.nomePet = nome;
        this.estaSujo = true;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void ficarLimpo() {
        this.estaSujo = false;
    }

    public boolean isSujo() {
        return this.estaSujo;
    }
}
