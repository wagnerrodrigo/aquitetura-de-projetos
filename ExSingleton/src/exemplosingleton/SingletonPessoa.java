/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosingleton;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author evald
 */
public class SingletonPessoa {
    
    public static SingletonPessoa instancia;
    public String nome;
    public List<Pessoa> listaPessoa = new ArrayList<>();
    
    protected SingletonPessoa () {
    }
    
    public static SingletonPessoa getInstancia() {
        if (instancia == null)
            instancia = new SingletonPessoa ();
        return instancia;
    }
    
    public void setListaPessoa(Pessoa p){
        listaPessoa.add(p);
    }
    
    public String getListaPessoa(){        
       String nomePessoa="";        
       for (int i = 0; i <=listaPessoa.size()-1; i++) {
           nomePessoa = nomePessoa+ " " + listaPessoa.get(i).getNome();
       }        
       return nomePessoa;
    }
    
}
