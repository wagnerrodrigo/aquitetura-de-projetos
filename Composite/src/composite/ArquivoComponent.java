/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author alunoces
 */
public abstract class ArquivoComponent {
    String nomeDoArquivo;
    
    public void printNomeDoArquivo(){
        System.out.println(this.nomeDoArquivo);
    }
    
}
