package unidade2.classes;

public class Prefeito extends Politico{
    private String cidade;

    public Prefeito(String nome, String cpf, String partido, String cidade) {
        super(nome, cpf, partido);
        this.cidade = cidade;
    }

    @Override
    public String toString(){
        return super.toString() + "\nCidade: " + cidade;
    }
}
