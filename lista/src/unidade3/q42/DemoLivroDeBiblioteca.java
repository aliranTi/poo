package unidade3.q42;

public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca("O Senhor dos Anéis", "J. R. R. Tolkien", 1000, 1954, "A1", "Livro de fantasia");
        System.out.println(livro.localizacao());
        System.out.println(livro.descricao());
        System.out.println(livro.estaEmprestado());
        livro.empresta();
        System.out.println(livro.estaEmprestado());
        livro.devolve();
        System.out.println(livro.estaEmprestado());
        System.out.println(livro);
    }
}
