/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade.exer;

/**
 *
 * @author alunoces
 */
public class FacadeExer {

    /**
     * @param args the command line arguments
     */
   protected SistemaDeAudio audio;
   protected SistemaDeInput input;
   protected SistemaDeVideo video;
   
    
   public void inicializarSubsistema(){
       
       audio = new SistemaDeAudio();
       input = new SistemaDeInput();
       video = new SistemaDeVideo();
       
       
       audio.configurarCanais();
       audio.configurarFrequencia();
       audio.configurarVolume();
       
       input.configurarJoystick();
       input.configurarTeclado();
       
       video.configurarCores();
       video.configurarResolucao();
   
   }
   public void reproduzirAudio(String arquivo) {
       audio.reproduzirAudio(arquivo);
   }
   
   
   public String renderizarImagem(String imagem){
       return video.renderizarImagem(imagem);
   }
   
   public void lerInput(){
      
   }
}
