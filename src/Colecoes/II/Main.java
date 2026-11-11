package Colecoes.II;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main(String[] args) {
        Map<Integer, String> alunos = new HashMap<>();
        alunos.put(101, "Ana");
        alunos.put(102, "Bruno");
        alunos.put(103, "Carlos");

        System.out.println("Código 102: "+alunos.get(102));
        alunos.put(102, "Beatriz");
        System.out.println("Código 102: "+alunos.get(102));

        System.out.println("Quantidade: "+alunos.size());
    }

}
