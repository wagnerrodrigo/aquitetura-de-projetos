/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author alunoces
 */
public class ConteudoCarrinho {
    List<ItemCarrinho> itemCarrinho = new ArrayList<>();
    List<ItemCarrinho> itens;
    public ConteudoCarrinho() {
    }

    public List<ItemCarrinho> getItemCarrinho() {
        return itemCarrinho;
    }

    public void setItemCarrinho(List<ItemCarrinho> itemCarrinho) {
        this.itemCarrinho = itemCarrinho;
    }
    
    public float getTotalCarrinho(){
        float total = 0;
        
        for (int i = 0; i<=itemCarrinho.size()-1;i++) {
            
            total += itemCarrinho.get(i).getTotalItem();
        }
        
        return total;
    }
}
