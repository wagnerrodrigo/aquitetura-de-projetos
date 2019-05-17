/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author alunoces
 */
public class MenuIterator implements Iterator{

    MenuItem[] itens;
    int posicao = 0;
    
    public MenuIterator(MenuItem[] itens)    {
        this.itens = itens;
    }
    
    public Object next(){
        MenuItem menuItem = itens[posicao];
        posicao++;
        return menuItem;
    }
    
    public boolean hasNext(){
        if (posicao >= itens.length || itens[posicao] == null){
            return false;
        }else{
            return true;
        }
    }
      
    
    
}
