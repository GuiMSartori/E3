package ufsc.ine5404.pedido;

public class Pagamento {

    private String data;
    private Pedido pedido;
    private Cliente cliente;

    public String getDados() {
        return cliente.dados() + ", " + data + ", $" + pedido.valorTotal();
    }
}
