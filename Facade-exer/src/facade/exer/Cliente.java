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
public class Cliente {
     public static void main(String[] args) {
        // TODO code application logic here
         FacadeExer facade = new FacadeExer();
         String imagem = "img";
         String audio = "audio";
         
         
         facade.inicializarSubsistema();
         facade.lerInput();
         facade.reproduzirAudio(audio);
         facade.renderizarImagem(imagem);
         
         System.out.println(facade.renderizarImagem(imagem));
    }
    
}
