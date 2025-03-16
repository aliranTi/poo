package unidade2.classes;

public class Politico extends Pessoa {
    private String partido;

    public Politico(String nome, String cpf, String partido) {
        super(nome, cpf);
        this.partido = partido;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPartido: " + partido;
    }
}
