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
public class Vagao {
    private String codigoVagao;
    private float pesoVagao;

    public Vagao(String codigoVagao, float pesoVagao) {
        this.codigoVagao = codigoVagao;
        this.pesoVagao = pesoVagao;
    }

    public String getCodigoVagao() {
        return codigoVagao;
    }

    public void setCodigoVagao(String codigoVagao) {
        this.codigoVagao = codigoVagao;
    }

    public float getPesoVagao() {
        return pesoVagao;
    }

    public void setPesoVagao(float pesoVagao) {
        this.pesoVagao = pesoVagao;
    }
    
    
    // metodo tostring
    
    public String toString(){
    String str = "";
    str = str + "\nCodigo do Vagão: --> "+codigoVagao;
    str = str + "\nPeso do Vagão: -->"+pesoVagao;   
    return str;
    }
}
