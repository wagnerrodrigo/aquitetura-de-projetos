/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;

/**
 *
 * @author alunoces
 */
public class ArquivoComposite extends ArquivoComponent{
    ArrayList<ArquivoComponent> arquivos = new ArrayList<ArquivoComponent>();
    public ArquivoComposite(String nomeDoArquivo) {
    this.nomeDoArquivo = nomeDoArquivo;
}
    
    @Override
    public void printNomeDoArquivo() {
        System.out.println(this.nomeDoArquivo);
     for (ArquivoComponent arquivoTmp : arquivos) {
        arquivoTmp.printNomeDoArquivo();
    }
  }
    @Override
    public void adicionar(ArquivoComponent novoArquivo) {
        this.arquivos.add(novoArquivo);
    }
    
    public ArquivoComponent getArquivo(String nomeDoArquivo) throws Exception{
        for (ArquivoComponent arquivoTmp : arquivos){
            if(arquivoTmp.getNomeDoArquivo() == nomeDoArquivo){
                return arquivoTmp;
            }
        }
        throw new Exception("Não exites este arquivo");
    }
}



