/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ados;

/**
 *
 * @author rael.spaixao1
 */
public class Ado02 {
    public static void main(String[] args){
        
    }
    
    public static float Produto(float lnVALOR1,float lnVALOR2,float lnVALOR3){
        lnVALOR1 = lnVALOR1 + lnVALOR2 + lnVALOR3;
        
        return lnVALOR1;
    }
    
    public static int Multiplicar3(int lnVALOR1){
        lnVALOR1 = lnVALOR1 * 3;
        
        return lnVALOR1;
    }
    
    public static void Tabuada(int lnVALOR1){
        System.out.println("**Tabuadas**");
        if(lnVALOR1 > 10){
            return;
        }

        int total = 0;
        int Repeticao = 0;
        
        do{
            total = total + lnVALOR1;
            System.out.println("* " + total + " *");
            
            Repeticao ++;
        }while(Repeticao != 10);
    }
    
    public static int Tamanho(String Palavra){
        int tamanho = 0;
        
        tamanho = Palavra.length();
        
        return tamanho;
    }
        
}
