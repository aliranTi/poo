package unidade3.q41;

import unidade3.q40.*;

public class Main {
    public static void main(String[] args) {
        Desenho desenho1 = new Desenho(new Quadrado(2,3,3), new Circulo(3,3,3));
        desenho1.apresenta();
        System.out.println();
        Desenho desenho2 = new Desenho(new Quadrado(2,3,3), new Triangulo(3, 1, 2, 1));
        desenho2.apresenta();
    }
}
