package ufsc.ine5404.pedido;

public class Cliente {

    private String nome, endereco;
    private int CPF;

    String getDados() {
        return "\nNome: " + nome + "\nCPF: " + CPF + "\nEndereço: " + endereco;
    }
}
