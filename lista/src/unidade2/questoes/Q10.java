package unidade2.questoes; 

import unidade2.classes.Comparador;

public class Q10 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4, e = 5;
        double x = 1.1, y = 2.2, z = 3.3, w = 4.4, v = 5.5;
        System.out.println("Maior de 2 inteiros (" + a + ", " + b + ") : " + Comparador.maiorInt(a, b));
        System.out.println("Maior de 3 inteiros (" + a + ", " + b + ", " + c + ") : " + Comparador.maiorInt(a, b, c));
        System.out.println("Maior de 4 inteiros (" + a + ", " + b + ", " + c + ", " + d + ")" + Comparador.maiorInt(a, b, c, d));
        System.out.println("Maior de 5 inteiros (" + a + ", " + b + ", " + c + ", " + d + ", " + e + ")" + Comparador.maiorInt(a, b, c, d, e));

        System.out.println("Maior de 2 doubles (" + x + ", " + y + ")" + Comparador.maiorDouble(x, y));
        System.out.println("Maior de 3 doubles (" + x + ", " + y + ", " + z + ")" + Comparador.maiorDouble(x, y, z));
        System.out.println("Maior de 4 doubles (" + x + ", " + y + ", " + z + ", " + w + ")" + Comparador.maiorDouble(x, y, z, w));
        System.out.println("Maior de 5 doubles (" + x + ", " + y + ", " + z + ", " + w + ", " + v + ")" + Comparador.maiorDouble(x, y, z, w, v));



    }
}           