package unidade2.questoes;

import unidade2.classes.Elevador;

public class Q6{
    public static void main(String[] args){
        Elevador elevador = new Elevador(10, 5);
        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();

        elevador.sobe();
        elevador.sobe();
        elevador.sai();
        elevador.sobe();
        elevador.desce();
        elevador.desce();
        elevador.desce();
        elevador.sobe();



    }
}