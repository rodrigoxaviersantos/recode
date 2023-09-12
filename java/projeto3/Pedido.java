package projeto3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private Date dataPedido;
    private List<ItemPedido> itens;

    public Pedido(int numeroPedido, Date dataPedido) {
        this.numeroPedido = numeroPedido;
        this.dataPedido = dataPedido;
        this.itens = new ArrayList<>();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getTotal();
        }
        return total;
    }
}

