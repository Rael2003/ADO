/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ados;

import java.util.Scanner;

/**
 *
 * @author Rael
 */
public class ADO4 {
    
    public static void main(String[] args){
        
        System.out.println("*JOGO*");
        System.out.println("");
        
        Jogo();
        
        
        
    }
    
    public static void Jogo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo!");
        
        int lnResp = 0;
        
        do{
            System.out.println("");
            System.out.println("1 – Instruções\n" +
                                "2 – Jogar\n" +
                                "3 – Créditos\n" +
                                "4 – Sair");
            lnResp = scan.nextInt();
        } while (lnResp != 4);
    }
}
