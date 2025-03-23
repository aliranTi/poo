package unidade3.q60;

import java.util.Arrays;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'));
        list.addAll(list);

        LinkedList<Character> inversa = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            inversa.add(list.get(i));
        }

    }
}
