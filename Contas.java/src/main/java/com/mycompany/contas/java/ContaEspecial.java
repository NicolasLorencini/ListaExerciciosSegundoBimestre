/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contas.java;

/**
 *
 * @author aluno
 */
public class ContaEspecial extends ContaBancaria {
    
    private float limite;
    
    public ContaEspecial(float limite, String cliente, int num_conta, float saldo) {
        super(cliente, num_conta, saldo);
        this.limite= limite;
        
        
    }
    
   public void sacarPo(float valor){
    float ool = getSaldo() - valor;
    
    if(ool > this.limite){
        setSaldo(ool);
    }else{
        System.out.println("sem dinheiro");
    }
       
   }
    
}
