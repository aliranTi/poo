package unidade3.q42;

public interface ItemDeBiblioteca {
    public int MAXIMO_DIAS_DE_EMPRESTIMO = 14;


    public boolean estaEmprestado();
    public void empresta();
    public void devolve();
    public String localizacao();
    public String descricao();
}
