package unidade1.questoes;

import unidade1.classes.RegistroAcademico;

public class Q11 {
    public static void main(String[] args) {
        RegistroAcademico ra = new RegistroAcademico("João", 1, 0.5);
        System.out.println(ra);
        System.out.println("Mensalidade: " + ra.calculaMensalidade());

        RegistroAcademico ra2 = new RegistroAcademico("Maria", 2, 0.3);
        System.out.println(ra2);
        System.out.println("Mensalidade: " + ra2.calculaMensalidade());

        RegistroAcademico ra3 = new RegistroAcademico("José", 3, 0.7);
        System.out.println(ra3);
        System.out.println("Mensalidade: " + ra3.calculaMensalidade());

    }
}
