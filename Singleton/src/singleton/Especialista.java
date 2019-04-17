/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author alunoces
 */
public class Especialista {
    public String nomeEspecialidade;
    public String cagoEspecialidade;

    public Especialista(String nomeEspecialidade, String cagoEspecialidade) {
        this.nomeEspecialidade = nomeEspecialidade;
        this.cagoEspecialidade = cagoEspecialidade;
    }
   
    public Especialista() {
    }

    public String getNomeEspecialidade() {
        return nomeEspecialidade;
    }

    public void setNomeEspecialidade(String nomeEspecialidade) {
        this.nomeEspecialidade = nomeEspecialidade;
    }

    public String getCagoEspecialidade() {
        return cagoEspecialidade;
    }

    public void setCagoEspecialidade(String cagoEspecialidade) {
        this.cagoEspecialidade = cagoEspecialidade;
    }
    

    
}
