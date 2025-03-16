package unidade2.classes;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double valor) {
        salario += valor;
    }

    public double ganhoAnual() {
        return salario * 13;
    }

    public String getNome() {
        return nome;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + "\nSalário: " + this.salario;
    }
}
