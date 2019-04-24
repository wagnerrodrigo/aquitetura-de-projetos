/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosingleton;

/**
 *
 * @author evald
 */
public class AtribuiPessoa {
        
    public void executa(){
     
        SingletonPessoa armazenaPessoa = SingletonPessoa.getInstancia();
        
        Gerente ger = new Gerente();
        ger.setNome("José da Silva");
        
        armazenaPessoa.setListaPessoa(ger);
        
        Gerente ger1 = new Gerente();
        ger1.setNome("Maria Joana");
        
        armazenaPessoa.setListaPessoa(ger1);
        
        Especialista esp = new Especialista();
        esp.setNome("Joao Dória");
        
        armazenaPessoa.setListaPessoa(esp);
        
        Especialista esp1 = new Especialista();
        esp1.setNome("Mariana Novaes");
        
        armazenaPessoa.setListaPessoa(esp1);
    }
    
}
