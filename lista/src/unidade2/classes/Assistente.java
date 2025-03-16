package unidade2.classes;

public class Assistente extends Funcionario {
    private int matricula;

    public Assistente(String nome, double salario, int matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMatrícula: " + this.matricula;
    }
}
