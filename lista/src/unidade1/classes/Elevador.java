package unidade1.classes;

// Crie uma classe denominada Elevador para armazenar as informações de um elevador
// dentro de um prédio. A classe deve armazenar o número do andar atual, o total de
// andares no prédio, a capacidade do elevador e quantas pessoas estão presentes nele.
// Outras classes não devem ter acesso direto aos atributos de Elevador. A classe deve
// também disponibilizar os seguintes métodos:
// • construtor : que deve receber como parâmetros a capacidade do elevador e o total
// de andares no prédio (um elevador sempre começa no térreo e vazio);
// • entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
// houver espaço);
// • sai : para remover uma pessoa do elevador (só deve remover se houver alguém
// dentro dele);
// • sobe : para subir um andar (não deve subir se já estiver no último andar);
// • desce : para descer um andar (não deve descer se já estiver no térreo).
// Escreva um aplicativo de teste que demonstre as capacidades da classe criada, ou seja,
// execute todos os métodos da classe.

public class Elevador{
    private int andarAtual;
    private final int totalAndares;
    private final int capacidade;
    private int pessoasPresentes;

    public Elevador(int totalAndares, int capacidade){
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.pessoasPresentes = 0;
    }

    public void entra(){
        if(this.capacidade > this.pessoasPresentes)
            this.pessoasPresentes++;
    }

    public void sai(){
        if(this.pessoasPresentes > 0)
            this.pessoasPresentes--;
    }

    public void sobe(){
        if(this.andarAtual < this.totalAndares)
            this.andarAtual++;
    }

    public void desce(){
        if(this.andarAtual > 0)
            this.andarAtual--;
    }

    public int getAndarAtual(){
        return this.andarAtual;
    }

    public int getTotalAndares(){
        return this.totalAndares;
    }

    public int getCapacidade(){
        return this.capacidade;
    }

    public int getPessoasPresentes(){
        return this.pessoasPresentes;
    }
}