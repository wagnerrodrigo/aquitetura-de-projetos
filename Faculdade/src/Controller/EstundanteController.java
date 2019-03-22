/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Estudante;
import View.EstudanteView;
// fazer a inportação da view
/**
 *
 * @author alunoces
 */
public class EstundanteController {
   public Estudante estudante;
   public EstudanteView estudanteView;

   
    public EstundanteController(Estudante model, EstudanteView view) {
    }
    
    
    public void setNomeEstudante(String nome){
        this.estudante.setNome(nome);
    }
    
    public String getNomeEstudante(){
        return estudante.getNome();
    }
    
    public void setEstudanteNumeroMatricula(String numeroMatricula){
        this.estudante.setNumeroMatricula(numeroMatricula);
    }
    
    public String getEstudanteNumeroMatricula(){
        return estudante.getNumeroMatricula();
    }
   
    public void atualizaView(){
        // metedo para atualizar a view
    }
   
    
    
}
