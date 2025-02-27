package unidade2.questoes;

import unidade2.classes.Lampada;

public class Q8 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.acende();
        lampada.acende();
        lampada.apaga();
        lampada.acende();
        lampada.apaga();
        lampada.acende();
        lampada.mostraEstado();
        lampada.apaga();
        lampada.mostraEstado();
    }
}
