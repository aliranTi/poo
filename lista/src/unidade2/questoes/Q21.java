package unidade2.questoes;

import java.util.Random;

public class Q21 {
    public static void main(String[] args) {
        Random dado1 = new Random();
        Random dado2 = new Random();
        int contagem[] = new int[11];
        for (int i = 0; i < 36000000; i++) {
            contagem[dado1.nextInt(6) + dado2.nextInt(6)]++;
        }
        System.out.println("Quantidade de vezes que cada soma foi obtida:");
        for (int i = 2; i <= 12; i++) {
            System.out.println(i + ": " + contagem[i - 2]);
        }
    }
}
