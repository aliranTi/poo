package unidade2.classes;

// Escreva uma classe Lampada que possui o atributo estadoDaLampada (ligado ou desligado) e
// os métodos acende, apaga e mostraEstado (ex.: A lampada esta acesa). Inclua
// um método estaLigada que retorne verdadeiro se a lâmpada estiver ligada e falso caso
// contrário. Adicione um campo que indique quantas vezes a lâmpada foi acesa. Para
// isso, utilize uma instância da classe Contador criada anteriormente e implemente a 
// lógica necessária para atualizar seu valor. Escreva um aplicativo de teste que demonstre
// as capacidades da classe criada.

public class Lampada {
    private boolean estadoDaLampada;
    private final Contador contadorDeAcendimentos;

    public Lampada(){
        this.estadoDaLampada = false;
        this.contadorDeAcendimentos = new Contador();
    }

    public void acende(){
        if (!this.estadoDaLampada){
            this.estadoDaLampada = true;
            this.contadorDeAcendimentos.incrementar();
        }
    }

    public void apaga(){
        if(this.estadoDaLampada)
            this.estadoDaLampada = false;
    }

    public void mostraEstado(){
        if(this.estadoDaLampada)
            System.out.println("A lâmpada está acesa.");
        else
            System.out.println("A lâmpada está apagada.");
        System.out.println("A lâmpada foi acesa " + contadorDeAcendimentos.print() + " vezes.");
    }

}
