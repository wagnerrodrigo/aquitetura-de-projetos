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
public class ExemploSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AtribuiPessoa atribuiPessoa = new AtribuiPessoa();
        atribuiPessoa.executa();
        
        SingletonPessoa armazenaPessoa = SingletonPessoa.getInstancia();
        
        System.out.println(armazenaPessoa.getListaPessoa());
        
    }
    
}
