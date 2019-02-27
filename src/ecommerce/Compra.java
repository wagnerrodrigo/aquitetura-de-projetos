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
public class Compra {
    private ConteudoCarrinho carrinho;
    private float comissao;

// construtor
    public Compra(ConteudoCarrinho carrinho, float comissao) {
        this.carrinho = carrinho;
        this.comissao = comissao;
    }
    
// Get e Set
    public ConteudoCarrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(ConteudoCarrinho carrinho) {
        this.carrinho = carrinho;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
// metodos
    public float valorTotal(ConteudoCarrinho carrinho, float comissao){
    return carrinho.getTotalCarrinho() * (1.0f + comissao);
    }
    
    
    
}
