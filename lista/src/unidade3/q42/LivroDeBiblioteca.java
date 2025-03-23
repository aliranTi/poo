package unidade3.q42;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
    private boolean emprestado;
    private String localizacao;
    private String descricao;

    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, int anoDePublicacao, String localizacao, String descricao) {
        super(titulo, autor, numeroDePaginas, anoDePublicacao);
        this.emprestado = false;
        this.localizacao = localizacao;
        this.descricao = descricao;
    }

    @Override
    public boolean estaEmprestado() {
        return this.emprestado;
    }

    @Override
    public void empresta() {
        this.emprestado = true;
    }

    @Override
    public void devolve() {
        this.emprestado = false;
    }

    @Override
    public String localizacao() {
        return this.localizacao;
    }

    @Override
    public String descricao() {
        return this.descricao;
    }

    @Override
    public String toString() {
        return super.toString() + ", emprestado=" + emprestado + ", localizacao=" + localizacao + ", descricao=" + descricao;
    }
    
}
