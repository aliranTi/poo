package unidade2.classes;

public class EventoDelegacao {
    private DataHora dataHora;
    private String descricao;

    public EventoDelegacao(String data, String hora, String descricao) {
        this.dataHora = new DataHora(hora, data);
        this.descricao = descricao;
    }

    @Override
    public String toString(){
        return dataHora + " Descrição: " + descricao;
    }
}
