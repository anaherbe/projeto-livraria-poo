package main.java.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private LocalDate data;

    public Pedido(int id, Cliente cliente){
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.data = LocalDate.now();
        }

    public void adicionarItem(ItemPedido item){
        itens.add(item);
    }

    public double calcularTotal(){
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.subTotal();
        }
        return total;
    }

    public void exibirNota(){
        System.out.println("");
        System.out.println("Pedido do cliente: " + cliente.getNome());
        for (ItemPedido item : itens) {
            System.out.println("- " + item.getLivro().getTitulo()
                            + " | Quantidade: " + item.getQuantidade()
                            + " | Subtotal: R$ " + item.subTotal());
        }
        System.out.println("Total do Pedido: R$ " + calcularTotal());

    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    
}
