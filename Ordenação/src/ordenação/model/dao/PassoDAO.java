package br.com.evaldo.model.dao;

import br.com.evaldo.model.vo.Passo;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author Evaldo de Oliveira
 * @see Classe que executa as operacoes de IO (entrada e saida) do sistema com relacao
 * aos dados resultantes do passo a passo
 */
public class PassoDAO {

    /**
     * Metodo que recebe todos os passos (lista) e salva todos em um arquivo
     * @param passo
     * @throws FileNotFoundException 
     */
    public void salvarPassos(List<Passo> passos) throws FileNotFoundException{
        PrintWriter pw = new PrintWriter("passo.txt");
        for (Passo p : passos){
            pw.print(p);   
        }
        pw.flush();
        pw.close();
    }
}