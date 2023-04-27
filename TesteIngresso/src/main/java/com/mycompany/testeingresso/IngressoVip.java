/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeingresso;

/**
 *
 * @author aluno
 */
public class IngressoVip extends Ingresso {
    
    public IngressoVip(float valor) {
        super(valor);
    }
    
    private float valorVip = 200 ;

    public float getvalorVip() {
        return valorVip;
    }

    public void setvalorVip(float valorVip) {
        this.valorVip = valorVip;
    }
     
    
      public String toString() {  
     return "O valor VIP é  "+ (valorVip + super.getValor());
     
   }
}
