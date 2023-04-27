/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testeempregados;

/**
 *
 * @author aluno
 */
public class TesteEmpregados {

    public static void main(String[] args) {
        Empregado lo = new Empregado("Roberto",1900 );
        System.out.println(lo.toString());
        Gerente ol = new Gerente("Relações sociais", "Carlos",2500);
        System.out.println(ol.toString());
        Vendedor ma = new Vendedor (12,"Marcos",3000);
        System.out.println(ma.toString());
        
        
    }
}
