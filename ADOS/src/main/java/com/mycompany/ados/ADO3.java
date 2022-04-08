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
public class ADO3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("*DIA DA SEMANA*");
        System.out.println("");
        
        System.out.println("Infome o número do dia!");
        int lnDia = scan.nextInt();
        System.out.println("");
        
        
        String lcDia = Dia(lnDia);
        System.out.println(lcDia);
        
        System.out.println("");
        System.out.println("*QUIZ*");
        System.out.println("");
        
        System.out.println("Qual a função no Java para repetição?");
        String lcResp = scan.next();
        
        Quiz(lcResp);
    }
    
    public static String Dia(int lnDia){
       switch(lnDia){
           case 1:
               return "Domingo";
           case 2:
               return "Segunda";
           case 3:
               return "Terça";
           case 4:
               return "Quarta";
           case 5:
               return "Quinta";
           case 6:
               return "Sexta";
           case 7:
               return "Sábado";
           default:
               return "";
                     
       }
    }
    
    public static void Quiz(String resp){
        switch(resp.toLowerCase()){
            case "do":
            case "while":
            case "do-while":
            case "do while":
                System.out.println("Resposta correta!");
                break;
            default:
                System.out.println("Resposta incorreta!");
        }
    }
}
