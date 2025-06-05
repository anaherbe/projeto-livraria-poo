package main.java;

import main.java.model.Cliente;
import main.java.model.ItemPedido;
import main.java.model.Livro;
import main.java.model.Pedido;
import main.java.model.Autor;

public class Application {
    public static void main(String[] args) {
        Autor autor1 = new Autor("FulanoDetawn");
        Autor autor2 = new Autor("jojotodinho");

        Livro livro1 = new Livro(0, null, autor1, 0);
        Livro livro2 = new Livro(0, null, autor2, 0);

        Cliente cliente1 = new Cliente("Thiago");

        Pedido pedido1 = new Pedido (2, cliente1); 
        pedido1.adicionarItem(new ItemPedido(livro1, 2));
        pedido1.adicionarItem(new ItemPedido(livro2, 1));
        pedido1.exibirNota();

    }
}   
