/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testeingresso;

/**
 *
 * @author aluno
 */
public class TesteIngresso {

    public static void main(String[] args) {
        Ingresso op = new Ingresso(100);
        IngressoVip ol = new IngressoVip(200);
        
        System.out.println(op.toString() );
        System.out.println(ol.toString());
    }
}
