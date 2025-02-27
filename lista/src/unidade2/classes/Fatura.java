package unidade2.classes;

/*Crie uma classe chamada F atura para que uma loja de suprimentos de informática a
utilize para representar uma fatura de um item vendido. Uma Fatura deve incluir as seguintes informações sobre o item vendido: o número de identificação, a descrição, a
quantidade comprada e o preço unitário. Se a quantidade não for positiva, ela deve ser
configurada como 0. Se o preço por item não for positivo, ele deve ser configurado como
0.0. Forneça também um método chamado calculaT otal que calcula e retorna o valor de
fatura (isto é, multiplica a quantidade pelo preço por item). Escreva um aplicativo de teste
que demonstre as capacidades da classe criada.*/

public class Fatura {
    String id;
    String descricao;
    int quantidade;
    float precoUnitario;

    public Fatura(String id, String descricao, int quantidade, float precoUnitario){
        this.id = id;
        this.descricao = descricao;
        if(quantidade < 0){
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
        if(precoUnitario < 0){
            this.precoUnitario = 0;
        } else {
            this.precoUnitario = precoUnitario;
        }
    }

    public float calculaTotal(){
        return quantidade * precoUnitario;
    }

    public void resumo(){
        System.out.println("ID: " + id);
        System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço unitário: " + precoUnitario);
        System.out.println("Total: " + calculaTotal());
        System.out.println();
    }

    
}
