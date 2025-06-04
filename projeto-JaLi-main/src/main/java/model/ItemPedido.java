package main.java.model;

public class ItemPedido {
    private Livro livro;
    private int quantidade;

    public ItemPedido(Livro livro, int quantidade){
        this.livro = livro;
        this.quantidade = quantidade;
    }

    public double subTotal(){
        return livro.getPreco() * quantidade;
    }


    
    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
