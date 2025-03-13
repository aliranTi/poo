package unidade2.questoes;

import unidade2.classes.Agenda;

public class Q17 {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionar(8,2,2005,"Aniversario","08:00");
        agenda.adicionar(7, 3, 2005, "casamento", "19:00");
        agenda.listaDia(8, 2, 2005);
    }
}
