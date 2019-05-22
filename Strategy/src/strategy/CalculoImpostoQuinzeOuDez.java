/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author alunoces
 */
public class CalculoImpostoQuinzeOuDez {
     double calculaSalarioComImposto(Funcionario umFuncionario){
    if (umFuncionario.salarioBase >= 7500) {
        return umFuncionario.salarioBase * 0.85;
      }  else {
        return umFuncionario.salarioBase * 0.90;
     }
   }
}
