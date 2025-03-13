package unidade2.classes;

public class EntradaEmAgenda {
    private int dia;
    private int mes;
    private int ano;
    private String assunto;
    private String hora;

    public EntradaEmAgenda(int dia, int mes, int ano, String assunto, String hora){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
        this.hora = hora;
    }

    @Override
    public String toString(){
        return this.hora + " - " + this.dia + "/" + this.mes + "/" + this.ano + " - " + this.assunto;
    }

    public boolean ehNoDia(int dia, int mes, int ano){
        return (this.dia == dia && this.mes == mes && this.ano == ano);
    }

}
