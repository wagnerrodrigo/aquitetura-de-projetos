/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

/**
 *
 * @author alunoces
 */
public class ItemCarrinho {
    public float preco;
    public int quantidade;


//Construtor
     public ItemCarrinho(float preco, int quantidade) {
        this.preco = preco;
        this.quantidade = quantidade;
        
    }
// Get e set
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getTotalItem() {
        return preco * quantidade;
    }

    
}
