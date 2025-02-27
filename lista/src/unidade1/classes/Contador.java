package unidade1.classes;

public class Contador {
    private int valor;

    public Contador(){
        this.valor = 0;
    }

    public void zerar(){
        this.valor = 0;
    }

    public void incrementar(){
        this.valor++;
    }

    public String print(){
        return Integer.toString(this.valor);
    }
}
