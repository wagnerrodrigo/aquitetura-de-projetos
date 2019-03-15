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
public class TransFerroviario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vagao vagao1 = new Vagao("1",2000f );
        Vagao vagao2 = new Vagao("2",1000f );
        Vagao vagao3 = new Vagao("3",1500f );
        
        Composicao comp = new Composicao(1);
        
        comp.setVagao(vagao1);
        comp.setVagao(vagao2);
        comp.setVagao(vagao3);
        
        Trem trem = new Trem("NAG-0102", comp);
               
        trem.setData_Formacao("15/03/2019");
        
        System.out.println("Prefixo do trem: " + trem.getPrefixoTrem());
        System.out.println("Data de formação do trem: " + trem.getDataFormacao());
        
        System.out.println(comp.getComposicaoVagao());
        System.out.println("Quantidade de vagões na composição: "+comp.getQuantVagao());
        System.out.println("Peso total da composição: "+comp.getPesoComposicao());
        //System.out.println("Código dp ");
    }
    
}
