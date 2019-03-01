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
    private List<Vagao> vagao = new ArrayList<>();

//get set
    public int getIdComposicao() {
        return idComposicao;
    }

    public void setIdComposicao(int idComposicao) {
        this.idComposicao = idComposicao;
    }

    public List<Vagao> getVagao() {
        return vagao;
    }

    public void setVagao(List<Vagao> vagao) {
        this.vagao = vagao;
    }
// metodos
    public String getDataFormacao(){
        return ""; // colocar data de formação do vagao
    }
    
    public float getPesoComposicao(){
        return 0; // colocar qual é o valor da composição numeros de vagões
    }
}
