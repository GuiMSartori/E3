package ufsc.ine5404.pedido;

public class Pagamento {

    private String data;
    private Pedido pedido;
    private Cliente cliente;

    public String getDados() {
        return "Cliente:" + cliente.dados() + "\n\nData " + data + "\nValor Total do Pedido: R$" + pedido.valorTotal();
    }
}
