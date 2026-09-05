
public class Pet  {

    private String nome;
    private boolean sujo;

    public Pet(String nome) {
        this.nome = nome;
        this.sujo = true;
    }

    public String obterNome() {
        return nome;
    }

    public void ficarLimpo() {
        this.sujo = false;
    }

    public boolean estaSujo() {
        return this.sujo;
    }
}
