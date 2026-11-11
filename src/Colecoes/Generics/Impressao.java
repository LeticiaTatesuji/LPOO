package Colecoes.Generics;

import java.util.ArrayList;
import java.util.List;

public class Impressao {
    private List<Integer> lista = new ArrayList<>();

    public void adicionar (Integer valor) {
        lista.add(valor);
    }

    public Integer primeiroElemento () {
        if (lista.isEmpty()) {
            throw new IllegalStateException("Lista vazia.");
        }
        return lista.get(0);
    }

    public void imprimir () {
        System.out.println("NÚMEROS DA LISTA: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

}
