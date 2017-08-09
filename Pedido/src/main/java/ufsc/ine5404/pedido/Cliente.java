package ufsc.ine5404.pedido;

public class Cliente {

    private String nome, endereco;
    private int CPF;

    public String dados() {
        return nome + ", " + ", " + CPF + ", " + endereco;
    }
}
