/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeempregados;

/**
 *
 * @author aluno
 */
public class Vendedor extends Empregado{
    
    private float percentualComissao;

    public Vendedor(float percentualComissao, String nome, float salario) {
        super(nome, salario);
        this.percentualComissao = percentualComissao;
    }

    
    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    public float calcularSalario(){
       float a = getPercentualComissao()/10;
       float b = salario*a;
       return b;
       
      
       
            
    }
    
     public String toString() {  
        return "O nome so empregado é "+getNome()+"\nSálario sem comissão é "+getSalario()+"\nCom comissão é: "+calcularSalario()
             +"\nO percentual da comissão é "+ getPercentualComissao() ;
     
   }
}
