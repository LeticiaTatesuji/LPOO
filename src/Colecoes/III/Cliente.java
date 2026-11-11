package Colecoes.III;

public class Cliente {
    private String nome;
    private double salario;

    public Cliente(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
