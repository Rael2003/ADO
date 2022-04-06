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
public class ADO2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("*COMPRAS*");
        System.out.println("");
        
        System.out.println("Informe o valor da compra");
        float lnTOTALPRECO = scan.nextFloat();
        
        Compras(lnTOTALPRECO);
        
        System.out.println("");
        System.out.println("*Triangulo*");
        System.out.println("");
        
        System.out.println("Informe o valor do primeiro lado");
        float lnTri1 = (float) scan.nextFloat();
        
        System.out.println("Informe o valor do segundo lado");
        float lnTri2 = (float) scan.nextFloat();
        
        System.out.println("Informe o valor do terceiro lado");
        float lnTri3 = (float) scan.nextFloat();
        
        Triangulo(lnTri1,lnTri2,lnTri3);
        
        System.out.println("");
        System.out.println("*ANO BISSEXTO*");
        System.out.println("");
        
        System.out.println("Informe o ano");
        int lnAno = scan.nextInt();
        
        boolean llAno = Anos(lnAno);
        
        if(llAno == true){
            System.out.println("O ano é bissexto!");
        }else{
            System.out.println("O ano não é bissexto!");
        }
    }
    
    public static void Compras(float lnPreco){
        float lnDesconto = 0; 
        
        if(lnPreco < 300.00){
            lnDesconto = (float) 0.85;
        }else{
            lnDesconto = (float) 0.80;
        }
        
        float lnTotal = lnPreco * lnDesconto;
        
        System.out.println("Total = R$" + lnTotal);
    }
    
    public static void Triangulo(float lnTamanho1, float lnTamanho2, float lnTamanho3){
        if(lnTamanho1 <= 0 || lnTamanho2 <= 0 || lnTamanho3 <= 0)
            return;
        
        if(lnTamanho1 == lnTamanho2 && lnTamanho2 == lnTamanho3)
            System.out.println("Equilátero");
        else if(lnTamanho1 == lnTamanho2 || lnTamanho2 == lnTamanho3 || lnTamanho1 == lnTamanho3)
            System.out.println("Isóceles");
        else
            System.out.println("Escaleno");
    }
    
    public static boolean Anos(int lnAnos){
        if(lnAnos % 4 == 0 && lnAnos % 100 != 0 )
            return true;
        else 
            return false;
                       
    }
    
}
