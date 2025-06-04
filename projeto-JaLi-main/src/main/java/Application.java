package main.java;

import main.java.model.Cliente;
import main.java.model.ItemPedido;
import main.java.model.Livro;
import main.java.model.Pedido;

public class Application {
    public static void main(String[] args) {
        Livro livro1 = new Livro(1, "pipoca", "Paula", 20);
        Livro livro2 = new Livro(2, "banana", "Ana", 10);

        Cliente cliente1 = new Cliente("Thiago");

        Pedido pedido1 = new Pedido (2, cliente1); 
        pedido1.adicionarItem(new ItemPedido(livro1, 2));
        pedido1.adicionarItem(new ItemPedido(livro2, 1));
        pedido1.exibirNota();

    }
}   
