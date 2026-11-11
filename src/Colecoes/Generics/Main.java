package Colecoes.Generics;

import Interface.InterfacesMultiplas.Impressora;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Impressao ip = new Impressao();

        System.out.println("Quantos valores deseja informar: ");
        int n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Informe o valor: ");
            int num = entrada.nextInt();
            ip.adicionar(num);
        }

        ip.imprimir();

        System.out.println("O primeiro elemento é: "+ip.primeiroElemento());

        entrada.close();
    }
}
