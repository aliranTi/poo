package unidade2.questoes;

import unidade2.classes.*;

public class Q31 {
    public static void main(String[] args) {
        Prefeito prefeito = new Prefeito("João", "123.456.789-00", "PT", "São Paulo");
        System.out.println(prefeito);

        Governador governador = new Governador("José", "987.654.321-00", "PSDB", "São Paulo");
        System.out.println(governador);
    }
}
