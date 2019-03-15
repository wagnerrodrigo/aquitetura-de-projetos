/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferroviario;

/**
 *
 * @author alunoces
 */
public class Trem {
    private String prefixoTrem ;
    private String dataFormacao;
    public Composicao composicao;

    public Trem(String prefixoTrem, Composicao composicao) {
        this.prefixoTrem = prefixoTrem;
        this.composicao = composicao;
    }
    
    public String getPrefixoTrem() {
        return prefixoTrem;
    }

    public String getDataFormacao() {
        return dataFormacao;
    }

    public void setData_Formacao(String dataFormacao) {
        this.dataFormacao = dataFormacao;
    }

    @Override
    public String toString() {
        return "Trem{"
                + "prefixoTrem=" + prefixoTrem 
                + ", dataFormacao=" + dataFormacao 
                + ", comosicao=" + composicao + '}';
    }
    
}
