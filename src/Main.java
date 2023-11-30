import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // ArrayList de Evento: inserir 5 eventos distintos distintos.
        ArrayList<Evento> eventos = new ArrayList<>();
        eventos.add(new Evento("Evento1", new Date(), 50.0, "Descrição Evento 1", 100, new Categoria("Categoria1")));
        eventos.add(new Evento("Evento2", new Date(), 30.0, "Descrição Evento 2", 150, new Categoria("Categoria2")));
        eventos.add(new Evento("Evento3", new Date(), 40.0, "Descrição Evento 3", 80, new Categoria("Categoria1")));
        eventos.add(new Evento("Evento4", new Date(), 60.0, "Descrição Evento 4", 120, new Categoria("Categoria3")));
        eventos.add(new Evento("Evento5", new Date(), 25.0, "Descrição Evento 5", 200, new Categoria("Categoria2")));

        // ArrayList de Pedido: inserir 2 pedidos com 3 respectivos itens cada.
        Pedido pedido1 = new Pedido(1);
        Pedido pedido2 = new Pedido(2);

        PedidoItem item1 = new PedidoItem("Evento1", 2,        20.0);
        PedidoItem item2 = new PedidoItem("Evento2", 1, 15.0);
        PedidoItem item3 = new PedidoItem("Evento3", 3, 10.0);

        PedidoItem item4 = new PedidoItem("Evento4", 1, 25.0);
        PedidoItem item5 = new PedidoItem("Evento5", 2, 18.0);
        PedidoItem item6 = new PedidoItem("Evento1", 2, 12.0);

        // Validando as condições descritas
        if (eventos.stream().anyMatch(evento -> evento.getNomeEvento().equals(item1.getNomeEvento()))) {
            if (item1.atualizaEstoqueIngresso(eventos.get(0))) {
                pedido1.inserirItensPedido(item1);
            }
        }

        if (eventos.stream().anyMatch(evento -> evento.getNomeEvento().equals(item2.getNomeEvento()))) {
            if (item2.atualizaEstoqueIngresso(eventos.get(1))) {
                pedido1.inserirItensPedido(item2);
            }
        }

        if (eventos.stream().anyMatch(evento -> evento.getNomeEvento().equals(item3.getNomeEvento()))) {
            if (item3.atualizaEstoqueIngresso(eventos.get(2))) {
                pedido1.inserirItensPedido(item3);
            }
        }

        if (eventos.stream().anyMatch(evento -> evento.getNomeEvento().equals(item4.getNomeEvento()))) {
            if (item4.atualizaEstoqueIngresso(eventos.get(3))) {
                pedido2.inserirItensPedido(item4);
            }
        }

        if (eventos.stream().anyMatch(evento -> evento.getNomeEvento().equals(item5.getNomeEvento()))) {
            if (item5.atualizaEstoqueIngresso(eventos.get(4))) {
                pedido2.inserirItensPedido(item5);
            }
        }

        if (eventos.stream().anyMatch(evento -> evento.getNomeEvento().equals(item6.getNomeEvento()))) {
            if (item6.atualizaEstoqueIngresso(eventos.get(0))) {
                pedido2.inserirItensPedido(item6);
            }
        }

        // Atualizando status e calculando total para cada pedido
        pedido1.setStatusPedido(2);
        pedido1.calculaTotalPagar();

        pedido2.setStatusPedido(2);
        pedido2.calculaTotalPagar();

        // Imprimindo resultados
        System.out.println("Pedido 1:");
        System.out.println("Número do Pedido: " + pedido1.getNumeroPedido());
        System.out.println("Data e Hora do Pedido: " + pedido1.getDataHoraPedido());
        System.out.println("Status do Pedido: " + pedido1.getStatusPedido());
        System.out.println("Itens do Pedido:");

        for (PedidoItem item : pedido1.getItensPedido()) {
            System.out.println("- " + item.getNomeEvento() + ": " + item.getQtdeIngresso() + " ingressos");
        }

        System.out.println("Total a pagar: " + pedido1.getPrecoTotal());

        System.out.println("\nPedido 2:");
        System.out.println("Número do Pedido: " + pedido2.getNumeroPedido());
        System.out.println("Data e Hora do Pedido: " + pedido2.getDataHoraPedido());
        System.out.println("Status do Pedido: " + pedido2.getStatusPedido());
        System.out.println("Itens do Pedido:");

        for (PedidoItem item : pedido2.getItensPedido()) {
            System.out.println("- " + item.getNomeEvento() + ": " + item.getQtdeIngresso() + " ingressos");
        }

        System.out.println("Total a pagar: " + pedido2.getPrecoTotal());
    }
}

