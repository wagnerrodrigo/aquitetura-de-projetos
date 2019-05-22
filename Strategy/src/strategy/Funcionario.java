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
public class Funcionario {
    public static final int DESENVOLVEDOR = 1;
    public static final int GERENTE = 2;
    public static final int DBA = 3;
    
    protected double salarioBase;
    protected int cargo;
    protected CalculaImposto estrategiaDeCalculo;

    public Funcionario(double salarioBase, int cargo) {
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }

    public double calculaSalarioComImposto(){
        return 0;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    
    
    
    
}
