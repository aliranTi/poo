package unidade2.classes;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> entradaEmAgendas;

    public Agenda(){
        entradaEmAgendas = new ArrayList<>();
    }

    public void adicionar(int dia, int mes, int ano, String assunto, String hora){
        EntradaEmAgenda entrada = new EntradaEmAgenda(dia, mes, ano, assunto, hora);
        this.entradaEmAgendas.add(entrada);
    }

    public void listaDia(int dia, int mes, int ano){
        for (EntradaEmAgenda compromissoAgenda : this.entradaEmAgendas) {
            if(compromissoAgenda.ehNoDia(dia, mes, ano)){
                System.out.println(compromissoAgenda);
            }
        }
    }
}
