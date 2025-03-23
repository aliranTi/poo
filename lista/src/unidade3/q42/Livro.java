package unidade3.q42;

@SuppressWarnings("FieldMayBeFinal")
public abstract class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int anoDePublicacao;

    public Livro(String titulo, String autor, int numeroDePaginas, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String qualTitulo() {
        return this.titulo;
    }

    public String qualAutor() {
        return this.autor;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", autor=" + autor + ", numeroDePaginas=" + numeroDePaginas
                + ", anoDePublicacao=" + anoDePublicacao;
    }
}
