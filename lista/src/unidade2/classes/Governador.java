package unidade2.classes;

public class Governador extends Politico{
    private String estado;

    public Governador(String nome, String cpf, String partido, String estado) {
        super(nome, cpf, partido);
        this.estado = estado;
    }

    @Override
    public String toString(){
        return super.toString() + "\nEstado: " + estado;
    }
}   
