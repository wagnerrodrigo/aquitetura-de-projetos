/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferroviario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunoces
 */
public class Composicao {

    private int idComposicao;
    private List<Vagao> listaVagao = new ArrayList<>();
    
    // Construtor
    public Composicao(int idComposicao) {
        this.idComposicao = idComposicao;
    }

    
//get set
    public int getIdComposicao() {
        return idComposicao;
    }

    public void setIdComposicao(int idComposicao) {
        this.idComposicao = idComposicao;
    }

    public List<Vagao> getVagao() {
        return listaVagao;
    }

    public void setVagao(Vagao vagao) {
        listaVagao.add(vagao);
   }
// metodos
   
    
    public float getPesoComposicao(){
        float total = 0;
        for (int i = 0; i <=listaVagao.size()-1; i++) {
            total += listaVagao.get(i).getPesoVagao();
        }
        return total; // colocar qual é o valor da composição numeros de vagões
    }
    
    public int getQuantVagao(){         
        return listaVagao.size();
    }
    
    // metodo tostring
    public String getComposicaoVagao(){
    String str = "";    
    str = str + "\nIdComposição: --> "+idComposicao +"\n";
    for (int i = 0; i <=listaVagao.size()-1; i++) {        
        str = str + "Codigo/Peso Vagao - :" + listaVagao.get(i).getCodigoVagao()+"  /  "+ listaVagao.get(i).getPesoVagao()+"\n";
        }
    return str;
    }
}
