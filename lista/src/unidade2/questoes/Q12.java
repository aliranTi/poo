package unidade2.questoes;

import unidade2.classes.Generico;

public class Q12 {
    public static void main(String[] args) {
        Generico<Integer> g = new Generico<>(1, 1, 1);
        g.imprime();
        g.ehIgual();

        Generico<String> g2 = new Generico<>("a", "a", "a");
        g2.imprime();
        g2.ehIgual();
    }
}
