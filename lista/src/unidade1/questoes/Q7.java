package unidade1.questoes;

import unidade1.classes.Contador;

public class Q7 {
    public static void main(String[] args) {
        Contador contador = new Contador();
        contador.incrementar();
        contador.incrementar();
        contador.incrementar();
        contador.incrementar();
        System.out.println(contador.print());
        contador.zerar();
        System.out.println(contador.print());

                                               
    }
}
