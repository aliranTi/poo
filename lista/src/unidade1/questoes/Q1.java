package unidade1.questoes;

import unidade1.classes.Time;

public class Q1 {
    public static void main(String[] args) {
        Time flamengo = new Time("Flamengo", "Serie A");
        Time vasco = new Time("Vasco", "Serie B");
        Time botafogo = new Time("Botafogo", "Serie C");
        Time fluminense = new Time("Fluminense", "Serie D");

        flamengo.registrarJogo(3, 1);
        vasco.registrarJogo(1, 3);
        botafogo.registrarJogo(2, 2);
        fluminense.registrarJogo(2, 2);

        System.out.println(flamengo);
        System.out.println(vasco);
        System.out.println(botafogo);
        System.out.println(fluminense);
    }
}