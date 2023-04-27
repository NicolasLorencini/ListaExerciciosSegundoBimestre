/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contas.java;

/**
 *
 * @author aluno
 */
public class ContaPoupanca extends ContaBancaria {
    
    private int diaRendimento;
    
    public ContaPoupanca(int diaRendimento,String cliente, int num_conta, float saldo) {
        super(cliente, num_conta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(float rendimento){
       float ca = (getSaldo() * rendimento);
        System.out.println("A taxa de rendimento da poupança foi de: "+ rendimento +"O saldo atualizado é de: "+ ca );
       
       
       
    }

    
        
    
    
}
