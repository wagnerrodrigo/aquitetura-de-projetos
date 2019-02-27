/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunoces
 */
public class Ecommerce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float totalItem;
        
        List<ItemCarrinho> listaItem = new ArrayList<>();
        
        ItemCarrinho itn1 = new ItemCarrinho(2.0f, 10);
        ItemCarrinho itn2 = new ItemCarrinho(3.0f, 15); 
    
        listaItem.add(itn1);
        listaItem.add(itn2);
        
        ConteudoCarrinho conteudo = new ConteudoCarrinho();
        conteudo.setItemCarrinho(listaItem);
                       
        
    }
       
}
