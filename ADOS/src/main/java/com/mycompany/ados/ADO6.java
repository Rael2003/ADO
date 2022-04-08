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
public class ADO6 {
    public static void main(String[] args){
        System.out.println("*Quiz 2.0*");
        System.out.println("");
        
        Quiz();
        
    }
    
    public static void Quiz(){
        Scanner scan = new Scanner(System.in);
        boolean llValidar = false;
        int lnTentativa = 0;
        do{
            System.out.println("Qual a função no Java para repetição? \n "+
                    "a - do-while\n"
                    +"b - String\n"
                    +"c - switch-case \n"
                    +"d - if-else\n"
                    +"e - try-catch" );
            String lcResp = scan.next();
            switch(lcResp){

                case "a":
                    System.out.println("Resposta correta!");
                    llValidar = true;
                    break;
                    
                default:
                    System.out.println("Resposta incorreta!");
                    lnTentativa++;
                    
            }
            }while(llValidar != true || lnTentativa != 3);
        
        if(llValidar != true && lnTentativa >= 3){
            System.out.println("As tentativas acabaram!");
        }
        }
}
