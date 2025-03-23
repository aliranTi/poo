package unidade3.q61;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        String[] c = "HELLO THERE".split("");
        for (String string : c) {
            if (map.containsKey(string.charAt(0))) {
                map.put(string.charAt(0), map.get(string.charAt(0)) + 1);
            } else {
                map.put(string.charAt(0), 1);
            }
        }

        System.out.println(map);

    }
}
