/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contas.java;

/**
 *
 * @author aluno
 */
public class ContasJava {

    public static void main(String[] args) {
        ContaBancaria a = new ContaBancaria("Jeferson", 587, 5000);
        a.sacar(2000);
        a.depositar(100);
        
        
        ContaPoupanca b = new ContaPoupanca(5, "Roberson", 1558, 1555);
        b.calcularNovoSaldo(2);
        
        ContaEspecial c = new ContaEspecial(6000, "Marcos", 588, 2500);
        c.sacarPo(2000);
    }
}
