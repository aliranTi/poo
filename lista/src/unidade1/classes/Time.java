package unidade1.classes;

// Escreva uma classe para representar um time de um esporte qualquer em um campeonato desse esporte. 
// Que atributos devem ser representados nessa classe? Quais métodos ela deve conter? 
// Escreva um aplicativo de teste que demonstre as capacidades da
// classe criada.

public class Time {
    String nome;
    String divisao;
    int pontos;
    int vitorias;
    int empates;
    int derrotas;
    int golsPro;
    int golsContra;
    int partidas;

    public Time(String nome, String divisao){
        this.nome = nome;
        this.divisao = divisao;
        this.pontos = 0;
        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;
        this.golsPro = 0;
        this.golsContra = 0;
        this.partidas = 0;
    }

    public void registrarJogo(int golsPro, int golsContra){
        if(golsPro > golsContra){
            registrarVitoria(golsPro, golsContra);
        } else if(golsPro == golsContra){
            registrarEmpate(golsPro);
        } else {
            registrarDerrota(golsPro, golsContra);
        }
    }

    public void registrarVitoria(int golsPro, int golsContra){
        this.pontos += 3;
        this.partidas++;
        this.vitorias++;
        this.golsPro += golsPro;
        this.golsContra += golsContra;
    }

    public void registrarEmpate(int gols){
        this.pontos += 1;
        this.partidas++;
        this.empates++;
        this.golsPro += gols;
        this.golsContra += gols;
    }

    public void registrarDerrota(int golsPro, int golsContra){
        this.partidas++;
        this.derrotas++;
        this.golsPro += golsPro;
        this.golsContra += golsContra;
    }

    public void mostrarTime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Divisão: " + this.divisao);
        System.out.println("Pontos: " + this.pontos);
        System.out.println("Vitórias: " + this.vitorias);
        System.out.println("Empates: " + this.empates);
        System.out.println("Derrotas: " + this.derrotas);
        System.out.println("Gols Pró: " + this.golsPro);
        System.out.println("Gols Contra: " + this.golsContra);
        System.out.println("Partidas: " + this.partidas);
        System.out.println();
    }
}