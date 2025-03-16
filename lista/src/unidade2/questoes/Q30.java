package unidade2.questoes;

import unidade2.classes.*;

public class Q30 {
    public static void main(String[] args) {
        Assistente a = new Administrativo("João", 1000, 123, "noite");
        System.out.println(a);

        Tecnico t = new Tecnico("Maria", 1500, 456, 200);
        System.out.println(t);

        Administrativo ad = new Administrativo("José", 2000, 789, "dia");
        System.out.println(ad);


    }
}
