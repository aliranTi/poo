package unidade2.classes;

// Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina da
// Ufersa. Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula,
// nome, 2 notas de prova (P1 e P2) e 1 nota de trabalho (T). Escreva os seguintes métodos
// para esta classe:
// • media: calcula a média parcial do aluno (MP)
// – cada prova tem peso 2, 5 e o trabalho tem peso 2 (MP =
// 2,5×P1+2,5×P2+2×T
// 7
// )
// • provaF inal: calcula quanto o aluno precisa para o exame final (EF)
// – retorna zero se o aluno não necessita realizar o exame final (MP < 3 ou MP >=
// 7)
// – média final MF = (MP × 6 + EF × 4)/10
// – é necessário que MF seja maior ou igual a 5 para que o aluno seja aprovado
// após realizar o exame final
// Escreva um aplicativo de teste que demonstre as capacidades da classe criada.

public class Aluno{
    String matricula;
    String nome;
    float p1, p2, t;

    public Aluno(String matricula, String nome, float p1, float p2, float t){
        this.matricula = matricula;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.t = t;
    }

    public float media(){
        return ((2.5f * p1) + (2.5f * p2) + (2 * t)) / 7;
    }

    public float provaFinal(){
        if(this.media() < 3 && this.media() >= 7){
            return 0;
        }
        return (50 - (this.media() * 6)) / 4;
        
    }

    public void resumo(){
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Prova 1: " + p1);
        System.out.println("Prova 2: " + p2);
        System.out.println("Trabalho: " + t);
        if (this.provaFinal() == 0){
            System.out.println("Média: " + this.media());
        } else {
            System.out.println("Média: " + this.media());
            System.out.println("Prova final: " + this.provaFinal());
        }
    }
}