package unidade2.questoes;

import java.util.ArrayList;
import java.util.Scanner;

import unidade2.classes.Cliente;

public class Q19 {
    public static void main(String[] args) {
        ArrayList <Cliente> clientes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String nome, telefone;
        int idade, id = 0;
        while(id >= 0){
            System.out.println("\nDigite o Id:");
            id = sc.nextInt();
            if(id<0){
                break;
            }
            sc.nextLine();
            System.out.println("Digite o nome: ");
            nome = sc.nextLine();
            System.out.println("\nDigite a idade: ");
            idade = sc.nextInt();
            sc.nextLine();
            System.out.println("\nDigite o Telefone: ");
            telefone = sc.nextLine();

            clientes.add(new Cliente(Integer.toString(id), nome, idade, telefone));
        }
        sc.close();
    }
}
