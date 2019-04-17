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
public class Gerente {
    public String chaveBanco;
    public String senhaSistema;

    public Gerente(String chaveBanco, String senhaSistema) {
        this.chaveBanco = chaveBanco;
        this.senhaSistema = senhaSistema;
    }

    public Gerente() {
    }

    public String getChaveBanco() {
        return chaveBanco;
    }

    public void setChaveBanco(String chaveBanco) {
        this.chaveBanco = chaveBanco;
    }

    public String getSenhaSistema() {
        return senhaSistema;
    }

    public void setSenhaSistema(String senhaSistema) {
        this.senhaSistema = senhaSistema;
    }
    
    
    
}
