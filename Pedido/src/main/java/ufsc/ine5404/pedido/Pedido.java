package ufsc.ine5404.pedido;

public class Pedido {

    private int quantidade, numeroSerie;
    private double valorUnitario;
    private String descricao;

    Pedido(int quantidade, int numeroSerie, double valorUnitario, String descricao) {
        this.quantidade = quantidade;
        this.numeroSerie = numeroSerie;
        this.valorUnitario = valorUnitario;
        this.descricao = descricao;
    }

    double getValorTotal() {
        return valorUnitario * quantidade;
    }

}
