package ufsc.ine5404.pedido;

public class Pagamento {

    private String data;
    private Pedido pedido;
    private Cliente cliente;

    String getDados() {
        return "Cliente:" + cliente.getDados() + "\n\nData " + data + "\nValor Total do Pedido: R$" + pedido.getValorTotal();
    }
}
