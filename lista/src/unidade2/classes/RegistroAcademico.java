package unidade2.classes;

public class RegistroAcademico {
    private String nome;
    private String matricula;
    private int codigoCurso;
    private double percentualDeCobranca;

    private static int numeroDeMatriculas = 0;

    public RegistroAcademico(String n, int cod, double perc) {
        this.nome = n;
        this.matricula = String.valueOf(++numeroDeMatriculas);
        this.codigoCurso = cod;
        this.percentualDeCobranca = perc;
    }

    public double calculaMensalidade() {
        return 100 * codigoCurso * percentualDeCobranca;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nMatrícula: " + matricula + "\nCódigo do curso: " + codigoCurso
                + "\nPercentual de cobrança: " + percentualDeCobranca;
    }


}
