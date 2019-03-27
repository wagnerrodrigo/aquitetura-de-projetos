/*
 * @author Evaldo
 *
 */
package Controller;

import Model.Estudante;
import View.EstudanteView;

public class EstudanteController {
	   private Estudante model;
	   private EstudanteView view;

	   public EstudanteController(Estudante model, EstudanteView view){
	      this.model = model;
	      this.view = view;
	   }

	   public void setNomeEstudante(String nome){
	      model.setNome(nome);		
	   }

	   public String getNomeEstudante(){
	      return model.getNome();		
	   }

	   public void setEstudanteNumeroMatricula(String numeroMatricula){
	      model.setNumeroMatricula(numeroMatricula);		
	   }

	   public String getEstudanteNumeroMatricula(){
	      return model.getNumeroMatricula();		
	   }

	   public void atualizaView(){				
	      view.printDetalheEstudante(model.getNome(), model.getNumeroMatricula());
	   }	
	}