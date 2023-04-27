/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contas.java;

/**
 *
 * @author aluno
 */
public class ContaBancaria {
    private String cliente;
    private int num_conta;
    private float saldo;

    public ContaBancaria(String cliente, int num_conta, float saldo) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void sacar(float valor){
       float aro = getSaldo() - valor;
        setSaldo(aro);
        
        if(saldo>valor){
            System.out.println("O valor sacado foi de: "+valor);
        }
      
        else{
            System.out.println("Voce não tem dinheiro suficiente para sacar");
        }
    }
    
    public void depositar(float valor){
      float aro = getSaldo() + valor;
        setSaldo(aro);
        System.out.println("O valor depositado foi de "+ valor);
}
    
}