package unidade3.classes;

public class Funcionario{
    private String nome;
    private double valorHora;
    private double horasTrabalhadas;

    public Funcionario(String nome, double valorHora){
        this.nome = nome;
        this.valorHora = valorHora;
    }

    public Funcionario(String nome){
        this.nome = nome;
        this.valorHora = 2;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularSalario(){
        return valorHora * horasTrabalhadas;
    }

    public String getNome(){
        return nome;
    }

    public double getValorHora(){
        return valorHora;
    }

    public double getHorasTrabalhadas(){
        return horasTrabalhadas;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setValorHora(double valorHora){
        this.valorHora = valorHora;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "\nValor Hora: " + valorHora + "\nHoras Trabalhadas: " + horasTrabalhadas;
    }


}