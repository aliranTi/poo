package unidade2.classes;

public class DataHora {
    private String hora;
    private String data;

    public DataHora(String hora, String data) {
        this.hora = hora;
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataHora [data=" + data + ", hora=" + hora + "]";
    }
}
