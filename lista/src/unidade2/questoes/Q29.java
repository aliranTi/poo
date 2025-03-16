package unidade2.questoes;

import unidade2.classes.*;

public class Q29 {
    public static void main(String[] args) {
        EventoHeranca evento = new EventoHeranca("2021-10-10", "10:00", "Evento de teste");
        System.out.println(evento);
        EventoDelegacao evento2 = new EventoDelegacao("2021-10-10", "10:00", "Evento de teste");   
        System.out.println(evento2);
    }
}
