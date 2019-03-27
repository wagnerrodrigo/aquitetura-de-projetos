/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademic;

import Controller.EstudanteController;
import Model.Estudante;
import View.EstudanteView;

/**
 *
 * @author alunoces
 */
public class SistemaAcademic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Recupera um estudante baseado em sua matr�cula
	    Estudante model  = recuperaEstudanteBaseDeDados();
	
	    //Cria��o de uma vis�o : para escrever os detalhes do estudante no console
	    EstudanteView view = new EstudanteView();
	
	    EstudanteController controller = new EstudanteController(model, view);	
	    controller.atualizaView();
	
	    //atualiza o modelo de dados
	    controller.setEstudanteNumeroMatricula("5");
	    controller.setNomeEstudante("Evaldo");
	
	    controller.atualizaView();
	}
 
	 private static Estudante recuperaEstudanteBaseDeDados(){
	    Estudante estudante = new Estudante();
	    estudante.setNome("Maria");
	    estudante.setNumeroMatricula("15");
	    return estudante;
	 }
    }
   
