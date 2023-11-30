import java.util.ArrayList;
import java.util.Date;

class Pedido {
    private int numeroPedido;
    private Date dataHoraPedido;
    private double precoTotal;
    private int statusPedido;
    private ArrayList<PedidoItem> itensPedido;

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = new Date();
        this.precoTotal = 0.0;
        this.statusPedido = 1;
        this.itensPedido = new ArrayList<>();
    }

    // Getters e Setters

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getDataHoraPedido() {
        return dataHoraPedido;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }

    // Método para consultar pedido
    public boolean consultarPedido(Pedido pedido) {
        return this.numeroPedido == pedido.getNumeroPedido();
    }

    // Método para inserir itens no pedido
    public void inserirItensPedido(PedidoItem item) {
        itensPedido.add(item);
        // Atualizar estoque e calcular preço total aqui
    }

    // Método para excluir itens do pedido
    public void excluirItensPedido(PedidoItem item) {
        itensPedido.remove(item);
        // Atualizar estoque e calcular preço total aqui
    }

    // Método para calcular o total a pagar
    public void calculaTotalPagar() {
        double total = 0.0;
        for (PedidoItem item : itensPedido) {
            total += item.getValorTotal();
        }
        this.precoTotal = total;
    }

    public ArrayList<PedidoItem> getItensPedido() {
        return itensPedido;
    }
}