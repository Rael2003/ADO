/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ados;

import java.util.Scanner;

/**
 *
 * @author rael.spaixao1
 */
public class Ado05 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        
        do{
            System.out.println("1 – Instruções\n" +
                "2 – Jogar\n" +
                "3 – Créditos\n" +
                "4 – Sair");
            opcao = scan.nextInt();
            
            switch(opcao){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Obrigado por acessar!");
                    
            }
            
        }while(opcao == 4);  
        
    }
}
