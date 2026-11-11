package Colecoes.I;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        String [] nomes = new String[3];
        nomes [0] = "Ana";
        nomes [1] = "Bia";
        nomes [2] = "Carlos";

        ArrayList<String> aluno = new ArrayList<>();
        aluno.add("Ana"); //add adiciona na ultima posição
        aluno.add("Bia");
        aluno.add("Carlos");
        aluno.set(1,"Abigail"); //insere um valor no lugar do item do indice 1, substitui basicamente


        for (String a: aluno) {
            System.out.println(a);
        }



    }
}
