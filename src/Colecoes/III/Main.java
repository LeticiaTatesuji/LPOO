package Colecoes.III;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Cliente> cliente = new ArrayList<>();

        cliente.add(new Cliente("Ana", 5000));
        cliente.add(new Cliente("Bia", 4000));
        cliente.add(new Cliente("Cris", 8000));

        Cliente maiorSalario = null; //null não guarda nenhuma informação
        for (Cliente cl : cliente) {
            System.out.printf(
                    "%s - R$%.2f%n",
                    cl.getNome(),
                    cl.getSalario()
            );
            if (maiorSalario == null || cl.getSalario() > maiorSalario.getSalario()) {
                maiorSalario = cl;

            }
        }

        System.out.println("==========================");
        System.out.printf(
                "%s - R$%.2f%n",
                maiorSalario.getNome(),
                maiorSalario.getSalario()
        );
    }

}
