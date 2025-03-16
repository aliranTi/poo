package unidade2.classes;

public class EventoHeranca extends DataHora {
    private String descricao;

    public EventoHeranca(String data, String hora, String descricao) {
        super(hora, data);
        this.descricao = descricao;
    }

}
