/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunoces
 */
public class SingletonPessao {
    
    public static SingletonPessao instancia;
    protected SingletonPessao() {
        }
    public static SingletonPessao getInstancia() {
     if (instancia == null)
       instancia = new SingletonPessao ();
    return instancia;
    }
    List<Pessoa> listaPessoa = new ArrayList<>();
    
    public void setlistaPessoa(Pessoa){   
        float listaTotal = 0;
        
        for(int i = 0; i<listaPessoa.size()-1; i++){
            listaTotal += listaPessoa.get(i).getNome();
        }
    }
    
}
