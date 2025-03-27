/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author 202208878202
 */
public class Main {

       public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joao", "Rua Exemplo, 123");
        System.out.println(p1.toString());

        Pessoa p2 = p1.cloneDeep();
        p2.setNome("Novo Nome");

        System.out.println(p1.toString()); 
        System.out.println(p2.toString()); 
    }

 
}
