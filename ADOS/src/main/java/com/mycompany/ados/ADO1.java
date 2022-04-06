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
public class ADO1 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("*PRODUTOS*");
        System.out.println("");
        
        System.out.println("Informe o primeiro número!");
        float lnPROD1 = scan.nextFloat();
        
        System.out.println("Informe o segundo número!");
        float lnPROD2 = scan.nextFloat();

        System.out.println("Informe o terceiro número!");
        float lnPROD3 = scan.nextFloat();
        
        float lnRETORNO = Produto(lnPROD1,lnPROD2,lnPROD3);
        System.out.println("Total é igual a " + lnRETORNO);
        
        System.out.println("");
        System.out.println("*PRÓXIMOS 3*");
        System.out.println("");
        
        System.out.println("Informe um número!");
        int lnPROX = scan.nextInt();
        
        Proximos3(lnPROX);
        
         System.out.println("");
        System.out.println("*TABUADA*");
        System.out.println("");
        
        System.out.println("Informe um número!");
        int lnTABU = scan.nextInt();
        
        Tabuada(lnTABU);
        
        System.out.println("");
        System.out.println("*Número de caracteres*");
        System.out.println("");
        
        System.out.println("Informe um texto!");
        String lcTEXTO = scan.next();
        
        lnRETORNO = Caracter(lcTEXTO);
        System.out.println("Esse texto tem " + lnRETORNO + " Caractere(s)");
    }
    
    public static float Produto(float n1,float n2,float n3){
        float lnTOTAL = n1 * n2 * n3;
        return lnTOTAL;
    }
    
    public static void Proximos3(int ln1){
        int lnTOTAL = ln1;
        int Repeticao = 0;
        
        do{
            System.out.println(Repeticao + " x " + ln1 + " = "+lnTOTAL);
            lnTOTAL += ln1;
            
            Repeticao++;
        }while(Repeticao != 3);
    }
    
     public static void Tabuada(int ln1){
        if(ln1 > 10)
            return;
        
        int lnTOTAL = ln1;
        int Repeticao = 0;
        
        do{
            System.out.println(Repeticao + " x " + ln1 + " = " + lnTOTAL);
            lnTOTAL += ln1;
            
            Repeticao++;
        }while(Repeticao != 10);
    }
    
    
    public static int Caracter(String lcTexto){
        int lnQUANT = lcTexto.length();
        
        return lnQUANT;
    }
}
