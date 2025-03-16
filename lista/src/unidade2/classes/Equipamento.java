package unidade2.classes;

public class Equipamento {
    private String nome;
    private double preco;

    public Equipamento(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Nome: " + nome + "\n";
        s += "Preço: " + preco + "\n";
        return s;
    }
}
