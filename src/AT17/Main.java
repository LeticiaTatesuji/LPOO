package AT17;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Aninha";
        nomes[1] = "Gabriel";
        nomes[2] = "Letícia";

        System.out.println("=== ARRAY SIMPLES DE STRING ===");
        for (String a : nomes) {
            System.out.println(a);
        }

        List<String> alunos = new ArrayList<>();
        alunos.add("Mariana");
        alunos.add("Maria");
        alunos.add("Emily");

        System.out.println("=== LIST IMPLEMENTADO POR ARRAYLIST ===");
        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        alunos.add("João");

        System.out.println("=== ADD O 4º ALUNO ===");
        for (String aa : alunos) {
            System.out.println(aa);
        }

        System.out.println("Quantidade de alunos: " + alunos.size());

        String temp = alunos.get(1);
        alunos.set(1, alunos.get(3));
        alunos.set(3, temp);

        System.out.println("\n=== APÓS TROCAR A 2ª E A 4ª POSIÇÃO ===");
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
