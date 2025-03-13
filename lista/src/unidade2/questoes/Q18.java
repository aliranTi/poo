package unidade2.questoes;

import unidade2.classes.Matriz;

public class Q18 {
    public static void main(String[] args) {
        Matriz m1 = new Matriz(1, 2, 3, 4);
        Matriz m2 = new Matriz(4, 3, 2, 1);

        System.out.println(m1.det());
        System.out.println(m2.det());

        System.out.println(m1);
        System.out.println(m2);
    }
}
