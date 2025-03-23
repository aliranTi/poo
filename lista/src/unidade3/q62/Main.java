package unidade3.q62;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        sc.close();

        Stack<String> pilha = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                pilha.push("(");
            } else if (string.charAt(i) == ')') {
                if (pilha.isEmpty()) {
                    pilha.push(")");
                    break;
                } else {
                    pilha.pop();
                }
            }
        }
        if (pilha.isEmpty()) {
            System.out.println("Correto");
        } else {
            System.out.println("Incorreto");
        }
        
        
    }
}
